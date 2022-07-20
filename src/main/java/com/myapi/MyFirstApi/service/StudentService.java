package com.myapi.MyFirstApi.service;

import com.myapi.MyFirstApi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private static List<Student> peoples(){
        List<Student> peoples = new ArrayList<Student>();
        peoples.add(new Student("Иван","Иванов"));
        peoples.add(new Student("Сергей","Сергеев"));
        peoples.add(new Student("Илья","Ильин"));
        return peoples;
    }
    private List<Student> students = peoples();

   public List<Student> getAllStudents(){
        return students;
    }
    public String addStudents(Student student){
        students.add(student);
        return "Студент добавлен " + student.getName() + " " + student.getSurname();
    }
}
