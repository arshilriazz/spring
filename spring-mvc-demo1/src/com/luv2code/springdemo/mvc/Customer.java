package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="minimum is 0")
	@Max(value=10, message="maximum is 10")
	private Integer passes;
	
	@Pattern(regexp = "^[0-9]{5}", message="only numbers that too please print 5 numbers")
	private String postalCode;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.com$", message="please enter a valid email")
	private String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getPasses() {
		return passes;
	}
	public void setPasses(Integer passes) {
		this.passes = passes;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
