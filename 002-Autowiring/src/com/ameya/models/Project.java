package com.ameya.models;

public class Project {
	private String projectName;
	private String noOfDays;
	public Project() {}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getNoOfDays() {
		return noOfDays;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", noOfDays=" + noOfDays + "]";
	}
	
}
