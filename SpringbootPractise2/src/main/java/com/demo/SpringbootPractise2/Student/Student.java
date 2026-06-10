package com.demo.SpringbootPractise2.Student;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String city;
	private long mob;
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate dob;
	public Student() {
		super();
	}
	public Student(int id, String name, String city, long mob, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mob = mob;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", mob=" + mob + ", dob=" + dob + "]";
	}
	

}
