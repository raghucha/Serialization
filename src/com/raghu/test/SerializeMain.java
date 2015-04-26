package com.raghu.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SerializeMain {

	public static void main(String[] args) throws ParseException {
		
		List<Phone> phone = new ArrayList<Phone>();
		for (int i = 0; i < 10; i++) {
			Phone ph = new Phone();
			Acengcy ag = new Acengcy();
			ag.setName("raghusammeta");
			ph.setAgency(ag);
			ph.setNumber(i);
			phone.add(ph);
		}
		/*Date d= new Date();
		System.out.println(d);*/
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 Date d = dateFormat.parse("31/05/2011");
		 /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		 LocalDate date = LocalDate.parse("31/05/2011", formatter);
		 date.*/
		
		System.out.println(d);
			
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Raghu");
		emp.setDepartment("ECE");
		Address address = new Address(88, "MG road", "Pune",d,phone);
		emp.setAddress(address);

		try {
			FileOutputStream fileOut = new FileOutputStream("F:\\test.txt");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

		Employee emp1 = null;
		try {
			FileInputStream fileIn = new FileInputStream("F:\\test.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp1 = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Emp id: " + emp1.getEmployeeId());
		System.out.println("Name: " + emp1.getEmployeeName());
		System.out.println("Department: " + emp1.getDepartment());
		 for(Phone num:emp1.getAddress().getNumber()){
			 System.out.println("Address " + num);
		 }
		System.out.println(emp1.getAddress().getDate());
		

	}

}
