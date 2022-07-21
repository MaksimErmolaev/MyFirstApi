package com.myapi.MyFirstApi.repository;

import com.myapi.MyFirstApi.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class StudentRepo {
    private List<Student> students = loadFromDB();

    private static List<Student> loadFromDB() {
        List<Student> students = new ArrayList<>();
        return students;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public String saveStudent(Student student) {
        students.add(student);
        log.info(String.valueOf(students));
        return String.format("Студент добавлен " + student);
    }

}
