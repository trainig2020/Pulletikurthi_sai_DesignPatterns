package com.satya.composite;

public class Triangle implements Shape {

	@Override
	public void draw(String fillColour) {
		System.out.println("Triangle Color is "+fillColour);
		
	}

}
