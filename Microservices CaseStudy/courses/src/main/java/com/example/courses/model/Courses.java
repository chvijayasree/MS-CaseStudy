package com.example.courses.model;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;
    private String courseName;
    private String instructor;
    private int durationInHours;

   
    public Courses() {
    }

    public Courses(String courseName, String instructor, int durationInHours) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.durationInHours = durationInHours;
    }
    public Long getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

   
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

	public static Optional<Courses> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
