package com.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Studentss {
	@Id
	private int id;
	private int age;
	private String name;
	@ManyToMany(mappedBy = "studentss", cascade = CascadeType.ALL)
	private Set<Subjectss> subjectss = new HashSet<>();

	public void addSubject(Subjectss subject) {
		subjectss.add(subject);
		subject.getStudents().add(this);
	}

	public void removeSubject(Subjectss subject) {
		subjectss.remove(subject);
		subject.getStudents().remove(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Subjectss> getSubjects() {
		return subjectss;
	}

	public void setSubjects(Set<Subjectss> subjectss) {
		this.subjectss = subjectss;
	}

}
