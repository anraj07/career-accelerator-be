package com.internal.careeraccelerator.model;

import java.io.Serializable;
import java.util.List;

public class UserModel implements Serializable{

	private static final long serialVersionUID = -766532337310514492L;
	
	private long id;
	private String userName;
	private String email;
	private String grade;
	private String designation;
	private List<ProjectModel> projectDetails;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<ProjectModel> getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(List<ProjectModel> projectDetails) {
		this.projectDetails = projectDetails;
	}
}
