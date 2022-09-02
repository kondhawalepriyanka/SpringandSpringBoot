package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
	@Autowired // to inject object dependency
	private StudentRepository repo;
	
	//Create
	public void create(Student s)
	{
		repo.save(s);
	}
	
	//Retrieve
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//retrieve all the data
	public List<Student>retrieveAll()
	{
		return repo.findAll();
	}
	//
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
