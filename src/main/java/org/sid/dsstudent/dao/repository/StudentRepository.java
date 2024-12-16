package org.sid.dsstudent.dao.repository;

import org.sid.dsstudent.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(String date);
}
