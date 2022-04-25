package com.manishpatidar.springbootproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manishpatidar.springbootproject.dao.StudentsRepository;
import com.manishpatidar.springbootproject.entities.Students;



@Service
public class StudentService {

	@Autowired
	StudentsRepository repository;
	
	public List<Students> getStudents() {
		
		
		List<Students> list=repository.findAll();
		System.out.println("i am in service class");
		return list;
		
	}
	
}
