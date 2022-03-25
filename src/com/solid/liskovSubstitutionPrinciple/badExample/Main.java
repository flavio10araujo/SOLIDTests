package com.solid.liskovSubstitutionPrinciple.badExample;

/**
 * This is the classic example for which the Liskov's Substitution Principle is violated.
 * 
 * In this example, 2 classes are used: Rectangle and Square. 
 * 
 * Let's assume that the Rectangle object is used somewhere in the application. 
 * We extend the application and add the Square class. 
 * The square class is returned by a factory pattern, based on some conditions and we don't know the exact what type of object will be returned. 
 * But we know it's a Rectangle. 
 * We get the rectangle object, set the width to 5 and height to 10 and get the area. 
 * For a rectangle with width 5 and height 10 the area should be 50. 
 * Instead the result will be 100!
 */
public class Main {

	public static void main(String[] args) {
		Rectangle r = Main.getNewRectangle();

		r.setWidth(5);
		r.setHeight(10);
		
		// User knows that r it's a rectangle. 
		
		// It assumes that he's able to set the width and height as for the base class.

		System.out.println(r.getArea());
		
		// Now he's surprised to see that the area is 100 instead of 50.
	}
	
	private static Rectangle getNewRectangle() {
		// It can be an object returned by some factory... 
		return new Square();
	}
}