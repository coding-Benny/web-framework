package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/summary")
	public String showSummary(Model model) {		
		List<Course> summaries = courseService.getTakenSummary();
		model.addAttribute("summaries", summaries);
		
		int totalCredits = courseService.getTotalTakenCredits();
		model.addAttribute("totalCredits", totalCredits);
		
		return "summary";
	}
	
	@RequestMapping("/details/{semesterInfo}")
	public String showDetails(@PathVariable String semesterInfo, Model model) {
		int year = Integer.parseInt(semesterInfo.split("-")[0]);
		int semester = Integer.parseInt(semesterInfo.split("-")[1]);
		
		List<Course> courses = courseService.getSemesterCourses(year, semester);
		model.addAttribute("courses", courses);
		
		return semesterInfo;
	}
	
	@RequestMapping("/register")
	public String registerCourse(Model model) {
		
		model.addAttribute("course", new Course());
		
		return "register";
	}
	
	@RequestMapping(value="/doRegister", produces="text/plain;charset=UTF-8")
	public String doRegister(Model model, @Valid Course course, BindingResult result) {
		
		if (result.hasErrors()) {
			System.out.println("== 수강신청 오류 ==");
			
			List<ObjectError> errors = result.getAllErrors();
			
			for (ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			
			return "register";
		}
		
		courseService.insert(course);
		
		return "successRegistration";
	}
	
	@RequestMapping("/viewRegistration")	// 수강 신청 내역 조회
	public String viewRegistration(Model model) {
		List<Course> courses = courseService.getRegisterCourses();
		model.addAttribute("courses", courses);
		
		return "viewRegistration";
	}
}
