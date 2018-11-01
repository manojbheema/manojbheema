package com.ameya.models;

public class TimeOfDay {
	private String partOfDay;
	public TimeOfDay(String partOfDay) {
		this.partOfDay=partOfDay;
	}
	public void setPartOfDay(String partOfDay) {
		this.partOfDay = partOfDay;
	}
	public String getPartOfDay() {
		return partOfDay;
	}
	@Override
	public String toString() {
		return " : " + partOfDay;
	}
	
}
