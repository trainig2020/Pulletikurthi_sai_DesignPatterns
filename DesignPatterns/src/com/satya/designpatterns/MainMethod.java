package com.satya.designpatterns;

public class MainMethod {
public static void main(String[] args) {
//Eager Initialization	
Employee emp1=Employee.getInstance();
Employee emp2=Employee.getInstance();

emp1.setId(1);
emp1.setName("sai");
//emp2.setId(19);
System.out.println("Eager Iniatialization id is"+" "+emp2.getId()+" Name is"+ " "+emp2.getName());

//Lazy Initialization
Department dept=Department.getInstance();
Department dept2=Department.getInstance();
dept.setDeptid(20);
dept.setDeptname("Ece");
System.out.println("Lazy initialization id is"+" "+dept2.getDeptid()+" Name is "+" "+dept2.getDeptname());

//Static Block
StaticEmp empl=StaticEmp.getInstance();
empl.setEid(19);
empl.setEname("satya");
System.out.println("Static Block id is"+" "+empl.getEid()+" Name is "+" "+empl.getEname());

//Thread Safe 
ThreadEmp templ=ThreadEmp.getInstance();
templ.setTid(12);
templ.setTname("Raju");
System.out.println("Thread safe id is "+" "+templ.getTid()+" Name is " +" "+templ.getTname());


//BillPugh Singleton
BillPughEmp bempl=BillPughEmp.getInstance();
BillPughEmp bempl2=BillPughEmp.getInstance();
bempl.setBid(16);
bempl2.setBname("Rakesh");
System.out.println("BillPugh Employee Id is "+bempl.getBid()+" Name is "+bempl.getBname());

}
}
