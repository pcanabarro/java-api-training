package com.pcanabarro.spring.project.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcanabarro.spring.project.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> { }
