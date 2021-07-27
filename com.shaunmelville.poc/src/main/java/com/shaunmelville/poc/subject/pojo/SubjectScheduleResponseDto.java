package com.shaunmelville.poc.subject.pojo;

import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;
import com.shaunmelville.poc.subject.persistence.model.SubjectSchedule;

public class SubjectScheduleResponseDto extends BaseResponseDto {

	private SubjectSchedule subjectScheduleEntity;

	public SubjectScheduleResponseDto() {
		super();
	}

	public SubjectScheduleResponseDto(boolean success, String message, String suggestion) {
		super(success, message, suggestion);
	}

	public SubjectSchedule getSubjectScheduleEntity() {
		return subjectScheduleEntity;
	}

	public void setSubjectScheduleEntity(SubjectSchedule subjectScheduleEntity) {
		this.subjectScheduleEntity = subjectScheduleEntity;
	}

}