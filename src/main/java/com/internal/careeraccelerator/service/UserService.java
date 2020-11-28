package com.internal.careeraccelerator.service;

import java.util.List;

import com.internal.careeraccelerator.model.TestimonialModel;
import com.internal.careeraccelerator.model.UserModel;

public interface UserService {

	UserModel getUserDetails(long id);

	UserModel addTestimonial(long byEmailId, TestimonialModel testimonialModel);

	List<TestimonialModel> getTestimonials(long emailId);
}
