package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Course;

@Repository
public class CourseDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
	// 학기별 이수 학점 조회
    public List<Course> getSummary() {
    	String sqlStatement = "select 수강년도, 학기, sum(학점) from courses GROUP BY 수강년도, 학기 ORDER BY 수강년도, 학기";
    	return jdbcTemplate.query(sqlStatement, new RowMapper<Course>() {

			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course summary = new Course();
				summary.setYear(rs.getInt("수강년도"));
				summary.setSemester(rs.getInt("학기"));
				summary.setCredits(rs.getInt("sum(학점)"));			
				return summary;
			}	
    	});
    }
    
    // 특정 학기에 수강한 강의 정보 조회
    public List<Course> getSemesterCourses(int year, int semester) {
    	String sqlStatement = "select * from courses where 수강년도=? and 학기=?";
    	return jdbcTemplate.query(sqlStatement, new Object[] {year, semester}, new RowMapper<Course>() {

			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course();
				course.setYear(rs.getInt("수강년도"));
				course.setSemester(rs.getInt("학기"));
				course.setClassName(rs.getString("교과목명"));
				course.setClassification(rs.getString("교과구분"));
				course.setProfessor(rs.getString("담당교수"));
				course.setCredits(rs.getInt("학점"));	
				return course;
			}	
    	});
    }
    
    // 이수 총 학점 계산
    public int getTotalCredits() {
    	String sqlStatement = "select sum(학점) from courses";
    	return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
    }
    
    // DB에 강의 정보 삽입
    public boolean insert(Course insertCourse) {
    	int year = insertCourse.getYear();
    	int semester = insertCourse.getSemester();
    	String className = insertCourse.getClassName();
    	String classification = insertCourse.getClassification();
    	String professor = insertCourse.getProfessor();
    	int credits = insertCourse.getCredits();
    	
    	String sqlStatement = "insert into registrations (년도, 학기, 교과목명, 교과구분, 담당교수, 학점) values (?,?,?,?,?,?)";
    	
    	return (jdbcTemplate.update(sqlStatement, new Object[] {year, semester, className, classification, professor, credits}) == 1);
    }
    
    // 수강신청 내역 조회
    public List<Course> getRegisterCourses() {
    	String sqlStatement = "select * from registrations";
    	return jdbcTemplate.query(sqlStatement, new RowMapper<Course>() {

    		@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course registerCourse = new Course();
				registerCourse.setYear(rs.getInt("년도"));
				registerCourse.setSemester(rs.getInt("학기"));
				registerCourse.setClassName(rs.getString("교과목명"));
				registerCourse.setClassification(rs.getString("교과구분"));
				registerCourse.setProfessor(rs.getString("담당교수"));
				registerCourse.setCredits(rs.getInt("학점"));	
				return registerCourse;
			}			
    	});
    }
}
