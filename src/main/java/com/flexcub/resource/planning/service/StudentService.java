package com.flexcub.resource.planning.service;

import com.flexcub.resource.planning.StudentRepository;
import com.flexcub.resource.planning.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getData(){
        return studentRepository.findAll();
    }

    public Student insertData1(Student student){
        studentRepository.save(student);
        return student;
    }

    public void deleteData(int id){
        studentRepository.deleteById(id);

    }
}
