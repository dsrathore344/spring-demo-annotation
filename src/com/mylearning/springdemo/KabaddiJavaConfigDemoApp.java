package com.mylearning.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KabaddiJavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		KabaddiCoach theCoach = context.getBean("kabaddiCoach", KabaddiCoach.class);
		//Coach theCoach = context.getBean("swimCoach", Coach.class);  // using default beanId 
		//SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);  // using default beanId
		
		//call method on that bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getName());
		
		//close the context
		context.close();
	}

}
