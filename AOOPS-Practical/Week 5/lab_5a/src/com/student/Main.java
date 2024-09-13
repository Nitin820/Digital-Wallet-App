package com.student;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        course mathCourse = new course("C101", "Mathematics");
        course scienceCourse = new course("C102", "Science");

       
        student alice = new student("S001", "Alice");
        student bob = new student("S002", "Bob");

        
      enroll enrollmentService = new basicenroll();

                enrollmentService.enrolls(alice, mathCourse);
        enrollmentService.enrolls(bob, scienceCourse);

        
        displayCourseEnrollment(mathCourse);
        displayCourseEnrollment(scienceCourse);
    }

    private static void displayCourseEnrollment(course course) {
        System.out.println("\nStudents enrolled in " + course.getCourseName() + ":");
        for (student student : course.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
