package com.shaunmelville.poc.base.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shaunmelville.poc.attendance.pojo.AttendanceReportRequestDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceReportResponseDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceRequestDto;
import com.shaunmelville.poc.attendance.pojo.AttendanceResponseDto;
import com.shaunmelville.poc.base.interfaces.IAttendanceService;
import com.shaunmelville.poc.base.interfaces.ISubjectService;
import com.shaunmelville.poc.base.persistence.dao.BaseResponseDto;
import com.shaunmelville.poc.subject.persistence.model.SubjectSchedule;
import com.shaunmelville.poc.subject.pojo.SubjectRequestDto;
import com.shaunmelville.poc.subject.pojo.SubjectResponseDto;
import com.shaunmelville.poc.subject.pojo.SubjectScheduleRequestDto;
import com.shaunmelville.poc.subject.pojo.SubjectScheduleResponseDto;

@RestController
public class AttendanceController {

	@Autowired
	IAttendanceService attendanceservice;

	@Autowired
	ISubjectService subjectService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping(value = "/recordAttendance", consumes = "application/json", produces = "application/json")
	public AttendanceResponseDto recordAttendance(@RequestBody AttendanceRequestDto dto) {

		return attendanceservice.createAttendance(dto);

	}

	@PostMapping(value = "/reportOnAttendance", consumes = "application/json", produces = "application/json")
	public AttendanceReportResponseDto reportOnAttendance(@RequestBody AttendanceReportRequestDto dto) {

		return attendanceservice.reportOnAttendance(dto);

	}

	@GetMapping(value = "/getSubjectSchedules", produces = "application/json")
	public List<SubjectScheduleRequestDto> getClassSchedules() {

		List<SubjectSchedule> subjectSchedules = subjectService.getSubjectSchedules();

		List<SubjectScheduleRequestDto> subjectSchedulesDtoList = new ArrayList<SubjectScheduleRequestDto>();

		subjectSchedules.stream().forEach(p -> {
			subjectSchedulesDtoList.add(this.modelMapper.map(p, SubjectScheduleRequestDto.class));
		});

		return subjectSchedulesDtoList;
	}

	@PostMapping(value = "/addSubject", consumes = "application/json", produces = "application/json")
	public SubjectResponseDto addSubject(@RequestBody SubjectRequestDto dto) {

		return subjectService.addSubject(dto);
	}

	@PostMapping(value = "/addSubjectSchedule", consumes = "application/json", produces = "application/json")
	public SubjectScheduleResponseDto addSubject(@RequestBody SubjectScheduleRequestDto dto) {

		return subjectService.addSubjectSchedule(dto);
	}

	@GetMapping(value = "/helloAttendance", produces = "application/json")
	public BaseResponseDto helloAttendance() {

		return new BaseResponseDto(true, "Hello there attendance world",
				"Please make use of all my attendance services");
	}
}
