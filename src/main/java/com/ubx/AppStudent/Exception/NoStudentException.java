package com.ubx.AppStudent.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NoStudentException  extends ResponseStatusException {
    public NoStudentException() {
        super(HttpStatus.NO_CONTENT,"No Student found");
    }
}
