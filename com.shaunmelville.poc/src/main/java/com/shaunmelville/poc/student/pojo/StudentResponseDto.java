package com.shaunmelville.poc.student.pojo;

import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;
import com.shaunmelville.poc.student.persistence.model.Student;

public class StudentResponseDto extends BaseResponseDto {

	private Student student;

	public StudentResponseDto() {
		super();
	}

	public StudentResponseDto(boolean success, String message, String suggestion) {
		super(success, message, suggestion);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
