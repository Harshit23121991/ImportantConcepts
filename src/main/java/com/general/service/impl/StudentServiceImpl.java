package com.general.service.impl;

import com.example.springsocial.service.StudentService;
import com.general.annotation.NoLogging;
import com.general.controller.StudentController;
import com.general.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    private final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    @Cacheable(value = "testCache")
    public Student getAllStudents() {
        log.debug("Inside getAllStudents");
        return new Student("Harshit", 1, 9900839);
    }

    @Override
    @NoLogging
    public Student getStudentById(int id) {
       return new Student("Harshit", id, 9900839);
    }
}
