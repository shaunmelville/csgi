package com.shaunmelville.poc.subject.persistence.dao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.shaunmelville.poc.base.persistence.BaseDao;
import com.shaunmelville.poc.subject.persistence.model.Subject;

@Component("subjectDao")
public class SubjectDao extends BaseDao {

	@PostConstruct
	public void init() {
		super.setClazz(Subject.class);
	}

}
