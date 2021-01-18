package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface TestService {
    List<Student> getAllStudent();


    Student getStudentById(String id);
}
