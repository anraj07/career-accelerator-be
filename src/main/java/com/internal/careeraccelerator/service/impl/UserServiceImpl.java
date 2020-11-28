package com.internal.careeraccelerator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.internal.careeraccelerator.dao.UserDao;
import com.internal.careeraccelerator.model.ProjectModel;
import com.internal.careeraccelerator.model.TestimonialModel;
import com.internal.careeraccelerator.model.UserModel;
import com.internal.careeraccelerator.orm.User;
import com.internal.careeraccelerator.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDaoImpl;

	@Override
	public UserModel getUserDetails(long id) {
		List<User> users = (List<User>) userDaoImpl.findAll();
		User user = CollectionUtils.isEmpty(users) ? null : users.get(0);
		return convertToModel(user);
	}

	private UserModel getDummyUser() {
		UserModel userModel = new UserModel();
		userModel.setId(12l);
		userModel.setDesignation("Systems Analyst");
		userModel.setEmail("douglas.mcgee@allianz.com");
		userModel.setGrade("AGS7");
		userModel.setUserName("Douglas Mc-Gee");
		return userModel;
	}

	private UserModel convertToModel(User user) {
		UserModel userModel = new UserModel();
		if (null == user) {
			userModel = getDummyUser();
		} else {
			userModel.setId(user.getId());
			userModel.setDesignation(user.getDesignation());
			userModel.setEmail(user.getEmail());
			userModel.setGrade(user.getGrade());
			userModel.setUserName(user.getName());
		}
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
