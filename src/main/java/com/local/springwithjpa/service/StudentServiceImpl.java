package com.local.springwithjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.springwithjpa.model.Student;
import com.local.springwithjpa.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudentById(Long id) {
		Optional<Student> optionalStudent = studentRepository.findById(id);

		return optionalStudent.isPresent() ? optionalStudent.get() : null;
	}

	@Override
	public Student getStudentByName(String name) {
		Optional<Student> optionalStudent = studentRepository.findByName(name);

		return optionalStudent.isPresent() ? optionalStudent.get() : null;
	}

}
