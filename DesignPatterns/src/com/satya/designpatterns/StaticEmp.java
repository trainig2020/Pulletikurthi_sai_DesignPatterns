package com.satya.designpatterns;

public class StaticEmp {
private int eid;
private String ename;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
private static StaticEmp empl;

static {
	try {
		
		empl=new StaticEmp();
		
	}catch(Exception e) {
		throw new RuntimeException("Exception has occured in creating static block");
		
	}
}

public static StaticEmp getInstance() {
	return empl;
	
}

private StaticEmp() {
	
}

}
