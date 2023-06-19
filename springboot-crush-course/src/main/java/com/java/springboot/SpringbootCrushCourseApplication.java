package com.java.springboot;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.student.Student;

@SpringBootApplication
@RestController
public class SpringbootCrushCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrushCourseApplication.class, args);
	}
	
	@GetMapping("/")
	public List<Student> hello() {
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
