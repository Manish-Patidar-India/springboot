package com.manishpatidar.springbootproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.manishpatidar.springbootproject.entities.Students;
import com.manishpatidar.springbootproject.services.StudentService;

@RestController
public class TestController {

	@Autowired
	StudentService service;

	@GetMapping("/students")
	public List<Students> getStu() {

		
		
		List<Students> list= this.service.getStudents();
            System.out.println(list);
            return list;
	}
}
