package com.example.courses.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.courses.intercom.StudentClient;
import com.example.courses.model.Courses;
import com.example.courses.model.Student;
import com.example.courses.repository.Coursesrepository;

@RestController

public class CourseController {
    @Autowired
    Coursesrepository repository;
    
    @Autowired
    StudentClient studClient;

    @GetMapping("/view")
    public List<Courses> getCourses() {
        return repository.findAll();
    }

    @GetMapping("/service/stud/{studId}")
    public Student getStud(@PathVariable int studId) {
    	return studClient.getStudent(studId);
    }
    
    @GetMapping("/courses/find/{id}")
    
    public Courses getCourseById(@PathVariable("id")int id)
    {
    	Optional<Courses> cou=Courses.findById(id);
	
    	if(cou.isPresent()) {
    		return cou.get();
}
    	else	{
    		return null;
    	}
    	
        
  
    }
}
