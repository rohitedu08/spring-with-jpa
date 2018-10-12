package com.local.springwithjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> optionalStudent = studentRepository.findById(id);

		return optionalStudent.isPresent() ? optionalStudent.get() : null;
	}

}
