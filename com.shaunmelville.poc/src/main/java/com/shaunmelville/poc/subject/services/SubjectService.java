package com.shaunmelville.poc.subject.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shaunmelville.poc.base.interfaces.IDao;
import com.shaunmelville.poc.base.interfaces.ISubjectService;
import com.shaunmelville.poc.subject.persistence.model.Subject;
import com.shaunmelville.poc.subject.persistence.model.SubjectSchedule;
import com.shaunmelville.poc.subject.pojo.SubjectRequestDto;
import com.shaunmelville.poc.subject.pojo.SubjectResponseDto;
import com.shaunmelville.poc.subject.pojo.SubjectScheduleRequestDto;
import com.shaunmelville.poc.subject.pojo.SubjectScheduleResponseDto;

@Service
public class SubjectService implements ISubjectService {

	@Autowired
	@Qualifier("subjectDao")
	private IDao<Subject> subjectDao;

	@Autowired
	@Qualifier("subjectScheduleDao")
	private IDao<SubjectSchedule> subjectScheduleDao;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SubjectResponseDto addSubject(SubjectRequestDto subjectDto) {

		Subject subject = subjectDao.create(modelMapper.map(subjectDto, Subject.class));

		SubjectResponseDto subjectResponseDto = new SubjectResponseDto(true, "Subject added successfully",
				String.format("Subject reference number is %s", subject.getSubjectUuid()));
		subjectResponseDto.setSubjectEntity(subject);
		return subjectResponseDto;
	}

	@Override
	public List<SubjectSchedule> getSubjectSchedules() {

		return subjectScheduleDao.findAll();
	}

	@Override
	public SubjectScheduleResponseDto addSubjectSchedule(SubjectScheduleRequestDto subjectScheduleRequestDto) {

		SubjectSchedule subjectSchedule = subjectScheduleDao
				.create(modelMapper.map(subjectScheduleRequestDto, SubjectSchedule.class));
		SubjectScheduleResponseDto subjectScheduleResponseDto = new SubjectScheduleResponseDto(true,
				"Subject schedule added succesfully",
				String.format("Subject schedule reference number is %s", subjectSchedule.getSubjectScheduleuuid()));

		subjectScheduleResponseDto.setSubjectScheduleEntity(subjectSchedule);

		return subjectScheduleResponseDto;
	}

}
