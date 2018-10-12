package com.local.springwithjpa.repository;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.local.springwithjpa.model.Student;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StudentRepositoryIntegrationTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void whenFindByName_thenReturnStudent() {

		Student jhon = new Student("ra", "123");

		entityManager.persist(jhon);

		Optional<Student> found = studentRepository.findByName("ra");
		System.out.println("Size is   "+  studentRepository.findAll().size());
		Assert.assertTrue(found.isPresent());
		Assert.assertEquals(found.get().getName(), jhon.getName());

	}

}
