package com.mylearning.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class KabaddiCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.name}")
	private String name;
	
	@Value("${foo.email}")
	private String email;
	
	
	

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public KabaddiCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 100 pushups and then 100 squats!	";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
