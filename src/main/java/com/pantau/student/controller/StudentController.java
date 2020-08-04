package com.pantau.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping(value = "/student")
	public String student() {

		return "index/student";
	}

	@RequestMapping(value = "/add-student")
	public String addStudent() {

		return "add/student";
	}

	@RequestMapping(value = "/update-student")
	public String updateStudent() {

		return "update/student";
	}

}
