package com.test.atdev.student_data.service;

import com.test.atdev.student_data.domain.Student;
import com.test.atdev.student_data.exception.StudentAlreadyFoundException;
import com.test.atdev.student_data.exception.StudentNotFoundException;
import com.test.atdev.student_data.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        if (studentList.isEmpty()) {
            throw new StudentNotFoundException("There is no any Student in the database.");
        } else {
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
    public boolean updateStudentDetails(Student updatedStudent, Integer studentId) throws StudentNotFoundException {
        Optional<Student> studentToBeUpdated = studentRepository.findById(studentId);
        if (studentToBeUpdated.isPresent()) {
            Student student = studentToBeUpdated.get();
            student.setStudentName(updatedStudent.getStudentName());
            student.setStudentClass(updatedStudent.getStudentClass());
            student.setStudentMailId(updatedStudent.getStudentMailId());
            student.setStudentMarks(updatedStudent.getStudentMarks());

            studentRepository.save(student);
        } else {
            throw new StudentNotFoundException("There is no any Student with "+studentId+ " in the database.");
        }
        return true;
    }


    @Override
    public boolean deleteStudent(Integer studentId) throws StudentNotFoundException {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            studentRepository.deleteById(studentId);
            return true;
        } else {
            throw new StudentNotFoundException("There is no any Student in the database.");
        }

    }
}
