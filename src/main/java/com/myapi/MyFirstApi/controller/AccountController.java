package com.myapi.MyFirstApi.controller;

import com.myapi.MyFirstApi.model.Student;
import com.myapi.MyFirstApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Slf4j
@RequiredArgsConstructor
public class AccountController {
    private final StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/register")
    public String createStudents(@RequestBody Student student) {
        return studentService.addStudents(student);
    }
}
