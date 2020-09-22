package com.satya.adapter;



public class AdapterPatternMain {

	public static void main(String[] args) {
		SocketClass socketClass=new SocketClass();
	System.out.println(	"For 120 Volts"+socketClass.get120Volt());
	System.out.println(	"For 12 Volts"+socketClass.get12Volt());
	System.out.println(	"For 3 Volts"+socketClass.get3Volt());
	
	SocketObject socketObject=new SocketObject();
	System.out.println(	"For 120 Volts"+socketObject.get120Volt());
	System.out.println(	"For 12 Volts"+socketObject.get12Volt());
	System.out.println(	"For 3 Volts"+socketObject.get3Volt());
	
	}
}
