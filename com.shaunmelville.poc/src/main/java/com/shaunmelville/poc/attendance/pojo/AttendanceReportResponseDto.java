package com.shaunmelville.poc.attendance.pojo;

import java.util.Date;
import java.util.List;

import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;

public class AttendanceReportResponseDto extends BaseResponseDto {

	private Date reportDateFrom;
	private Date reportDateTo;
	private List<AttendanceReportDetail> reportDetail;

	public AttendanceReportResponseDto() {
		super();
	}

	public AttendanceReportResponseDto(boolean success, String message, String suggestion) {
		super(success, message, suggestion);
	}

	public Date getReportDateFrom() {
		return reportDateFrom;
	}

	public void setReportDateFrom(Date reportDateFrom) {
		this.reportDateFrom = reportDateFrom;
	}

	public Date getReportDateTo() {
		return reportDateTo;
	}

	public void setReportDateTo(Date reportDateTo) {
		this.reportDateTo = reportDateTo;
	}

	public List<AttendanceReportDetail> getReportDetail() {
		return reportDetail;
	}

	public void setReportDetail(List<AttendanceReportDetail> reportDetail) {
		this.reportDetail = reportDetail;
	}

}