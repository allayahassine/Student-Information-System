package com.hassine.controllers;


import com.hassine.entities.Student;
import com.hassine.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/saveStudent")
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping(value = "/deleteStudent/{id}")
    public ResponseEntity deleteStudent(@PathVariable(name = "id") Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @PutMapping(value = "/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping(value = "/getStudents")
    public List<Student> getAllStudents() {
        return studentService.findAllStudents();
    }
}
