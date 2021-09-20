package com.example.crud_bt2_buiquangminh.service;

import com.example.crud_bt2_buiquangminh.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Long studentId);

    public void deleteById(Long studentId);

    public Student updateStudentById(Long studentId, Student student);

    public Student getElementByEmail(String email);

    List<Student> findAll();
}
