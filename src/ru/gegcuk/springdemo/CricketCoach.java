package ru.gegcuk.springdemo;

public class CricketCoach implements Coach {

	private String email;
	private String team;
	
	
	
	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = email;
		
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg costructor");
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
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
