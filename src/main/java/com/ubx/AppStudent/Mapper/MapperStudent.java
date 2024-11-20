package com.ubx.AppStudent.Mapper;

import com.ubx.AppStudent.Dto.StudentDto;
import com.ubx.AppStudent.Model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MapperStudent {
    public StudentDto toDto(StudentModel studentModel){
        StudentDto studentDto =  new StudentDto();
        studentDto.setFirstName(studentModel.getFirstName());
        studentDto.setLastName(studentModel.getLastName());
        studentDto.setAge(studentModel.getAge());
        studentDto.setPlaceBirth(studentModel.getPlaceBirth());

        return studentDto;
    }

    public List<StudentDto> toListDto(List<StudentModel> allStudent) {
        List<StudentDto> studentDtos = new ArrayList<>();
        return allStudent.stream().map(this::toDto).collect(Collectors.toList());
    }
}
