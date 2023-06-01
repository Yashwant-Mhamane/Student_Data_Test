package com.test.atdev.student_data.controller;

import com.test.atdev.student_data.domain.Student;
import com.test.atdev.student_data.exception.StudentNotFoundException;
import com.test.atdev.student_data.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
  private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/get")
    public ResponseEntity<?> getAllStudents() throws StudentNotFoundException {
        List<Student> studentList = studentService.getAllStudents();
        if (studentList.isEmpty()) {
            return new ResponseEntity<>("Empty Database.",HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(studentList, HttpStatus.FOUND);
        }
    }

}
