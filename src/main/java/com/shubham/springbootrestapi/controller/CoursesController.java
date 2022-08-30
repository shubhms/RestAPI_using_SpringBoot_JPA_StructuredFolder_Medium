package com.shubham.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.springbootrestapi.entities.Course;
import com.shubham.springbootrestapi.services.CourseService;

@RestController
public class CoursesController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application!!";
	}
	
	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	// get single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable long courseId) {
		return courseService.getCourse(courseId);
	}
	
	// create new course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course c) {
		return courseService.addCourse(c);
	}
	
	// update course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course c) {
		return courseService.updateCourse(c);
	}
	
	// delete single course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<Course> deleteCourse(@PathVariable long courseId) {
		try {
			Course c = courseService.deleteCourse(courseId);
			return new ResponseEntity<>(c, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
