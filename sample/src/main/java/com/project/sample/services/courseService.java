package com.project.sample.services;

import java.util.List;

import com.project.sample.courses.Course;

public interface courseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course edit(Course course);
	public void deleteCourse(long courseId);
}
