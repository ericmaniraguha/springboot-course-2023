package com.java.springboot.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentService {
     
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
