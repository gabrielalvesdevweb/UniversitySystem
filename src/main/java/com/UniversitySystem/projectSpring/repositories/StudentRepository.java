package com.UniversitySystem.projectSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.UniversitySystem.projectSpring.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> , CrudRepository<Student, Long>{
	
}
