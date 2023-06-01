package com.test.atdev.student_data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String studentClass;
    private String studentMailId;
    private int studentMarks;

    public Student(int studentId, String studentName, String studentClass, String studentMailId, int studentMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentMailId = studentMailId;
        this.studentMarks = studentMarks;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentMailId() {
        return studentMailId;
    }

    public void setStudentMailId(String studentMailId) {
        this.studentMailId = studentMailId;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && studentMarks == student.studentMarks && Objects.equals(studentName, student.studentName) && Objects.equals(studentClass, student.studentClass) && Objects.equals(studentMailId, student.studentMailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentClass, studentMailId, studentMarks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", studentMailId='" + studentMailId + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }
}
