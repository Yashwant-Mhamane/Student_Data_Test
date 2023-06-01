package com.test.atdev.student_data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String studentClass;
    private String studentMailId;
    private int studentMarks;

}
