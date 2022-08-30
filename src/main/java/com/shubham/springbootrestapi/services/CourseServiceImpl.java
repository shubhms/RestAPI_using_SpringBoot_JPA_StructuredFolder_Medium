package com.shubham.springbootrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.springbootrestapi.dao.CourseDao;
import com.shubham.springbootrestapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

//	List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "Java Core Course", "This course contains basics of Java!!"));
//		list.add(new Course(161, "Spring Boot Course", "Creating rest API using Spring Boot!! "));
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
//		return list;
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId()==courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course c) {
//		list.add(c);
//		return c;
		return courseDao.save(c);
	}

	@Override
	public Course updateCourse(Course c) {
//		Course cs = null;
//		for(Course course : list) {
//			if(course.getId()==c.getId()) {
//				course.setTitle(c.getTitle());
//				course.setDescription(c.getDescription());
//				cs = course;
//				break;
//			}
//		}
//		if(cs==null) {
//			this.addCourse(c);
//		}
//		return c;
		return courseDao.save(c);
	}

	@Override
	public Course deleteCourse(long courseId) {
		
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId()==courseId) {
//				c = course;
//				list.remove(c);
//				break;
//			}
//		}
//		return c;
		Course c = courseDao.findById(courseId).get();
		courseDao.deleteById(courseId);
		return c;
	}

}
