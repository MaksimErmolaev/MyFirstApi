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

    private final StudentRepository studentRepository;

    public List<Student> listStudent() {
        return null;
    }

    public Student addStudents(Student student) {
        return studentRepository.save(student);

    }

}
