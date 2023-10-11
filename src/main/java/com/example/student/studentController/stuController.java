package com.example.student.studentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.AgeNotFountException.AgeNotFountException;
import com.example.student.studentEntity.Student;
import com.example.student.studentService.stuService;

@RestController
@RequestMapping(value = "/students")
public class stuController {

	@Autowired
	stuService stuSer;

	@PostMapping(value = "/add")
	public String insert(@RequestBody Student s) throws AgeNotFountException {
		return stuSer.insert(s);

	}

}
