package com.general.controller;


import com.example.springsocial.service.StudentService;
import com.general.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public Student getAllStudents() {
        return studentService.getAllStudents();

    }

    @GetMapping("/students/id")
    public Student getStudentById(@RequestParam("id") int id) {
        return studentService.getStudentById(id);

    }


}
