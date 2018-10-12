package com.local.springwithjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;

	public Student(Long id, String name, String passportNumber) {
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}
}
