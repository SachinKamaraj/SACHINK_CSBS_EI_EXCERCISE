package com.example;

public class Submission {
    private String studentName;
    private String className;

    public Submission(String studentName, String className) {
        this.studentName = studentName;
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getClassName() {
        return className;
    }
}
