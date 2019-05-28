package com.mylearning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		//Coach theCoach = context.getBean("swimCoach", Coach.class);  // using default beanId 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);  // using default beanId
		
		//call method on that bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getName());
		//close the context
		context.close();
	}

}
