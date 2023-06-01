package com.test.atdev.student_data.controller;

import com.test.atdev.student_data.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
}
