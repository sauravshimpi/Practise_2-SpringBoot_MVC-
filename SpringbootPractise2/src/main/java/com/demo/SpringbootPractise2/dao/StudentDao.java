package com.demo.SpringbootPractise2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringbootPractise2.Student.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {


}
