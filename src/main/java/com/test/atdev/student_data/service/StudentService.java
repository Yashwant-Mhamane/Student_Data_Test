package com.test.atdev.student_data.service;

import com.test.atdev.student_data.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student addStudent(Student student);

    boolean updateStudentDetails(Student updatedStudent, Integer studentId) throws Exception;

    boolean deleteStudent(Integer studentId);

}
