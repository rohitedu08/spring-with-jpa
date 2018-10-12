package com.local.springwithjpa;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/api")
@RestController
public class SpringWithJpaApplication {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringWithJpaApplication.class, args);
	}

	@GetMapping("/students/{id}")
	public Student getStudentByName(@PathVariable("id") Long id) {
		return studentService.getStudentById(id);
	}

}
