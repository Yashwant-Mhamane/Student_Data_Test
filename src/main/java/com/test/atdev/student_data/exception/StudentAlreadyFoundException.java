package com.test.atdev.student_data.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Student Already Exists")
public class StudentAlreadyFoundException extends Exception {
    public StudentAlreadyFoundException(String message) {
        super(message);
    }
}
