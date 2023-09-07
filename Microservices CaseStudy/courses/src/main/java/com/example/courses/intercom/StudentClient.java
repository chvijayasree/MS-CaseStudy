package com.example.courses.intercom;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.courses.model.Student;

@FeignClient(name="Student",url="https://localhost:8081")
public interface StudentClient {
	@PostMapping(value="/home/student/find",consumes ="application/json")
	Student getStudent(@RequestBody int StudId);
	

}
