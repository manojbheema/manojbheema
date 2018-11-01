package com.ameya.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {
	public void beforeAdvice() {
		System.out.println("+++++ Logging Before beforeAdvice() +++++");
	}
	public void afterAdvice() {
		System.out.println("+++++ Logging After afterAdvice() +++++");
	}
	public void afterReturningAdvice(Object retVal) {
		System.out.println("+++++ Logging After Returning +++++ "+retVal);
	}
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("+++++ After Throwing +++++ "+ex.toString());
	}
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
		Object object=null;
		System.out.println("++++ Around Advice Before "+joinPoint.getSignature());
		try {
			object=joinPoint.proceed();
			System.out.println("++++ Around Advice After "+joinPoint.getSignature());
		}catch(Throwable e) {
			throw new IllegalArgumentException();
		}
		return object;
	}
}
