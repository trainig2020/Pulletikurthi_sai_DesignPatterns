package com.satya.prototype;

import java.util.List;

public class ProtypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeProtoType emps =new EmployeeProtoType();
		emps.data();
		
		//Use the clone method to get the Employee object
		EmployeeProtoType empsNew = (EmployeeProtoType) emps.Clone();
		EmployeeProtoType empsNew1 = (EmployeeProtoType) emps.Clone();
		List<String> list = empsNew.getEmplist();
		list.add("John");
		List<String> list1 = empsNew1.getEmplist();
		list1.remove("sai");
		
		System.out.println("emps List: "+emps.getEmplist());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}
