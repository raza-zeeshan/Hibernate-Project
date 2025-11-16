package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cars {
	@Id
	@Column(name = "cid")
	private int id;
	private String name;
	private int price;

	@OneToOne(mappedBy = "cars", cascade = CascadeType.ALL)
	@JoinColumn(name = "engine_id")
	private Engines engines;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engines getEngines() {
		return engines;
	}

	public void setEngines(Engines engines) {
		this.engines = engines;
	}
}
