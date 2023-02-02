package com.springtest.starter.repository;

import org.springframework.data.repository.CrudRepository;

import com.springtest.starter.model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{

}
