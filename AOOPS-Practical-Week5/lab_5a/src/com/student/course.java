package com.student;


import java.util.ArrayList;
import java.util.List;

public class course {
    private String courseId;
    private String courseName;
    private List<student> enrolledStudents;

    public course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(student student) {
        enrolledStudents.add(student);
    }

    public List<student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

