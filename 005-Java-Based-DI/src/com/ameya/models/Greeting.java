package com.ameya.models;

public class Greeting {
	private String message;
	private TimeOfDay timeOfDay;
	public Greeting() {
		this.message="Hello All Good...";
	}
	public Greeting(TimeOfDay timeOfDay) {
		this.message="Hello All Good...";
		this.timeOfDay=timeOfDay;
	}
	public Greeting(String message) {
		this.message=message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "Greeting [message=" + message + ", timeOfDay=" + timeOfDay + "]";
	}
	
}
