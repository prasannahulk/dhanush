package com.example.student.studentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.student.studentEntity.Student;
import com.example.student.studentRepository.stuRepo;

@Repository
public class stuDao {
	@Autowired
	stuRepo stupo;

	public String insert(Student s) {

		stupo.save(s);
		return "success";
	}

}
