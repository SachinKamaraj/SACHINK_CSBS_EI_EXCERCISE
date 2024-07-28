package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Classroom> classes = new ArrayList<>();
    private static int classIdCount = 0;
    private static int studentIdCount = 0;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            LoggerUtility.log("System started.");
            while (true) {
                System.out.println("\nWelcome to the Classroom Management System");
                System.out.println("1. Create Classroom");
                System.out.println("2. Create Student & Enroll");
                System.out.println("3. Schedule Assignment");
                System.out.println("4. Submit Assignment");
                System.out.println("5. Print Students Enrolled in a Classroom");
                System.out.println("6. Print Students Submitted Assignments");
                System.out.println("7. Exit");

                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        createClassroom();
                        break;
                    case 2:
                        createAndEnrollStudent();
                        break;
                    case 3:
                        scheduleAssignment();
                        break;
                    case 4:
                        submitAssignment();
                        break;
                    case 5:
                        printStudentsInClassroom();
                        break;
                    case 6:
                        printStudentsSubmittedAssignments();
                        break;
                    case 7:
                        LoggerUtility.log("System exited.");
                        System.out.println("Exiting system...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            LoggerUtility.log("An error occurred: " + e.getMessage());
        }
    }

    private static void createClassroom() {
        try {
            System.out.println("Enter the Classroom Name:");
            String className = sc.nextLine();
            Classroom classroom = new Classroom(className, ++classIdCount);
            classes.add(classroom);
            LoggerUtility.log("Classroom created: " + className);
        } catch (Exception e) {
            LoggerUtility.log("Error creating classroom: " + e.getMessage());
        }
    }

    private static void createAndEnrollStudent() {
        try {
            System.out.println("Enter Student Name:");
            String name = sc.nextLine();
            System.out.println("Enter Department (Classroom Name):");
            String department = sc.nextLine();

            Student student = new Student(name, department, ++studentIdCount, studentIdCount);
            boolean enrolled = false;
            for (Classroom classroom : classes) {
                if (student.getDepartment().equals(classroom.getClassroomName())) {
                    classroom.getStudents().add(student);
                    enrolled = true;
                    LoggerUtility.log("Student enrolled: " + name);
                    break;
                }
            }
            if (!enrolled) {
                LoggerUtility.log("Classroom not found for student enrollment.");
            }
        } catch (Exception e) {
            LoggerUtility.log("Error enrolling student: " + e.getMessage());
        }
    }

    private static void scheduleAssignment() {
        try {
            System.out.println("Enter Assignment Work:");
            String work = sc.nextLine();
            System.out.println("Enter Classroom Name:");
            String className = sc.nextLine();

            Assignment assignment = new Assignment(work, className);
            boolean assigned = false;
            for (Classroom classroom : classes) {
                if (classroom.getClassroomName().equals(className)) {
                    classroom.getAssignments().add(assignment);
                    assigned = true;
                    LoggerUtility.log("Assignment scheduled: " + work);
                    break;
                }
            }
            if (!assigned) {
                LoggerUtility.log("Classroom not found for assignment scheduling.");
            }
        } catch (Exception e) {
            LoggerUtility.log("Error scheduling assignment: " + e.getMessage());
        }
    }

    private static void submitAssignment() {
        try {
            System.out.println("Enter Student Name:");
            String name = sc.nextLine();
            System.out.println("Enter Classroom Name:");
            String className = sc.nextLine();

            Submission submission = new Submission(name, className);
            boolean submitted = false;
            for (Classroom classroom : classes) {
                if (classroom.getClassroomName().equals(className)) {
                    classroom.getSubmissions().add(submission);
                    submitted = true;
                    LoggerUtility.log("Assignment submitted by: " + name);
                    break;
                }
            }
            if (!submitted) {
                LoggerUtility.log("Classroom not found for assignment submission.");
            }
        } catch (Exception e) {
            LoggerUtility.log("Error submitting assignment: " + e.getMessage());
        }
    }

    private static void printStudentsInClassroom() {
        try {
            System.out.println("Enter Classroom Name:");
            String className = sc.nextLine();

            boolean found = false;
            for (Classroom classroom : classes) {
                if (classroom.getClassroomName().equals(className)) {
                    found = true;
                    System.out.println("Students in " + className + ":");
                    for (Student student : classroom.getStudents()) {
                        System.out.println("Student Name: " + student.getName() + ", Student ID: " + student.getStudentId());
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Classroom not found.");
            }
        } catch (Exception e) {
            LoggerUtility.log("Error printing students: " + e.getMessage());
        }
    }

    private static void printStudentsSubmittedAssignments() {
        try {
            System.out.println("Enter Classroom Name:");
            String className = sc.nextLine();

            boolean found = false;
            for (Classroom classroom : classes) {
                if (classroom.getClassroomName().equals(className)) {
                    found = true;
                    System.out.println("Students who have submitted assignments in " + className + ":");
                    for (Submission submission : classroom.getSubmissions()) {
                        System.out.println("Student Name: " + submission.getStudentName());
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Classroom not found.");
            }
        } catch (Exception e) {
            LoggerUtility.log("Error printing submitted assignments: " + e.getMessage());
        }
    }
}
