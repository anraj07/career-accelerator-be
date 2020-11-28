package com.internal.careeraccelerator.resource;

import org.springframework.web.bind.annotation.RestController;

import com.internal.careeraccelerator.model.TestimonialModel;
import com.internal.careeraccelerator.model.UserModel;
import com.internal.careeraccelerator.service.UserService;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userServiceImpl;

	@GetMapping("/{id}")
	public UserModel getUserDetails(@PathVariable(value = "id") Long id) {
		UserModel userModel = userServiceImpl.getUserDetails(id);
		return userModel;
	}

	@PutMapping("/{byUserId}/testimonial")
	public UserModel addTestimonial(@PathParam(value = "byUserId") long byUserId, @RequestBody TestimonialModel testimonialModel) {
		UserModel userModel = userServiceImpl.addTestimonial(byUserId, testimonialModel);
		return userModel;
	}

	@GetMapping("/{byUserId}/testimonials")
	public List<TestimonialModel> getTestimonials(@PathParam(value = "byUserId") long byUserId) {
		return userServiceImpl.getTestimonials(byUserId);
	}

}