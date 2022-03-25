package com.solid.ocp.goodExample;

/**
 * This is a example which supports the Open Close Principle. 
 * In this design we use abstract draw() method in GraphicEditor for drawing objects, while moving the implementation in the concrete shape objects. 
 * Using the Open Close Principle the problems from the badExample design are avoided, because GraphicEditor is not changed when a new shape class is added:
 * 
 * - no unit testing required.
 * - no need to understand the sourcecode from GraphicEditor.
 * - since the drawing code is moved to the concrete shape classes, it's a reduced risk to affect old functionality when new functionality is added.
 */
public class GraphicEditor {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		ge.drawShape(new Rectangle());
		ge.drawShape(new Circle());
	}
	
	public void drawShape(Shape o) {
		o.draw();
	}
}