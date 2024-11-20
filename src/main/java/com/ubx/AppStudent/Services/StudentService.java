package com.ubx.AppStudent.Services;

import ch.qos.logback.classic.spi.IThrowableProxy;
import com.ubx.AppStudent.Dto.StudentDto;
import com.ubx.AppStudent.Exception.NoStudentException;
import com.ubx.AppStudent.Mapper.MapperStudent;
import com.ubx.AppStudent.Model.StudentModel;
import com.ubx.AppStudent.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    MapperStudent mapperStudent ;

    public StudentModel create(StudentModel student) {
        return this.studentRepository.save(student);
    }

    public StudentDto getStudentById(Long id) {
        StudentModel studentModel = this.studentRepository.findById(id).orElseThrow(() -> new NoStudentException());
        StudentDto studentDto = mapperStudent.toDto(studentModel);
        return studentDto;
    }

    public List<StudentDto> getAllStudents(){
        List<StudentModel> allStudent = this.studentRepository.findAll();

        List<StudentDto> studentDtos = mapperStudent.toListDto(allStudent);

        return studentDtos;

    }

}
