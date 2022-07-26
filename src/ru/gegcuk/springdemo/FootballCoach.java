package ru.gegcuk.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach() {
		
	}
	
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shot 25 freekicks";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
