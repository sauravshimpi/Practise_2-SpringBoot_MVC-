package com.demo.SpringbootPractise2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringbootPractise2.Student.Student;
import com.demo.SpringbootPractise2.dao.StudentDao;



@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	private StudentDao sdao;
	
	
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return  sdao.findAll();
		
	}



	public Student save(Student stu) {
		// TODO Auto-generated method stub
		return sdao.save(stu);
	}



	
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return  sdao.getById(id);
	}



	
	public Student updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return sdao.save(stu);
	}



	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		sdao.deleteById(id);
		
		
	}



	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
