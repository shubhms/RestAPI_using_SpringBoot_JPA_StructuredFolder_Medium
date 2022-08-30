package com.shubham.springbootrestapi.services;

import java.util.List;

import com.shubham.springbootrestapi.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course c);

	public Course updateCourse(Course c);

	public Course deleteCourse(long courseId);
}
