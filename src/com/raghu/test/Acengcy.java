package com.raghu.test;

import java.io.Serializable;

public class Acengcy implements Serializable {
	
	private static final long serialVersionUID = -1996486664780131651L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {

		return "Agency{" + "Name=" + name +'}';

	}

}
