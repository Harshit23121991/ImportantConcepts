package com.general.service.impl;

import com.example.springsocial.service.StudentService;
import com.general.annotation.NoLogging;
import com.general.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Override
    public Student getAllStudents() {
        return new Student("Harshit", 1, 9900839);
    }

    @Override
    @NoLogging
    public Student getStudentById(int id) {
        return new Student("Harshit", id, 9900839);
    }
}
