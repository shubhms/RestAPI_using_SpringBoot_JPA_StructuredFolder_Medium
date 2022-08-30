package com.shubham.springbootrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubham.springbootrestapi.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
