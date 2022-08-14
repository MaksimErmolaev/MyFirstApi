package com.myapi.MyFirstApi.controller;


import com.myapi.MyFirstApi.model.Student;
import com.myapi.MyFirstApi.model.Teacher;
import com.myapi.MyFirstApi.service.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teachers")
@Slf4j
@RequiredArgsConstructor

public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @PostMapping("/register")
    public String createTeachers(@RequestBody Teacher teacher) {
        teacherService.addTeachers(teacher);
        return "Учитель успешно добавлен : " + teacher.getName() + " " + teacher.getSurName() + " " + teacher.getId();
    }

    @GetMapping("/all")
    public List<Teacher> findAll() {
        return (List<Teacher>) teacherService.findAll();
    }

    @GetMapping("/findTeachers/{id}")
    public Optional<Teacher> findById(@PathVariable("id") Long id) {
        return teacherService.findById(id);
    }

    @GetMapping("/course/{id}/students")
    public List<Student> getStudentsByTeacher(@PathVariable("id") Long id) {
        return teacherService.getStudentsByTeachers(id);
    }
}

