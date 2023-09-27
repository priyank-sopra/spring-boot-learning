package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class SwimCoach implements Coach {
	
	
	@Value("${foo.email}")
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Value("${foo.team}")
	private String team;
	
	@Autowired
	private RandomFortuneService randomFortuneService;

	public RandomFortuneService getRandomFortuneService() {
		return randomFortuneService;
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice butterfly strokes for 30 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
    public FortuneService fortuneService;
  
	public SwimCoach(FortuneService fortuneService2){
		fortuneService = fortuneService2;
	}

}
