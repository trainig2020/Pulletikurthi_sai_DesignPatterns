package com.satya.designpatterns;

public class BillPughEmp {
private int bid;
private String bname;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
//BillPughSingleton Class
private static class EmpBill{
	private static final BillPughEmp bemp=new BillPughEmp();
	
}
public static  BillPughEmp getInstance() {
	return EmpBill.bemp;
}
private BillPughEmp() {
	super();
}

}
