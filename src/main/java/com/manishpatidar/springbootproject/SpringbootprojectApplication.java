package com.manishpatidar.springbootproject;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.manishpatidar.springbootproject.dao.StudentsRepository;
import com.manishpatidar.springbootproject.entities.Students;



@SpringBootApplication
public class SpringbootprojectApplication {
	
	

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootprojectApplication.class, args);
		/*
		 * StudentsRepository repository=context.getBean(StudentsRepository.class);
		 * Students student=new Students();
		 * 
		 * 
		 * 
		 * 
		 * student.setId(2); student.setName("Rahul"); student.setMarks(45);
		 * student.setSubjectCode(03);
		 * 
		 * Students stu=repository.save(student);
		 * 
		 * System.out.println(stu);
		 */
}
}
