package com.myapi.MyFirstApi.repository;

import com.myapi.MyFirstApi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByName(@Param("name") String name);

    @Override
    <S extends Student> S save(S entity);

    @Override
    Optional<Student> findById(Long aLong);

    @Override
    Iterable<Student> findAll();
}
