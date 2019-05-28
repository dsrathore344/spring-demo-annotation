package com.mylearning.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"My name is Devende Singh Rathore",
			"I am woking in Mphasis ltd in Banglore", 
			"My home town is Jaipur Rajasthan"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	//create  an array  of String 
	@Override
	public String getFortune() {
		
		//pick random fortune from array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
