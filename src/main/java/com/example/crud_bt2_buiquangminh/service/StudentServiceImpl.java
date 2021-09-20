package com.example.crud_bt2_buiquangminh.service;

import com.example.crud_bt2_buiquangminh.entity.Student;
import com.example.crud_bt2_buiquangminh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public abstract class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void deleteById(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student updateStudentById(Long studentId,
                                       Student studentNew) {
        Student studentDB =
                studentRepository.findById(studentId).get();

        if(Objects.nonNull(studentNew.getFirstName()) &&
                !"".equalsIgnoreCase(studentNew.getFirstName())){

            studentDB.setFirstName(studentNew.getFirstName());
        }
        if(Objects.nonNull(studentNew.getLastName()) &&
                !"".equalsIgnoreCase(studentNew.getLastName())){
            studentDB.setLastName(studentNew.getLastName());

        }
        if(Objects.nonNull(studentNew.getEmail()) &&
                !"".equalsIgnoreCase(studentNew.getEmail())){
            studentDB.setEmail(studentNew.getEmail());
        }

        return studentRepository.save(studentDB);
    }

    @Override
    public Student getElementByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }



}
