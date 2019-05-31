package com.mylearning.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.mylearning.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for sed fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	} 
	
	//define bean for our swim coach and inject the dependency
	@Bean
	public Coach kabaddiCoach() {
		return new KabaddiCoach(sadFortuneService());
	}
	
	
}
