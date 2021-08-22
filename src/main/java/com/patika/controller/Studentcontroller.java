package com.patika.controller;

import com.patika.model.Student;
import com.patika.service.StudentService;
import com.patika.service.imp.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class Studentcontroller {

    @Autowired
    StudentService studentService;


    public Studentcontroller() {
        this.studentService=new StudentServiceImpl();
    }

    public List<Student> findAllStudents() {
        return  studentService.findAll();
    }

    public Optional<Student> findStudentById(int id) {
        return  studentService.findById(id);
    }

    public void saveStudent(Student student) {
        studentService.saveToDatabase(student);
    }

    public void deleteStudent(Student student) {
        studentService.deleteFromDatabase(student);
    }

    public void deleteStudent(int id) {
        studentService.deleteFromDatabase(id);
    }

    public void updateStudent(Student student, Long id) {
        studentService.updateOnDatabase(student);
    }

}
