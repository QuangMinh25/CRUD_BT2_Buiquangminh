package com.example.crud_bt2_buiquangminh.controller;

import com.example.crud_bt2_buiquangminh.entity.Student;
import com.example.crud_bt2_buiquangminh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    private StudentService studentService;
    @GetMapping("/student")
    public List<Student> getListEmployee(){
        System.out.println(studentService.findAll());
        return studentService.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable long id){
        return StudentService.findById(id);
    }

    @PostMapping("/student")
    public Student addNewEmployee(@RequestBody Student student){
        student.setId(Long.valueOf(0));
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){

        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/student/{id}")
    public String deleteEmployee(@PathVariable long id){
        studentService.deleteById(Long.valueOf(id));
        return "Xoa student "+ id;
    }
}
