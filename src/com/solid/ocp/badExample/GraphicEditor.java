package com.solid.ocp.badExample;

/**
 * This is an example which violates the Open Close Principle. 
 * It implements a graphic editor which handles the drawing of different shapes. 
 * It's obviously that it does not follow the Open Close Principle since the GraphicEditor class has to be modified for every new shape class that has to be added.
 * 
 * There are several disadvantages:
 * 
 * - for each new shape added the unit testing of the GraphicEditor should be redone.
 * - when a new type of shape is added the time for adding it will be high since the developer who add it should understand the logic of the GraphicEditor.
 * - adding a new shape might affect the existing functionality in an undesired way, even if the new shape works perfectly.
 */
public class GraphicEditor {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		ge.drawShape(new Rectangle());
		ge.drawShape(new Circle());
	}
	
	public void drawShape(Shape o) {
		if (o.type == 1) {
			this.drawRectangle((Rectangle) o);
		} else if (o.type == 2) {
			this.drawCircle((Circle) o);
		}
	}
	
	public void drawRectangle(Rectangle o) {
		System.out.println("[]");
	}
	
	public void drawCircle(Circle o) {
		System.out.println("O");
	}
}