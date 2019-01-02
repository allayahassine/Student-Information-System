package com.hassine.services.implementations;

import com.hassine.dao.StudentRepository;
import com.hassine.entities.Student;
import com.hassine.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        if(student != null) {
            studentRepository.delete(student);
        }
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findEnrolledStudents() {
        return studentRepository.findAllByStatusEquals("Enrolled");
    }

    @Override
    public List<Student> findAlumniStudents() {
        return studentRepository.findAllByStatusEquals("Alumni");
    }

    @Override
    public List<Student> findFiredStudents() {
        return studentRepository.findAllByStatusEquals("Fired");
    }
}
