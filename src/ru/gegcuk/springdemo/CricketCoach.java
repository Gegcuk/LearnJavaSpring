package ru.gegcuk.springdemo;

public class CricketCoach implements Coach {

	private String email;
	private String team;
	
	
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg costructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
