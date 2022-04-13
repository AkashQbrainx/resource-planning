package com.flexcub.resource.planning.controller;

import com.flexcub.resource.planning.entity.Student;
import com.flexcub.resource.planning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/req")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/get")
    public List<Student> getStudentDetails(){
        return studentService.getData();
    }

    @PostMapping(value = "/insertData")
    public Student insertStudentDetails(@RequestBody Student student){
        return studentService.insertData1(student);
    }

    @DeleteMapping(value = "/deleteData")
    public void deleteStudentDetails(@RequestParam int id){
       studentService.deleteData(id);
    }

}
