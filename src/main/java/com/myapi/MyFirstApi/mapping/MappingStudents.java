package com.myapi.MyFirstApi.mapping;


import com.myapi.MyFirstApi.model.StudentDto;
import com.myapi.MyFirstApi.model.Student;
import org.springframework.stereotype.Service;

@Service
public class MappingStudents {
    public StudentDto mapToDtoStudents(Student studentEntity) {
        StudentDto dto = new StudentDto();
        dto.setId(studentEntity.getId());
        dto.setName(studentEntity.getName());
        dto.setSurName(studentEntity.getSurName());
        dto.setСourse(studentEntity.getСourse());
        dto.setTeacher(studentEntity.getTeacher());
        return dto;
    }

    public Student mapToStudents(StudentDto dto){
        Student student = new Student();
        student.setId(dto.getId());
        student.setName(dto.getName());
        student.setSurName(dto.getSurName());
        student.setСourse(dto.getСourse());
        student.setTeacher(dto.getTeacher());
        return student;
    }
}
