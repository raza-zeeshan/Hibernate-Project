package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	private int acid;
	private String acname;
	private int acbal;

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public int getAcbal() {
		return acbal;
	}

	public void setAcbal(int acbal) {
		this.acbal = acbal;
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", acname=" + acname + ", acbal=" + acbal + "]";
	}

}
