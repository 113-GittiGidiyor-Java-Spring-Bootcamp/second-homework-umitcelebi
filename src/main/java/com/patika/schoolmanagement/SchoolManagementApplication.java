package com.patika.schoolmanagement;

import com.patika.controller.Studentcontroller;
import com.patika.model.*;
import com.patika.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = StudentRepository.class)
@EntityScan("com.patika.model")
public class SchoolManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementApplication.class, args);
        saveToDatabase();
    }

    private static void saveToDatabase(){
        Student student1 = new Student("Ümit Çelebi", "Ümit Address", "Male", LocalDate.of(1994,7,21));
        Student student2 = new Student("Ali Çelebi", "Ali Address", "Male", LocalDate.of(1970,01,01));
        Student student3 = new Student("Gümüş Gökçe", "gümüş Address", "Female", LocalDate.of(1946,05,12));
        Student student4 = new Student("Melis Kaş", "Melis Address", "Female", LocalDate.of(1996,10,20));

        Course course1 = new Course("Java","1205",5);
        Course course2 = new Course("Python","2107",4.8);
        Course course3 = new Course("C#","2910",4.9);

        Instructor visitingResearcher1 = new VisitingResearcher("Emin Yılmaz","Emin Address","05444444444",135);
        Instructor visitingResearcher2 = new VisitingResearcher("Kerem Şahiner","Kerem Address","05321322222",115);
        Instructor permanentInstructor1 = new PermanentInstructor("Enes Kandaz","Enes Address","05459658854",115);


        course1.setInstructor(visitingResearcher1);
        course2.setInstructor(visitingResearcher2);
        course3.setInstructor(permanentInstructor1);

        student1.getCourses().add(course1);
        student1.getCourses().add(course2);
        student2.getCourses().add(course3);
        student3.getCourses().add(course3);
        student4.getCourses().add(course1);
        student4.getCourses().add(course3);

        Studentcontroller studentcontroller=new Studentcontroller();

        studentcontroller.saveStudent(student1);
        studentcontroller.saveStudent(student2);
        studentcontroller.saveStudent(student3);
        studentcontroller.saveStudent(student4);


        List<Student> studentList=studentcontroller.findAllStudents();
        for (Student student:studentList) {
            System.out.println(student);
        }

        studentcontroller.deleteStudent(1);
        studentcontroller.deleteStudent(student4);


    }

}
