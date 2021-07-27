package com.shaunmelville.poc.attendance.persistence.dao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.shaunmelville.poc.attendance.persistence.model.Attendance;
import com.shaunmelville.poc.base.persistence.BaseDao;

@Component("attendanceDao")
public class AttendanceDao extends BaseDao {

	@PostConstruct
	public void init() {
		super.setClazz(Attendance.class);
	}

}
