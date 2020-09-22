package com.satya.composite;

public class ShapeMain {
public static void main(String[] args) {
	Shape circle=new Circle();
	Shape triangle=new Triangle();
	
	
	Drawing drawing=new Drawing();
	drawing.add(triangle);
	drawing.draw("Red");
	drawing.Clear();
	
	drawing.add(circle);
	drawing.draw("Green");
	
	
	
}
}
