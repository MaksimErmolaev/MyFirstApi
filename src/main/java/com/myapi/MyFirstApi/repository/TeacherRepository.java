package com.myapi.MyFirstApi.repository;

import com.myapi.MyFirstApi.model.Student;
import com.myapi.MyFirstApi.model.Teacher;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    @Query("select students from Teacher t where t.id = ?1 ")
    List<Student> getStudentsByTeacher(Long id);
}
