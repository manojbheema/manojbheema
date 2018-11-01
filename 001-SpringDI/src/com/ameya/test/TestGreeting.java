package com.ameya.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.models.Greeting;

public class TestGreeting {

	public static void main(String[] args) {
		
		/* Standard Java Approach */
//		Greeting greeting1=new Greeting();
//		greeting1.setMessage("Hello All....Welcome To Spring !!");
//		Greeting greeting2=new Greeting("Good Morning...Welcome To Spring !!");
//		System.out.println(greeting1);
//		System.out.println(greeting2);
		
		/*Spring DI Approach */
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Greeting greeting3=(Greeting)ctx.getBean("greeting3");
		Greeting greeting4=(Greeting)ctx.getBean("greeting4");
		System.out.println(greeting3);
		System.out.println(greeting4);
		ctx.registerShutdownHook();
		//System.out.println(greeting4);
		/*Greeting greeting5=(Greeting)ctx.getBean("greeting5");
		System.out.println(greeting5);
		Greeting greeting6=(Greeting)ctx.getBean("greeting6");
		System.out.println(greeting6);*/
		/*
		ApplicationContext context=new ClassPathXmlApplicationContext(
				new String[] {"dao.xml","services.xml","facades.xml"}
				);
		*/
	}

}




