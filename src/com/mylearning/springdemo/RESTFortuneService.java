package com.mylearning.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "this is RESTFortuneService";
	}

}
