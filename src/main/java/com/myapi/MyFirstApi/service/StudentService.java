package com.myapi.MyFirstApi.service;

import com.myapi.MyFirstApi.model.Student;
import com.myapi.MyFirstApi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;


    public List<Student> listStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    public List<Student> findByName(String name){
      return studentRepository.findByName(name);
    }

    public Student getOne(Long id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }


    public Student addStudents(Student student) {
        return studentRepository.save(student);

    }

}
