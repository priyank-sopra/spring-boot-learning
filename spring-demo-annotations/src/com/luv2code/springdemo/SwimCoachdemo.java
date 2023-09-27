package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimCoachdemo {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container 
		SwimCoach swimCoach =  classPathXmlApplicationContext.getBean("swimCoach", SwimCoach.class); 
				
		//get daily workout
		System.out.println(swimCoach.getDailyWorkout());
		
		//call daily fortune service
		System.out.println(swimCoach.getDailyFortune());
		
		//call random fortune service
		System.out.println(swimCoach.getRandomFortuneService().getFortune());
		
		//print email 
		System.out.println(swimCoach.getEmail());
		
		//print team info 
		System.out.println(swimCoach.getTeam());
		
		//close the context
		classPathXmlApplicationContext.close();
	}

}
