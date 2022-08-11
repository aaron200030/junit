package com.demo.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.repo.PersonRepo;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@Mock
	private PersonRepo pr;
	
	private PersonService ps;
	
	@BeforeEach
	void SetUp() {
		this.ps=new PersonService(this.pr);
		
	}
	
	@Test
	void getAllPerson() {
		
		ps.getAllPerson();
		verify(pr).findAll();
	}

	
}
