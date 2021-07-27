package com.shaunmelville.poc.attendance.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * The persistent class for the attendance database table.
 * 
 */
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "subject_schedule_uuid", "student_uuid" }) })
@NamedQuery(name = "Attendance.findAll", query = "SELECT a FROM Attendance a")
@NamedQuery(name = "Attendance.findByDate", query = "SELECT a FROM Attendance a")
public class Attendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "attendance_uuid")
	private UUID attendanceUuid;

	@NotNull
	@Column(name = "subject_schedule_uuid")
	private String subjectScheduleUuid;

	@Temporal(TemporalType.DATE)
	private Date date;

	@NotNull
	@Column(name = "student_uuid")
	private String studentUuid;

	public Attendance() {
	}

	public Attendance(String subjectScheduleUuid, Date date, String studentUuid) {
		super();
		this.subjectScheduleUuid = subjectScheduleUuid;
		this.date = date;
		this.studentUuid = studentUuid;
	}

	public UUID getAttendanceUuid() {
		return this.attendanceUuid;
	}

	public void setAttendanceUuid(UUID attendanceUuid) {
		this.attendanceUuid = attendanceUuid;
	}

	public String getSubjectScheduleUuid() {
		return this.subjectScheduleUuid;
	}

	public void setSubjectScheduleUuid(String subjectScheduleUuid) {
		this.subjectScheduleUuid = subjectScheduleUuid;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStudentUuid() {
		return this.studentUuid;
	}

	public void setStudentUuid(String studentUuid) {
		this.studentUuid = studentUuid;
	}

}