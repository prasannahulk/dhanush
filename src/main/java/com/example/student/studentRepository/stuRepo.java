package com.example.student.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.studentEntity.Student;

public interface stuRepo extends JpaRepository<Student, Integer> {

}