package com.raghu.test;

import java.io.Serializable;

public class Phone implements Serializable {
	private static final long serialVersionUID = 3875860424349502485L;
	private int number;
	
	private Acengcy agency;

	public Acengcy getAgency() {
		return agency;
	}

	public void setAgency(Acengcy agency) {
		this.agency = agency;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {

		return "Phone{" + "number=" + number + "Acency"+agency+'}';

	}
}
