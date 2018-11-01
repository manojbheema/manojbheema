package com.ameya.models;

public class Greeting {
	private String message;
	public Greeting() {}
	public Greeting(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Greeting [message=" + message + "] hashcode : "+this.hashCode();
	}
	public void init() {
		System.out.println("-----Bean is being initialized ----");
	}
	public void destroy() {
		System.out.println("-----Bean is about to be destroyed----");
	}
}
