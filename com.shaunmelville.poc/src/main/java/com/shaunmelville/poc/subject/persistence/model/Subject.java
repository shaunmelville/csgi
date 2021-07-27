package com.shaunmelville.poc.subject.persistence.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent Subject for the Subject database table.
 * 
 */
@Entity
@NamedQuery(name = "Subject.findAll", query = "SELECT c FROM Subject c")
public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private UUID subjectUuid;

	private String name;

	public Subject() {
	}

	public UUID getSubjectUuid() {
		return this.subjectUuid;
	}

	public void setSubjectUuid(UUID subjectUuid) {
		this.subjectUuid = subjectUuid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}