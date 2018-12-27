package com.hassine.services;

import com.hassine.entities.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
    List<Student> findAllStudents();
    List<Student> findEnrolledStudents();
    List<Student> findAlumniStudents();
    List<Student> findFiredStudents();
}
