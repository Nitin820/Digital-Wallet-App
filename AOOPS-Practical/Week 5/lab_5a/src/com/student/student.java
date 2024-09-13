package com.student;



	import java.util.ArrayList;
	import java.util.List;

	public class student {
	    private String studentId;
	    private String name;
	    private List<course> enrolledCourses;

	    public student(String studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	        this.enrolledCourses = new ArrayList<>();
	    }

	    public String getStudentId() {
	        return studentId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void enrollInCourse(course course) {
	        enrolledCourses.add(course);
	    }

	    public List<course> getEnrolledCourses() {
	        return enrolledCourses;
	    }
	}

