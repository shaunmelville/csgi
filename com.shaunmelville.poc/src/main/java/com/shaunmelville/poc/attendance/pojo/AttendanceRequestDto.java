package com.shaunmelville.poc.attendance.pojo;

import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;

public class AttendanceRequestDto extends BaseResponseDto {

	private String subjectScheduleUuid;

	private String studentUuid;

	public String getSubjectScheduleUuid() {
		return subjectScheduleUuid;
	}

	public void setSubjectScheduleUuid(String subjectScheduleUuid) {
		this.subjectScheduleUuid = subjectScheduleUuid;
	}

	public String getStudentUuid() {
		return studentUuid;
	}

	public void setStudentUuid(String studentUuid) {
		this.studentUuid = studentUuid;
	}

}
