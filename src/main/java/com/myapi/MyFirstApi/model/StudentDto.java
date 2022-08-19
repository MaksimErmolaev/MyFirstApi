package com.myapi.MyFirstApi.model;

import lombok.Data;

@Data
public class StudentDto {
    Long id;
    int сourse;
    String name;
    String surName;
    Teacher teacher;

}
