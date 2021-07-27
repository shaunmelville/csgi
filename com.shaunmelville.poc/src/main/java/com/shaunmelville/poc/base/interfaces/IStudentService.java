package com.shaunmelville.poc.base.interfaces;

import java.util.List;

import com.shaunmelville.poc.student.persistence.model.Student;
import com.shaunmelville.poc.student.pojo.StudentRequestDto;
import com.shaunmelville.poc.student.pojo.StudentResponseDto;

public interface IStudentService {

	public StudentResponseDto addStudent(StudentRequestDto request);

	public List<Student> getStudents();

	public Student getStudent();

}
