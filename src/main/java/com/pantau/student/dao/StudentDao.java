package com.pantau.student.dao;

import org.springframework.data.repository.CrudRepository;

import com.pantau.model.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {

}
