package com.internal.careeraccelerator.model;

import java.io.Serializable;

public class ProjectModel implements Serializable{
	
	private static final long serialVersionUID = 6061689156065364634L;
	
	private long id;
	private String projectName;
	private long employeeCount;
	private String Description;
	private String projectLead;
	private String oeName;
	private String customerDetails;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public long getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(long employeeCount) {
		this.employeeCount = employeeCount;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getProjectLead() {
		return projectLead;
	}
	public void setProjectLead(String projectLead) {
		this.projectLead = projectLead;
	}
	public String getOeName() {
		return oeName;
	}
	public void setOeName(String oeName) {
		this.oeName = oeName;
	}
	public String getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(String customerDetails) {
		this.customerDetails = customerDetails;
	}
}
