package com.github.fac30ff.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.github.fac30ff.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfiguration {
	@Bean
	//name of a method will be an bean id
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
		return new SwimCoach(sadFortuneService());
	}
}
