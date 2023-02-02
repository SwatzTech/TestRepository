package com.springtest.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.starter.model.Student;
import com.springtest.starter.service.StudentEmbeddedDataService;

@RestController
public class StudentController {

	@Autowired
	private StudentEmbeddedDataService service;
	
	// Get all Student resources
	@RequestMapping("/students")
	public List<Student> getAllTopics() {
		List<Student> topics = service.getAllStudents();
		return topics;
	}
	
	// Get a particular Student resource corresponding to an id
	@RequestMapping("/students/{id}")
	public Student getTopic(@PathVariable String id) {
		Student topic = service.getStudentById(id);
		return topic;
	}
	
	// Create a new Student resource
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addTopic(@RequestBody Student topic) {
		service.addTopic(topic);
	}
	
	// Update an existing Student resource
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Student topic) {
		service.updateTopic(topic, id);
	}
	
	// Delete a Student Resource
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
	public void deleteTopic(@PathVariable String id) {
		service.deleteTopic(id);
	}
}
