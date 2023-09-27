package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService ;
	
	//add new fields for email address and team
	private String team;
	private String emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	//our setter method
	public void setFortuneService(FortuneService fortuneService) {		
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
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
