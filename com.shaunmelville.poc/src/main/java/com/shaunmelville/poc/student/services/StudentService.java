package com.shaunmelville.poc.student.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shaunmelville.poc.base.interfaces.IDao;
import com.shaunmelville.poc.base.interfaces.IStudentService;
import com.shaunmelville.poc.student.persistence.model.Student;
import com.shaunmelville.poc.student.pojo.StudentRequestDto;
import com.shaunmelville.poc.student.pojo.StudentResponseDto;

@Service
public class StudentService implements IStudentService {

	@Autowired
	@Qualifier("studentDao")
	private IDao<Student> studentDao;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public StudentResponseDto addStudent(StudentRequestDto studentRequestDto) {

		Student student = studentDao.create(modelMapper.map(studentRequestDto, Student.class));

		StudentResponseDto studentResponseDto = new StudentResponseDto(true, "Successfully added student",
				String.format("Student id is %s", student.getStudentuuid()));
		studentResponseDto.setStudent(student);

		return studentResponseDto;
	}

	@Override
	public List<Student> getStudents() {

		return studentDao.findAll();

	}

	@Override
	public Student getStudent() {

		return null;
	}

}
