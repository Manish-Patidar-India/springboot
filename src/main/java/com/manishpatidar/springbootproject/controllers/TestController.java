package com.manishpatidar.springbootproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manishpatidar.springbootproject.entities.Students;
import com.manishpatidar.springbootproject.services.StudentService;

@RestController
public class TestController {

	@Autowired
   private  StudentService service;

	@GetMapping("/students")
	public List<Students> getStu() {

		List<Students> list= this.service.getStudents();
            System.out.println(list);
            return list;
	}
	
	@GetMapping("/students/{id}")
	public Students getStudentById(@PathVariable("id") int id) {
		
		Students student=service.getStudent(id);
		
		return student;
	}
	
	@GetMapping("/students/marks")
	public List<String> getmarks() {
		
		return service.getMarksStudent();
		
		
	}
	
	
	@PostMapping("/students")
	public Students postStudents(@RequestBody Students student) {
		
		Students student1=service.createStudents(student);
		
		return student1;
	}
	
	@PutMapping("/students{id}")
	public Students putStudents(@RequestBody Students student, @PathVariable("id") int id )
	{
		
		Students stu= service.updateStudents(student,id);
		return stu;
		
	}
	
	
	@DeleteMapping("/students")
	public void deleteAllStudents() {
		
		service.removeAllStudents();
	}
	
	
	@DeleteMapping("/students{id}")
	public void deleteStudents(@PathVariable("id") int id) {
		
		service.removeStudent(id);
	}
	
}
