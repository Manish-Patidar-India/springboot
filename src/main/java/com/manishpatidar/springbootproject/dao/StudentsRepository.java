package com.manishpatidar.springbootproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manishpatidar.springbootproject.entities.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

	
}