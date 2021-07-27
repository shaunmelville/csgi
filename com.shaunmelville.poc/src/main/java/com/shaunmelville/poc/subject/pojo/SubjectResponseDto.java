package com.shaunmelville.poc.subject.pojo;

import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;
import com.shaunmelville.poc.subject.persistence.model.Subject;

public class SubjectResponseDto extends BaseResponseDto {

	private Subject subjectEntity;

	public SubjectResponseDto() {
		super();

	}

	public SubjectResponseDto(boolean success, String message, String suggestion) {
		super(success, message, suggestion);
	}

	public Subject getSubjectEntity() {
		return subjectEntity;
	}

	public void setSubjectEntity(Subject subjectEntity) {
		this.subjectEntity = subjectEntity;
	}

}