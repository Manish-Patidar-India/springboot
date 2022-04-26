package com.manishpatidar.springbootproject.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manishpatidar.springbootproject.dao.StudentsRepository;
import com.manishpatidar.springbootproject.entities.Students;



@Service
public class StudentService  {

	@Autowired
	private StudentsRepository repository;
	
	public List<Students> getStudents() {
		
		
		List<Students> list=repository.findAll();
		System.out.println("i am in service class");
		return list;
		
	}
	
	public Students getStudent(int id) {
		
		Optional<Students> optional=repository.findById(id);
		
		
		return optional.get();
	}
	
	public Students createStudents(Students student) {
		
		Students stu=repository.save(student);
		return  stu;
		
	}
	
	public Students updateStudents(Students student, int id )
	{
		
		student.setId(id);
		Students stu=repository.save(student);
		return stu;
	}
	
	public void  removeStudent(int id) {
		
		repository.deleteById(id);
		
		
	}
	
	public void removeAllStudents() {
		
		repository.deleteAll();
	}

	public List<String> getMarksStudent() {
	
		
	List<String> lname=new ArrayList<>();
				
	      List<Students> l=repository.findAll();
		  l.forEach(e->{ if(e.getMarks()>50) { lname.add(e.getName()); } });
		

		  
//		  for knowledge of map
//		List<Integer> l2=  l.stream().map(e->e.getMarks()*5).collect(Collectors.toList());
		  
		  
		  
//		  one more way using filter
			
//			   l.stream().filter(f->f.getMarks()>50).forEach(f->lname.add(f.getName()));
			  
//		upar tum for each ke baad collector laga rhe the jo kis possible nhe hai kyuki for each void return krta hai toh kya collect kroge tum
//yahe difference hai map aur isme map dusre collection mai dal skte hai return krta hai
		
//		   if using query method then we get student object with marks greater than 50
//		  List<Students> l=repository.findByMar(50);
//			l.stream().map(e->lname.add(e.getName())).collect(Collectors.toList());
			
		  
//		   tum ese bhe list bana skte ho
//		 List<Integer> ln= List.of(5, 6, 7,6,8,9,0);

	System.out.println(lname);
		return lname;
}
}
