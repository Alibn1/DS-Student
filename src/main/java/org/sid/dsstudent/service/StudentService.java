package org.sid.dsstudent.service;

import org.sid.dsstudent.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    public StudentDTO saveStudent(StudentDTO studentDTO);
    public List<StudentDTO> getStudentByDateNaissance(String date);
}
