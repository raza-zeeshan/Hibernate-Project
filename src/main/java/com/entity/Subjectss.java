package com.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subjectss {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;

	@ManyToMany
	private Set<Studentss> studentss = new HashSet<>();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set<Studentss> getStudents() {
		return studentss;
	}

	public void setStudents(Set<Studentss> studentss) {
		this.studentss = studentss;
	}

}
