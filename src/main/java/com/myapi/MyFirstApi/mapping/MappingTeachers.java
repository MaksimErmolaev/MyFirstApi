package com.myapi.MyFirstApi.mapping;

import com.myapi.MyFirstApi.model.Teacher;
import com.myapi.MyFirstApi.model.TeacherDto;
import org.springframework.stereotype.Service;

@Service
public class MappingTeachers {
    public TeacherDto mapToDtoTeachers(Teacher teacherEntity){
        TeacherDto dto = new TeacherDto();
        dto.setId(teacherEntity.getId());
        dto.setName(teacherEntity.getName());
        dto.setSurName(teacherEntity.getSurName());
        dto.setAdress(teacherEntity.getAdress());
        dto.setDepartment(teacherEntity.getDepartment());
        dto.setSalary(teacherEntity.getSalary());
        dto.setPhoneNumber(teacherEntity.getPhoneNumber());
        dto.setStudents(teacherEntity.getStudents());
        return dto;
    }

    public Teacher mapToTeachers(TeacherDto dto){
        Teacher teacher = new Teacher();
        teacher.setId(dto.getId());
        teacher.setName(dto.getName());
        teacher.setSurName(dto.getSurName());
        teacher.setAdress(dto.getAdress());
        teacher.setDepartment(dto.getDepartment());
        teacher.setSalary(dto.getSalary());
        teacher.setPhoneNumber(dto.getPhoneNumber());
        teacher.setStudents(dto.getStudents());
        return teacher;
    }
}
