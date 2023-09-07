package com.example.courses.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courses.model.Courses;

public interface Coursesrepository extends JpaRepository<Courses,Integer>{

}
