package com.pantau.grades.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pantau.dto.DtoResponse;
import com.pantau.dto.SchoolGradesDto;
import com.pantau.model.SchoolGrades;
import com.pantau.student.dao.SchoolGradesDao;
import com.pantau.util.ResponseUtil;

@Controller
@RequestMapping("/rest/school-grades")
public class SchoolGradesRest {
	
	@Autowired
	private SchoolGradesDao schoolGradesDao;
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public @ResponseBody DtoResponse insertStudent(@RequestBody SchoolGradesDto data) {

		SchoolGrades schoolGrades = new SchoolGrades();
		
		schoolGrades.setSchoolName(data.getSchoolName());
		schoolGrades.setSchoolAddress(data.getSchoolAddress());
		schoolGrades.setClassroom(data.getClassroom());
		schoolGrades.setSemester(data.getSemester());
		schoolGrades.setAcademicYear(data.getAcademicYear());
		schoolGrades.setHomeroomTeacher(data.getHomeroomTeacher());
		schoolGrades.setRank(data.getRank());
		schoolGrades.setId(data.getId());
		schoolGrades.setLessonValue(data.getLessonValue());

		schoolGradesDao.save(schoolGrades);

		return ResponseUtil.response(1, "Success");
	}

}
