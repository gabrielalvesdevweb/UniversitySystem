package com.UniversitySystem.projectSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UniversitySystem.projectSpring.entities.Student;
import com.UniversitySystem.projectSpring.repositories.StudentRepository;



@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@GetMapping
	public List<Student> findAllStudents(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Student findStudentById(@PathVariable long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Student insertStudent(@RequestBody Student student) {
		return repository.save(student);
		
	}
	
	@GetMapping(value = "/delete/{id}")
	public List<Student>  deleteStudent(@PathVariable long id){
		repository.deleteById(id);
		return findAllStudents();
	}
	
	
	
	
}





