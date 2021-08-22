package com.patika.service;

import com.patika.model.Student;
import com.patika.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StudentService{


    public List<Student> findAll();

    public Optional<Student> findById(int id);

    public void saveToDatabase(Student object);

    public void deleteFromDatabase(Student object);

    public void deleteFromDatabase(int id);

    public void updateOnDatabase(Student object);

    public Optional<Student> findByGender(String gender);
}
