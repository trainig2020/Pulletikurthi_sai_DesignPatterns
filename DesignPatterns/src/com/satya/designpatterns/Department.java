package com.satya.designpatterns;

public class Department {
private int deptid;
private String deptname;
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
private static Department dept;


private Department() {
	
}
//lazy initialization
public static Department getInstance () {
	if (dept==null) {
		dept=new Department();
		
	}
	return dept;
}
}


