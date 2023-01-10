package com.example.sqllitedb;

public class Student {
    public String name;
    public String rollNo;
    public boolean isEnrolled;

    public Student(String n, String r, boolean b){
        this.name = n;
        this.rollNo = r;
        this.isEnrolled = b;
    }
}
