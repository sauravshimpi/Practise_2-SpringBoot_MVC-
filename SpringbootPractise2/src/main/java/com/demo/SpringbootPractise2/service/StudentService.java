package com.demo.SpringbootPractise2.service;

import java.util.List;

import com.demo.SpringbootPractise2.Student.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student save(Student stu);

	Student getStudent(int id);

	Student updateStudent(Student stu);

	//void deleteStudent(int id);

	void deleteStudent(int id);

}
