package com.shaunmelville.poc.subject.pojo;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SubjectScheduleRequestDto {

	private String subjectScheduleuuid;
	private String subjectUuid;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private Timestamp datetimeFrom;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private Timestamp datetimeTo;

	public String getSubjectScheduleuuid() {
		return subjectScheduleuuid;
	}

	public void setSubjectScheduleuuid(String subjectScheduleuuid) {
		this.subjectScheduleuuid = subjectScheduleuuid;
	}

	public String getSubjectUuid() {
		return subjectUuid;
	}

	public void setSubjectUuid(String subjectUuid) {
		this.subjectUuid = subjectUuid;
	}

	public Timestamp getDatetimeFrom() {
		return datetimeFrom;
	}

	public void setDatetimeFrom(Timestamp datetimeFrom) {
		this.datetimeFrom = datetimeFrom;
	}

	public Timestamp getDatetimeTo() {
		return datetimeTo;
	}

	public void setDatetimeTo(Timestamp datetimeTo) {
		this.datetimeTo = datetimeTo;
	}

}