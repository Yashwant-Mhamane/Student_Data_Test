package com.test.atdev.student_data.service;

import com.test.atdev.student_data.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public boolean updateStudentDetails(Student updatedStudent, Integer studentId) throws Exception {
        return false;
    }

    @Override
    public boolean deleteStudent(Integer studentId) {
        return false;
    }
}