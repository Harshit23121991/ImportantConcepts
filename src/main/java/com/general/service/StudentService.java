package com.example.springsocial.service;


import com.general.model.Student;

public interface StudentService {
    Student getAllStudents();

    Student getStudentById(int id);
}
