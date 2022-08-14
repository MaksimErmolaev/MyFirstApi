package com.myapi.MyFirstApi.controller;

import com.myapi.MyFirstApi.model.Student;
import com.myapi.MyFirstApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/students")
@Slf4j
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/all")
    public String listStudent() {
        return "Список всех студентов : " + studentService.listStudent();
    }

    @GetMapping("/one")
    public Student getOneStudent(@RequestParam Long id) {
        return studentService.getOne(id);
    }

    @GetMapping("/findName")
    public String getSameNames(@RequestParam String name) {
        return "Список одинаковых студентов : " + studentService.findByName(name);
    }

    @PostMapping("/register")
    public String createStudents(@RequestBody Student student) {
        studentService.addStudents(student);
        return "Студент успешно добавлен : " + student.getName() + " " + student.getSurName() + " " + student.getId();
    }
}
