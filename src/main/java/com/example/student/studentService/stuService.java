package com.example.student.studentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.AgeNotFountException.AgeNotFountException;
import com.example.student.studentDao.stuDao;
import com.example.student.studentEntity.Student;

@Service
public class stuService {
	@Autowired
	stuDao studao;

	public String insert(Student s) throws AgeNotFountException {
		if (s.getAge() < 18) {
			throw new AgeNotFountException("not eligible");
		} else {

			return studao.insert(s);
		}
	}
}
