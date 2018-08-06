package com.pantau.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping(value = "/student")
	public String index() {

		return "student";
	}

}
