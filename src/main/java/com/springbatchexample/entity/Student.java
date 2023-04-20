package com.springbatchexample.entity;

public class Student {

    private Integer id;
    private String nameOfStudent;
    private String rollNumber;

    public Student() {

    }

    public Student(Integer id, String nameOfStudent, String rollNumber) {
        this.id = id;
        this.nameOfStudent = nameOfStudent;
        this.rollNumber = rollNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

}