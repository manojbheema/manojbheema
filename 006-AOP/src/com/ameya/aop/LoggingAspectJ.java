package com.ameya.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectJ {
	@Pointcut("execution(* com.ameya.models.*.*(..))")
	private void allMethodsPointcut() {}
	
	@Before("allMethodsPointcut()")
	public void beforeAdvice() {
		System.out.println("+++++ Logging Before beforeAdvice() +++++");
	}
	@After("allMethodsPointcut()")
	public void afterAdvice() {
		System.out.println("+++++ Logging After afterAdvice() +++++");
	}
	@AfterReturning(pointcut="allMethodsPointcut()",returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("+++++ Logging After Returning +++++ "+retVal);
	}
	@AfterThrowing(pointcut="allMethodsPointcut()",throwing="ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("+++++ After Throwing +++++ "+ex.toString());
	}
}



