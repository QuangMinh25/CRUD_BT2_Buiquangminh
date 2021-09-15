package com.example.crud_bt2_buiquangminh.service;

import com.example.crud_bt2_buiquangminh.entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student s);
    List<Student> findAll();
    Student findById(long id);
    void deleteById(Long id);
}
