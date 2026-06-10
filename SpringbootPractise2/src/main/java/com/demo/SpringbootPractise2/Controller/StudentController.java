package com.demo.SpringbootPractise2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringbootPractise2.Student.Student;
import com.demo.SpringbootPractise2.service.StudentService;


@RestController
@RequestMapping("/all")
public class StudentController {

	
	@Autowired
	private StudentService sservice;
	
	@GetMapping("/hello")
	public String hello()
	{
		
		return "Spring is working...!";
	}

	@GetMapping("/get")
	public List<Student>  getAllStudents()
	{
		return sservice.getAllStudents();
		
	}
	
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student stu)
	{
		return sservice.save(stu);
		
	}
	
	/*-----------------------------------------------
	@PostMapping("/addall")
	public List<Student> addAll(@RequestBody List<Student> students) {
	    return sservice.saveAll(students);
	}
	
	*/
	
	//get student by id
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return sservice.getStudent(id);
		
	}
	
	
	//Update Student
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student stu) 
	{
		stu.setId(id);
		return  sservice.updateStudent(stu);
		
		
	}
	

//		@DeleteMapping("/{id}")
//	public  String deleteStudent(@PathVariable int id)
//	{
//		sservice.deleteStudent(id);
//		return "Student Deleted..!";
//		
//	}
//	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {

	    sservice.deleteStudent(id);

	    return "Student Deleted Successfully";
	}

	
}
