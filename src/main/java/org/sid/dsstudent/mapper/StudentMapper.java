package org.sid.dsstudent.mapper;

import org.modelmapper.ModelMapper;
import org.sid.dsstudent.dao.entities.Student;
import org.sid.dsstudent.dto.StudentDTO;

public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDTO studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDTO fromStudent(Student student){
        return mapper.map(student, StudentDTO.class);
    }
}
