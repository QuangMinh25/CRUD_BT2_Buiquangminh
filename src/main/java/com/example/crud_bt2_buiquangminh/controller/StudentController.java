package com.example.crud_bt2_buiquangminh.controller;

import com.example.crud_bt2_buiquangminh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
    private StudentService studentService;
}
