package com.springboot.docker.chuck;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class ChuckFact implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String fact;

	public ChuckFact() {
		super();
	}

	public ChuckFact(int id, String string) {
		this.id = id;
		this.fact = string;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the fact
	 */
	public String getFact() {
		return fact;
	}

}