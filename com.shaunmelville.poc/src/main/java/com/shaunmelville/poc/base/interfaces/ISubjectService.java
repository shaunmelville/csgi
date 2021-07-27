package com.shaunmelville.poc.base.interfaces;

import java.util.List;

import com.shaunmelville.poc.subject.persistence.model.SubjectSchedule;
import com.shaunmelville.poc.subject.pojo.SubjectRequestDto;
import com.shaunmelville.poc.subject.pojo.SubjectResponseDto;
import com.shaunmelville.poc.subject.pojo.SubjectScheduleRequestDto;
import com.shaunmelville.poc.subject.pojo.SubjectScheduleResponseDto;

public interface ISubjectService {

	public SubjectResponseDto addSubject(SubjectRequestDto subject);

	public List<SubjectSchedule> getSubjectSchedules();

	public SubjectScheduleResponseDto addSubjectSchedule(SubjectScheduleRequestDto subjectScheduleDto);

}
