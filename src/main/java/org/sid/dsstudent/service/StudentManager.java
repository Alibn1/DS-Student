package org.sid.dsstudent.service;

import org.sid.dsstudent.dao.repository.StudentRepository;
import org.sid.dsstudent.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentManager implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMapper studentMapper;
}
