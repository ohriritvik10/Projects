package com.project.sample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sample.courses.Course;

@Service
public class courseServiceImplement implements courseService{
	List<Course> list;
	public courseServiceImplement() {
		list = new ArrayList<>();
		list.add(new Course(11,"Computer Science", "C++/python ........."));
		list.add(new Course(8, "English", "Grammar, Novels, etc....."));
	}
	@Override
	public List<Course> getCourses(){
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course course=null;
		for(Course c:list) {
			if(c.getId()==courseId) {
				course=c;
				break;
			}
		}
		return course;
	}
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	public Course edit(Course course) {
		list.forEach(e -> {
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}
	public void deleteCourse(long courseId) {
		list.forEach(e ->{
			if(e.getId()==courseId){
                list.remove(e);
            }
		});
	}
}
