package com.example.courses.model;

import javax.persistence.Column;

public class Student {
	
	private int studId;
	private String studName;
	@Column(name="stud_grade")
	private String grade;
	private int age;
	
	public Student() {}
	public Student(int studId, String studName, String grade, int age) {
		super();
		this.studId=studId;
		this.studName=studName;
		this.grade=grade;
		this.age=age;
		// TODO Auto-generated constructor stub
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
