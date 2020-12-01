package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDao;
import kr.ac.hansung.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseDao courseDao;
	
	public List<Course> getTakenSummary() {
		return courseDao.getSummary();
	}
	
	public int getTotalTakenCredits() {
		return courseDao.getTotalCredits();
	}
	
	public List<Course> getSemesterCourses(int year, int semester) {
		return courseDao.getSemesterCourses(year, semester);
	}

	public void insert(Course course) {
		courseDao.insert(course);
	}
	
	public List<Course> getRegisterCourses() {
		return courseDao.getRegisterCourses();
	}
}
