package com.ubx.AppStudent.Services;

import ch.qos.logback.classic.spi.IThrowableProxy;
import com.ubx.AppStudent.Exception.NoStudentException;
import com.ubx.AppStudent.Model.StudentModel;
import com.ubx.AppStudent.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public StudentModel create(StudentModel student) {
        return this.studentRepository.save(student);
    }

    public StudentModel getStudentById(Long id) {
        StudentModel studentModel = this.studentRepository.findById(id).orElseThrow(() -> new NoStudentException());
        return  studentModel;
    }

}
