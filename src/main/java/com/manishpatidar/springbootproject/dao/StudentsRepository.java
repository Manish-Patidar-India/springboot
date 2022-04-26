package com.manishpatidar.springbootproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.manishpatidar.springbootproject.entities.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

	
//	
//	@Query(value="select * from Students where marks > :a" , nativeQuery = true)
//	public List< Students> findByMar(@Param("a") int markss);
	
//	public List< Students> findByMarksGreaterThan(Integer markss);
	
	
}
