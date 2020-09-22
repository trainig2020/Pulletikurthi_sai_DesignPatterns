package com.satya.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProtoType implements Cloneable {
private List<String> emplist;

public EmployeeProtoType() {
	emplist=new ArrayList<String>();
}

public  EmployeeProtoType(List<String> list) {
	this.emplist = list;
}


public void data() {
	emplist.add("Satya");
	emplist.add("sai");
	emplist.add("Ramu");
	emplist.add("Krishna");
	
}
public List<String> getEmplist() {
	return emplist;
}
public Object Clone () throws CloneNotSupportedException {
	List<String> temp = new ArrayList<String>();
	for(String s : this.getEmplist()){
		temp.add(s);
	}
	return new EmployeeProtoType(temp);
	
}
}
