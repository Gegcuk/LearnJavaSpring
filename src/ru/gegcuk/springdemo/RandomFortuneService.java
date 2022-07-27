package ru.gegcuk.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String[] setOfFortunes = {"Today is your lucky day!", "Today is not your lucky day", "Your lucky day was yesterday"};
		
		return setOfFortunes[(int)Math.floor(Math.random() * 3)];
	}

}
