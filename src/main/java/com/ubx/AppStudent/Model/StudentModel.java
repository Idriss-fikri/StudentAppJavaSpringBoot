package com.ubx.AppStudent.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id ;
    @Column(name = "firstname")
    @NotNull
    private String firstName;
    @Column(name = "lastname")
    @NotNull
    private String lastName ;
    @Column(name = "age")
    @NotNull
    private int age ;

    @Column(name = "placebirth")
    private String placeBirth;

}
