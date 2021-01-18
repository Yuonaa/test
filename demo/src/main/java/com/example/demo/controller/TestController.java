package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("hello")
    public List<Student> sayHello(){
        List<Student> studentList = testService.getAllStudent();
        return studentList;
    }

    @RequestMapping("hello/{id}")
    public Student getStudentById(@PathVariable("id")String id){
        Student student = testService.getStudentById(id);
        return student;
    }
}
