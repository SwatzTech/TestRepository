package com.springtest.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.starter.model.Topic;
import com.springtest.starter.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService service;
	
	// Get all Topic resources
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List<Topic> topics = service.getAllTopics();
		return topics;
	}
	
	// Get a particular Topic resource corresponding to an id
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		Topic topic = service.getTopic(id);
		return topic;
	}
	
	// Create a new Topic resource
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		service.addTopic(topic);
	}
	
	// Update an existing Topic resource
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
		service.updateTopic(topic, id);
	}
	
	// Delete a Topic Resource
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		service.deleteTopic(id);
	}
}
