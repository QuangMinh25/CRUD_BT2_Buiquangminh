package com.example.crud_bt2_buiquangminh.service;

import com.example.crud_bt2_buiquangminh.entity.Student;
import com.example.crud_bt2_buiquangminh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void saveStudent(Student s){
        studentRepository.save(s);
    }
    @Override
    public List<Student> findAll(){
        return (List<Student>) studentRepository.findAll();
    }
    @Override
    public Student findById(long id){
        Optional<Student> st = studentRepository.findById(Long.valueOf(id));
        Student s = null;
        if (st.isPresent()){
            s = st.get();
        }
        else {
            throw  new RuntimeException("khong tim thay");
        }
        return s;
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

}
