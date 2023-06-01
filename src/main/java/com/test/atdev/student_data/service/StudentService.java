package com.test.atdev.student_data.service;

import com.test.atdev.student_data.domain.Student;
import com.test.atdev.student_data.exception.StudentNotFoundException;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents() throws StudentNotFoundException;

    Student addStudent(Student student);

    boolean updateStudentDetails(Student updatedStudent, Integer studentId) throws StudentNotFoundException;

    boolean deleteStudent(Integer studentId) throws StudentNotFoundException;

}
