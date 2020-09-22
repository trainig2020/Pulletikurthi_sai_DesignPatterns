package com.satya.designpatterns;

public class Employee {
private int id;
private String name;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//eager initialization
private static final Employee emp=new Employee();


public static Employee getInstance() {
	return emp;
}
private Employee() {
	
}
}
