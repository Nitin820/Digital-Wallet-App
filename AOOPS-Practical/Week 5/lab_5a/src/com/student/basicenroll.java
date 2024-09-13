package com.student;

public  class basicenroll implements enroll {
    public void enrolls(student student, course course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
        System.out.println("Enrolled " + student.getName() + " in " + course.getCourseName());
    }
}
