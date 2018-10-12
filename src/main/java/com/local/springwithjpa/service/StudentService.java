package com.local.springwithjpa.service;

import com.local.springwithjpa.model.Student;

public interface StudentService {
	
	public Student getStudentById(Long id);
	
	public Student getStudentByName(String name);

}
