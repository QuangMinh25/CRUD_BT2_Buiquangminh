package com.example.crud_bt2_buiquangminh.controller;

import com.example.crud_bt2_buiquangminh.entity.Student;
import com.example.crud_bt2_buiquangminh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student saveStudent(@Valid @RequestBody Student student){

        return studentService.saveStudent(student);
    }
    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Long studentId){
        return studentService.getStudentById(studentId);
    }
    @DeleteMapping("/student/{id}")
    public String deleteById(@PathVariable("id") Long studentId){
        studentService.deleteById(studentId);
        return "Successfully!";
    }
    @PutMapping("/student/{id}")
    public Student updateStudentById(@PathVariable("id") Long studentId,
                                       @RequestBody Student student){

        return studentService.updateStudentById(studentId, student);
    }
    @GetMapping("/student/email/{email}")
    public Student getElementByEmail(@PathVariable("email") String email){
        return studentService.getElementByEmail(email);
    }
}
