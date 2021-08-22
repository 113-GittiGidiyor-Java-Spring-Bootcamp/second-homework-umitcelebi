package com.patika.service.imp;


import com.patika.model.Student;
import com.patika.repository.StudentRepository;
import com.patika.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    public void saveToDatabase(Student object) {
        studentRepository.save(object);
    }

    public void deleteFromDatabase(Student object) {
        studentRepository.delete(object);
    }

    public void deleteFromDatabase(int id) {
        studentRepository.deleteById(id);
    }

    public void updateOnDatabase(Student object) {
        studentRepository.save(object);
    }

    public Optional<Student> findByGender(String gender) {
        return studentRepository.findByGender(gender);
    }
}
