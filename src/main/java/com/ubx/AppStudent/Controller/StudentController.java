package com.ubx.AppStudent.Controller;

import com.ubx.AppStudent.Model.StudentModel;
import com.ubx.AppStudent.Services.StudentService;
import com.zaxxer.hikari.metrics.MetricsTrackerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    StudentService studentService ;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createStudent(@RequestBody final StudentModel student){
        return ResponseEntity.ok(studentService.create(student)) ;
    }

    @GetMapping("/StudentId")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<?> getStudentById(@RequestParam(name = "id_student") Long id){
        return ResponseEntity.ok(this.studentService.getStudentById(id));
    }

    @GetMapping("/AllStudent")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<?> getAllStudents(){
        return ResponseEntity.ok(this.studentService.getAllStudents());
    }
}
