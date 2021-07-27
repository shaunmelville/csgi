package com.shaunmelville.poc.subject.persistence.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent subject for the subject_schedule database table.
 * 
 */
@Entity
@Table(name = "subject_schedule")
@NamedQuery(name = "SubjectSchedule.findAll", query = "SELECT c FROM SubjectSchedule c")
public class SubjectSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "subject_schedule_uuid")
	private UUID subjectScheduleuuid;

	@Column(name = "subject_uuid")
	private String subjectuuid;

	@Column(name = "datetime_from")
	private Timestamp datetimeFrom;

	@Column(name = "datetime_to")
	private Timestamp datetimeTo;

	public SubjectSchedule() {
	}

	public UUID getSubjectScheduleuuid() {
		return this.subjectScheduleuuid;
	}

	public void setSubjectScheduleuuid(UUID subjectScheduleuuid) {
		this.subjectScheduleuuid = subjectScheduleuuid;
	}

	public String getSubjectuuid() {
		return this.subjectuuid;
	}

	public void setSubjectUuid(String subjectuuid) {
		this.subjectuuid = subjectuuid;
	}

	public Timestamp getDatetimeFrom() {
		return this.datetimeFrom;
	}

	public void setDatetimeFrom(Timestamp datetimeFrom) {
		this.datetimeFrom = datetimeFrom;
	}

	public Timestamp getDatetimeTo() {
		return this.datetimeTo;
	}

	public void setDatetimeTo(Timestamp datetimeTo) {
		this.datetimeTo = datetimeTo;
	}

}