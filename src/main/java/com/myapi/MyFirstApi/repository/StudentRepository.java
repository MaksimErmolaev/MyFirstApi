package com.myapi.MyFirstApi.repository;

import com.myapi.MyFirstApi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface StudentRepository extends CrudRepository <Student, Long> {
    @Override
    <S extends Student> S save(S entity);
}
