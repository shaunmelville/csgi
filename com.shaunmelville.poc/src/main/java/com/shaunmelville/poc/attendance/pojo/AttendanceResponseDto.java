package com.shaunmelville.poc.attendance.pojo;

import com.shaunmelville.poc.attendance.persistence.model.Attendance;
import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;

public class AttendanceResponseDto extends BaseResponseDto {

	private Attendance attendanceEntity;

	public Attendance getAttendanceEntity() {
		return attendanceEntity;
	}

	public AttendanceResponseDto() {
		super();
	}

	public AttendanceResponseDto(boolean success, String message, String suggestion) {
		super(success, message, suggestion);
	}

	public void setAttendanceEntity(Attendance attendanceEntity) {
		this.attendanceEntity = attendanceEntity;
	}

}
