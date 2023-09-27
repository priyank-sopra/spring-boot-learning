package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
	
	//define my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(".. TennisCoach: inside default constructor");
		}
	
	/*
	 * //@Autowired 
	 * public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	//define a setter method
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(".. TennisCoach: inside setFortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(".. TennisCoach: inside doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("tennisCoach: inside of doMyCleanupStuff()");
	}

}
