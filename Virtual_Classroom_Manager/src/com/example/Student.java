package com.example;

public class Student {
    private String name;
    private String department;
    private int registerNo;
    private int studentId;

    public Student(String name, String department, int registerNo, int studentId) {
        this.name = name;
        this.department = department;
        this.registerNo = registerNo;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getStudentId() {
        return studentId;
    }
}
