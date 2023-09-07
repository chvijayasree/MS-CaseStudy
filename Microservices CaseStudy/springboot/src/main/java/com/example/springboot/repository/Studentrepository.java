package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Student;

public interface Studentrepository extends JpaRepository<Student, Integer> {

}
