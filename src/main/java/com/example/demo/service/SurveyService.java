package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Survey;

//test
public interface SurveyService {
	void save(Survey survey);
	List<Survey> getAll();
}
