package com.example.crud_bt2_buiquangminh.repository;

import com.example.crud_bt2_buiquangminh.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
    Student findStudentByEmail(String email);
}
