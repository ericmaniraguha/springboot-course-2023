package com.java.springboot.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    
	@GetMapping()
	public List<Student> getStudents() {
		return List.of(
				new Student(
						1L,
						"Carla O.",
						"carla@gmail.com",	
						LocalDate.of(2000, 1, 5),
						21
				)
		);
	}
}
