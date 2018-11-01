package com.ameya.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
//@Import(SomeOtherConfig.class)
//@ImportResource()
public class GreetingConfiguration {
	
	@Bean(name="greeting1")
	//@Scope("prototype")
	//@Bean(name="greeting1",initMethod="init",destroyMethod="destroy")
	public Greeting getGreeting() {
		return new Greeting(getTimeOfDay());
	}
	@Bean
	public TimeOfDay getTimeOfDay() {
		return new TimeOfDay("Morning !");
	}
}
