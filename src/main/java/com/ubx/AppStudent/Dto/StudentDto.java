package com.ubx.AppStudent.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private String firstName;
    private String lastName;

    private int age;

    private String placeBirth;

}
