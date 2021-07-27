package com.shaunmelville.poc.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shaunmelville.poc.base.interfaces.IStudentService;
import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;
import com.shaunmelville.poc.student.persistence.model.Student;
import com.shaunmelville.poc.student.pojo.StudentRequestDto;
import com.shaunmelville.poc.student.pojo.StudentResponseDto;

@RestController
public class StudentController {

	@Autowired
	IStudentService studentService;

	@PostMapping(value = "/addStudent", consumes = "application/json", produces = "application/json")
	public StudentResponseDto addStudent(@RequestBody StudentRequestDto dto) {

		return this.studentService.addStudent(dto);

	}

	@GetMapping(value = "/helloStudent", produces = "application/json")
	public BaseResponseDto helloStudent() {

		return new BaseResponseDto();
	}

	@GetMapping(value = "/getStudents", produces = "application/json")
	public List<Student> getClassSchedules() {

		return studentService.getStudents();

	}

}
