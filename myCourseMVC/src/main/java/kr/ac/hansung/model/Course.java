package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Course {
	
	@Range(min=2018, max=2021, message="It's not a valid course year")
	private int year;	// 수강년도
	
	@Range(min=1, max=2, message="It's not a valid semester")
	private int semester;	// 학기
	
	@NotEmpty(message="Class name cannot be empty")
	private String className;	// 교과목명
	
	@NotEmpty(message="Classification cannot be empty")
	private String classification;	// 교과구분
	
	@NotEmpty(message="Professor name cannot be empty")
	private String professor;	// 담당교수
	
	@Range(min=1, max=3, message="It's not a valid credits")
	private int credits;	// 학점
	
}
