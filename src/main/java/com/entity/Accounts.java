package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Accounts {
	@Id
	private int acid;
	private String acname;
	private int acbal;
	@ManyToOne
	private Bankk bankk;

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

	public Bankk getBankk() {
		return bankk;
	}

	public void setBankk(Bankk bankk) {
		this.bankk = bankk;
	}
}
