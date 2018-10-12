package com.local.springwithjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.local.springwithjpa.model.Student;
import com.local.springwithjpa.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") Long id) {
		return studentService.getStudentById(id);
	}

	@GetMapping("/students")
	public Student getStudentByName(@RequestParam("name") String name) {
		return studentService.getStudentByName(name);
	}

}
