package com.example.demo.app.survey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyForm {
	@NotNull
	@Min(1)
	@Max(150)
	private int age;
	
	@NotNull
	@Max(5)
	private String satisfaction;
	
	@NotNull
	@Size(min = 1, max = 200, message="Please input 200 characters or less")
	private String comment;
	
	public SurveyForm() {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
