package com.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Person;

@SpringBootTest
public class PersonRepoTest {

	@Autowired
	private PersonRepo pr;
	
	@Test
	void isPersonExistById( ) {
		
		Person person=new Person(18,"Aaron");
		pr.save(person);
		Boolean acRes=pr.isPersonExistById(18);
		assertThat(acRes).isTrue();
		
	}
	
	@BeforeEach
	void SetUp() {
		System.out.println("Setup has started");
	}	
	
	@AfterEach
	void tearDown() {
		System.out.println("Test Ended");
		pr.deleteAll();		
	}

	
}
