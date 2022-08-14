package com.myapi.MyFirstApi.service;

import com.myapi.MyFirstApi.model.Student;
import com.myapi.MyFirstApi.model.Teacher;
import com.myapi.MyFirstApi.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor

public class TeacherService {

    @Autowired
    private final TeacherRepository teacherRepository;


    public List<Teacher> findAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    public Optional<Teacher> findById(Long id) {
        return teacherRepository.findById(id);
    }

    public List<Student> getStudentsByTeachers(Long id) {
        return teacherRepository.getStudentsByTeacher(id);
    }

    public Teacher addTeachers(Teacher teacher) {
        return teacherRepository.save(teacher);

    }
}
