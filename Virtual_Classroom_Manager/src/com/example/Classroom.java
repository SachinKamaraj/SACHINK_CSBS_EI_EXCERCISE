package com.example;

import java.util.ArrayList;

public class Classroom {
    private String classroomName;
    private int classId;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> students;
    private ArrayList<Submission> submissions;

    public Classroom(String classroomName, int classId) {
        this.classroomName = classroomName;
        this.classId = classId;
        this.assignments = new ArrayList<>();
        this.students = new ArrayList<>();
        this.submissions = new ArrayList<>();
    }

    public String getClassroomName() {
        return classroomName;
    }

    public int getClassId() {
        return classId;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Submission> getSubmissions() {
        return submissions;
    }
}
