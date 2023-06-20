package com.archana.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class student {

	@Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class Student {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long rollno;
		private String firstName;
		private String lastName;
		private String address;
		
	}
}
