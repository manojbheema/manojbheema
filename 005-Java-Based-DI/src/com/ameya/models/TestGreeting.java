package com.ameya.models;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestGreeting {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new 
				AnnotationConfigApplicationContext(GreetingConfiguration.class);
		//Greeting greeting=(Greeting)ctx.getBean(Greeting.class);
		Greeting greeting=(Greeting)ctx.getBean("greeting1");
		System.out.println(greeting);
		
		/*AnnotationConfigApplicationContext context=new
				AnnotationConfigApplicationContext();
		context.register(GreetingConfiguration.class,SomeOtherConfig.class);
		context.register(AdditionalConfig.class);
		context.refresh();
*/
	}

}
