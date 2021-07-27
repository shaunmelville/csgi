package com.shaunmelville.poc.subject.persistence.dao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.shaunmelville.poc.base.persistence.BaseDao;
import com.shaunmelville.poc.subject.persistence.model.SubjectSchedule;

@Component("subjectScheduleDao")
public class SubjectScheduleDao extends BaseDao {

	@PostConstruct
	public void init() {
		super.setClazz(SubjectSchedule.class);
	}

}
