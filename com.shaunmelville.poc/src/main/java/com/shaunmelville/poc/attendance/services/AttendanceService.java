package com.shaunmelville.poc.attendance.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shaunmelville.poc.attendance.persistence.model.Attendance;
import com.shaunmelville.poc.attendance.pojo.AttendanceReportDetail;
import com.shaunmelville.poc.attendance.pojo.AttendanceReportRequestDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceReportResponseDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceRequestDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceResponseDto;
import com.shaunmelville.poc.base.interfaces.IAttendanceService;
import com.shaunmelville.poc.base.interfaces.IDao;
import com.shaunmelville.poc.student.persistence.model.Student;
import com.shaunmelville.poc.subject.persistence.model.Subject;
import com.shaunmelville.poc.subject.persistence.model.SubjectSchedule;

@Service
public class AttendanceService implements IAttendanceService {

	@Autowired
	@Qualifier("attendanceDao")
	private IDao<Attendance> attendanceDao;

	@Autowired
	@Qualifier("studentDao")
	private IDao<Student> studentDao;

	@Autowired
	@Qualifier("subjectScheduleDao")
	private IDao<SubjectSchedule> subjectScheduleDao;

	@Autowired
	@Qualifier("subjectDao")
	private IDao<Subject> subjectDao;

	@Autowired
	private ModelMapper modelMapper;

	private final static Logger logger = LoggerFactory.getLogger(AttendanceService.class);

	@Override
	public AttendanceResponseDto createAttendance(AttendanceRequestDto attendanceRequestDto) {

		Attendance attendance = modelMapper.map(attendanceRequestDto, Attendance.class);

		attendance.setDate(new Date());

		attendanceDao.create(attendance);

		AttendanceResponseDto attendanceResponseDto = new AttendanceResponseDto(true,
				"Attendance recorded successfully",
				String.format("Your attendance reference number is %s ", attendance.getAttendanceUuid()));

		attendanceResponseDto.setAttendanceEntity(attendance);

		return attendanceResponseDto;
	}

	@Override
	public AttendanceReportResponseDto reportOnAttendance(AttendanceReportRequestDto request) {

		AttendanceReportResponseDto attendanceReportResponseDto = new AttendanceReportResponseDto(true,
				"Report run successfully", "");

		attendanceReportResponseDto.setReportDateFrom(request.getDateFrom());
		attendanceReportResponseDto.setReportDateTo(request.getDateTo());

		attendanceReportResponseDto.setReportDetail(new ArrayList<AttendanceReportDetail>());

		List<Attendance> list = attendanceDao.findAll();

		for (Attendance attendance : list) {
			AttendanceReportDetail attendanceDetail = new AttendanceReportDetail();
			Student student = studentDao.findOne(attendance.getStudentUuid().toString());
			attendanceDetail.setStudentName(
					new StringBuilder(student.getFirstname()).append(" ").append(student.getLastname()).toString());
			attendanceReportResponseDto.getReportDetail().add(attendanceDetail);
		}

		return attendanceReportResponseDto;
	}
}
