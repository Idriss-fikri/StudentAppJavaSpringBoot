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
@Table(name = "studentTable")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id ;
    @Column
    @NotNull
    private String firstName;
    @Column
    @NotNull
    private String lastName ;
    @Column
    @NotNull
    private int age ;
    @Column
    @NotNull
    private  String PlaceBirth ;

}
