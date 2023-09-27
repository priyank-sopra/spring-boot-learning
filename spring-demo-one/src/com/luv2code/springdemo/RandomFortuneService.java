package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	public String[] fortuneList = new String[] {"Go for it !!!", "Best of Luck !!!", "Today is your lucky day !"};

	@Override
	public String getFortune() {
		int rnd = new Random().nextInt(fortuneList.length);
		return fortuneList[rnd];
	}

}
