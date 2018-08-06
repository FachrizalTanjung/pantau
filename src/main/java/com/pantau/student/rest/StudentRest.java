package com.pantau.student.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pantau.dto.DtoResponse;
import com.pantau.dto.StudentDto;
import com.pantau.model.Student;
import com.pantau.student.dao.StudentDao;
import com.pantau.util.ResponseUtil;

@Controller
@RequestMapping("/rest/student")
public class StudentRest {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping(value = "/insert", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON)
	public @ResponseBody DtoResponse insertStudent(@RequestBody StudentDto data) {

		Student student = new Student();
		student.setName(data.getName());
		student.setPlaceOfBirth(data.getPlaceOfBirth());
		student.setDateOfBirth(data.getDateOfBirth());
		student.setGender(data.getGender());
		student.setLevel(data.getLevel());
		student.setSchoolName(data.getSchoolName());
		student.setClassroom(data.getClassroom());

		studentDao.save(student);

		return ResponseUtil.response(1, "Success");
	}

}
