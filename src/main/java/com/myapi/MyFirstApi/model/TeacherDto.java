package com.myapi.MyFirstApi.model;

import lombok.Data;


import java.util.ArrayList;
import java.util.List;

@Data
public class TeacherDto {
    Long id;
    String Name;
    String surName;
    Long phoneNumber;
    String adress;
    Long salary;
    String department;
    List<Student> students = new ArrayList<>();
}
