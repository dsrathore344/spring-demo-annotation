package com.mylearning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") //this is explicitly defined bean id. we can also use default beanId (className with 1st letter small) in main class to get bean
@Component
public class TennisCoach implements Coach {
	
	@Autowired		//Field injection
	private FortuneService fortuneService;
	
	/*@Autowired		//configure dependency injection with Autowired annotation
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	/*
	//define setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
*/
	
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
