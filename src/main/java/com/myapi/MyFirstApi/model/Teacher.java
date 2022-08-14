package com.myapi.MyFirstApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@ToString(exclude = "students")
@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "NAME")
    private String Name;

    @Column(name = "SUR_NAME")
    private String surName;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    @Column(name = "ADRESS")
    private String adress;

    @Column(name = "SALARY")
    private Long salary;

    @Column(name = "DEPARTMENT")
    private String department;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
    private List<Student> students = new ArrayList<>();

}
