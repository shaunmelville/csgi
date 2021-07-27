package com.shaunmelville.poc.student.persistence.dao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.shaunmelville.poc.base.persistence.BaseDao;
import com.shaunmelville.poc.student.persistence.model.Student;

@Component("studentDao")
public class StudentDao extends BaseDao {

	@PostConstruct
	public void init() {
		super.setClazz(Student.class);
	}

}
