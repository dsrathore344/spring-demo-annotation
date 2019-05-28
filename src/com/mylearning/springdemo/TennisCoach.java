package com.mylearning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") //this is explicitly defined bean id. we can also use default beanId (className with 1st letter small) in main class to get bean
@Component
public class TennisCoach implements Coach {
	
	/*@Autowired		//Field injection
	@Qualifier("RESTFortuneService")*/
	private FortuneService fortuneService;
	
	/*@Autowired		//configure dependency injection with Autowired annotation(Constructor)
	public TennisCoach(@Qualifier("randomFortuneService")  FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	
	
	//define setter method
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}

	
	/*
	//we can use dependency injection on other methods also
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}

*/	
	@Override
	public String getDailyWorkout() {
		return "Practice your Daily backhad Volly";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
