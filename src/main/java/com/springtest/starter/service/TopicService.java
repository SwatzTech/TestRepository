package com.springtest.starter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springtest.starter.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("topic1", "1", "first"),
			new Topic("topic2", "2", "second"),
			new Topic("topic3", "3", "third"))); 
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic topic = null;
		for(Topic t : topics) {
			if(t.getId().equalsIgnoreCase(id) ) {
				topic = t;
				break;
			}
		}
		return topic;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.remove(i);
			}
		}
	}
}
