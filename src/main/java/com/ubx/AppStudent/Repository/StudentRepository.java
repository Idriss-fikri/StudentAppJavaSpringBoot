package com.ubx.AppStudent.Repository;

import com.ubx.AppStudent.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel ,Long> {

    Optional<StudentModel> findById(Long id);

}
