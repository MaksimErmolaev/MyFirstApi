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
public class AccountController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public String listStudent(){
        studentService.listStudent();
        return "Список всех студентов : " + studentService.listStudent();
    }

    @PostMapping("/register")
    public String createStudents(@RequestBody Student student) {
        studentService.addStudents(student);
        return "Студент успешно добавлен : " + student.getName() + " " + student.getSurname();
    }
}
