package ru.gegcuk.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartStuff() {
		System.out.println("TrackCoach: inside init method");
	}
	
	//add a destroy method
	public void doMyCleanUpStaff() {
		System.out.println("TrackCoach: inside destroy method");
	}
}
