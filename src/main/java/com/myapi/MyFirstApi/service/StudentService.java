package com.myapi.MyFirstApi.service;

import com.myapi.MyFirstApi.model.Student;
import com.myapi.MyFirstApi.repository.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public String listStudent() {
        return "" + studentRepo.getAllStudents();
    }

    public Student addStudents(Student student) {
        studentRepo.saveStudent(student);
        return student;
    }

}
