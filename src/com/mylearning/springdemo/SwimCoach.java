package com.mylearning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//@Value("devendra.rathore@mphasis.com")
	@Value("${foo.email}")
	private String email;
	
	//@Value("Devendra Singh Rathore")
	@Value("${foo.name}")
	private String name;
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim for 30 minitus";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
