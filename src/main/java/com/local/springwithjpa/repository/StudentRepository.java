package com.local.springwithjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.local.springwithjpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public Optional<Student> findByName(String name);

}
