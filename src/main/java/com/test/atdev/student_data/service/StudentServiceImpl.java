package com.test.atdev.student_data.service;

import com.test.atdev.student_data.domain.Student;
import com.test.atdev.student_data.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

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
