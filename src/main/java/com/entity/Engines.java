package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "engines")
public class Engines {
	@Id
	@Column(name = "engine_id")
	private int eid;
	private String fuel;
	private int cc;

	@OneToOne
	private Cars cars;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Cars getCar() {
		return cars;
	}

	public void setCar(Cars cars) {
		this.cars = cars;
	}

}
