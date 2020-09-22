package com.satya.designpatterns;

public class ThreadEmp {
private int tid;
private String tname;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}

private static ThreadEmp temp;

public static synchronized  ThreadEmp getInstance() {
	if(temp==null) {
		temp=new ThreadEmp();
		
	}
	return temp;
	
}
private ThreadEmp() {
	
}

}
