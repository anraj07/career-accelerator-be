package com.internal.careeraccelerator.model;

import java.io.Serializable;

public class TestimonialModel implements Serializable{

	private static final long serialVersionUID = -766532337310514492L;
	
	private long id;
	private String byEmail;
	private String email;
	private String testimonial;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getByEmail() {
		return byEmail;
	}
	public void setByEmail(String byEmail) {
		this.byEmail = byEmail;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTestimonial() {
		return testimonial;
	}
	public void setTestimonial(String testimonial) {
		this.testimonial = testimonial;
	}
}
