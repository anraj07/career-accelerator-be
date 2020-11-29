package com.internal.careeraccelerator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.internal.careeraccelerator.model.ProjectModel;
import com.internal.careeraccelerator.model.TestimonialModel;
import com.internal.careeraccelerator.model.UserModel;
import com.internal.careeraccelerator.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserModel getUserDetails(long id) {
		return getDummyUser();
	}

	private UserModel getDummyUser() {
		UserModel userModel = new UserModel();
		userModel.setId(12l);
		userModel.setDesignation("Systems Analyst");
		userModel.setEmail("douglas.mcgee@allianz.com");
		userModel.setGrade("AGS7");
		userModel.setUserName("Douglas McGee");
		List<ProjectModel> projectDetails = new ArrayList<>();
		ProjectModel project1 = new ProjectModel();
		project1.setId(122);
		project1.setProjectLead("Andrea Lilly");
		project1.setProjectName("ReInsurance Data Centre");
		project1.setDescription(
				"The project is a strategic project in Allianz Re, which controls the Reinsurance operations end to end.");
		project1.setCustomerDetails("Allianz Re");
		project1.setEmployeeCount(12l);
		project1.setOeName("OEP");
		projectDetails.add(project1);
		ProjectModel project2 = new ProjectModel();
		project2.setId(121);
		project2.setProjectLead("Martin Grassl");
		project2.setProjectName("IT Internal");
		project2.setDescription(
				"The project is an internal project in Allianz Technology, which serves as the data controller for HR operations.");
		project2.setCustomerDetails("Allianz Technology");
		project2.setEmployeeCount(3l);
		project2.setOeName("HRT");
		projectDetails.add(project2);
		userModel.setProjectDetails(projectDetails);
		return userModel;
	}

	@Override
	public UserModel addTestimonial(long byEmailId, TestimonialModel testimonialModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestimonialModel> getTestimonials(long emailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
