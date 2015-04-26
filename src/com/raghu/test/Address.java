package com.raghu.test;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Address implements Serializable {

	private static final long serialVersionUID = -3239980378124981113L;
	private int slno;  
	private String street;  
	private String city; 
	private Date date;
	private List<Phone> number;
	
	public Address(int slno, String street, String city,Date date ,List<Phone> number) {
		super();
		this.slno = slno;
		this.street = street;
		this.city = city;
		this.date=date;
		this.number = number;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Phone> getNumber() {
		return number;
	}
	public void setNumber(List<Phone> number) {
		this.number = number;
	}

}
