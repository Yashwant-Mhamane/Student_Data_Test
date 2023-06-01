package com.test.atdev.student_data.service;

import com.test.atdev.student_data.domain.Student;
import com.test.atdev.student_data.exception.StudentAlreadyFoundException;
import com.test.atdev.student_data.exception.StudentNotFoundException;
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
    public List<Student> getAllStudents() throws StudentNotFoundException {
        List<Student> studentList = (List<Student>) studentRepository.findAll();
        if(studentList.isEmpty())
        {
            throw new StudentNotFoundException("There is no any Student in the database.");
        }
        else {
            return studentList;
        }
    }

    @Override
    public Student addStudent(Student student) throws StudentAlreadyFoundException {
        if (studentRepository.findById(student.getStudentId()).isPresent())
            throw new StudentAlreadyFoundException("Student with this Id already present");
        else
            return studentRepository.save(student);
    }


    @Override
    public boolean updateStudentDetails(Student updatedStudent, Integer studentId) {
        return false;
    }

    @Override
    public boolean deleteStudent(Integer studentId) {
        return false;
    }
}
