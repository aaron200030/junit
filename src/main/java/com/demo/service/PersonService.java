package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Person;
import com.demo.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;

	public List<Person> getAllPerson() {
		return this.repo.findAll();
	}
	
	//create constructor for testing
	public PersonService(PersonRepo repo) {
		super();
		this.repo=repo;
	}
}
