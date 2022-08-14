package com.myapi.MyFirstApi.repository;

import com.myapi.MyFirstApi.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByName(String name);

}
