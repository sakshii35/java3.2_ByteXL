package com.example.springdi;

public class Student {
    private Course course;

    // Constructor-based Dependency Injection
    public Student(Course course) {
        this.course = course;
    }

    public void showInfo() {
        System.out.println("Student information:");
        course.displayCourse();
    }
}
