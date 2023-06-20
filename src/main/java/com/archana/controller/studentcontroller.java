package com.archana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.archana.model.student.Student;
import com.archana.service.studentservice;

@RestController
public class studentcontroller {
	
	@Autowired
	studentservice ss;
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("roll no") long rn) {
		return ss.getStudent(rn);

}
}
