package com.archana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archana.dao.studentrepository;
import com.archana.model.student.Student;

@Service
public class studentservice {
	
	@Autowired
	studentrepository sr;
	
	public Student getStudent(long rn) {
		return sr.findById (rn).get();
	}

}
