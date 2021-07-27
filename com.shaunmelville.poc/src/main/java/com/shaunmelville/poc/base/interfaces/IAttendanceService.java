package com.shaunmelville.poc.base.interfaces;

import com.shaunmelville.poc.attendance.pojo.AttendanceReportRequestDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceReportResponseDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceRequestDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceResponseDto;

public interface IAttendanceService {

	public AttendanceResponseDto createAttendance(AttendanceRequestDto attendanceRequestDto);

	public AttendanceReportResponseDto reportOnAttendance(AttendanceReportRequestDto request);

}
