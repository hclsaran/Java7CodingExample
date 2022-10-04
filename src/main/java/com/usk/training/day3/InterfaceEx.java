package com.usk.training.day3;

public class InterfaceEx {

	public static void main(String args[]) {
		Shape shape = new Circle();
		shape.draw();
		shape.area();
		shape = new Triangle();
		shape.draw();
		shape.area();
	}
}

interface Shape {

	void draw();

	void area();
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

	@Override
	public void area() {
		System.out.println("Calculating circle area...");
	}

}

class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing triangle");
	}

	@Override
	public void area() {
		System.out.println("Calculating triangle area...");
	}

}
