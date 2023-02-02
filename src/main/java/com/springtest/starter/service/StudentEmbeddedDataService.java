package com.springtest.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtest.starter.model.Student;
import com.springtest.starter.repository.StudentRepository;

@Service
public class StudentEmbeddedDataService {


	@Autowired
	private StudentRepository dao;
	
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		Iterable<Student> itr = dao.findAll();
		itr.forEach(students :: add);
		return students;
	}

	public Student getStudentById(String id) { 
		Student student = null;
		try {
			student = dao.findById(id).get();
		} catch (NoSuchElementException e) {
			System.out.println("No student with id " + id + " exists.");
		}
		return student;
	}

	public void addTopic(Student student) { 
		dao.save(student);
	}

	public void updateTopic(Student student, String id) { 
		if(dao.findById(id).isPresent()) {
			dao.save(student);
		}
	}

	public void deleteTopic(String id) {
		dao.deleteById(id);
	}
}
