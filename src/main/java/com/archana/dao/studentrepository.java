package com.archana.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archana.model.student.Student;

@Repository
public interface studentrepository extends CrudRepository <Student, Long> {
}


