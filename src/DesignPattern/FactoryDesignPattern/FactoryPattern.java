package DesignPattern.FactoryDesignPattern;


           // Factory Design Pattern
/*
 * Step 1: Define an interface
 * Step 2: Implement concrete classes
 *  Step 3:  Define the Factory interface
 *  Step 4: Implement Factory classes for each shape type
 *  Usage (main method class to call)
 * */
interface Shape{
	void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("circle in shape");
	}
}

class Square implements Shape{
	
	public void draw() {
		
		System.out.println("square in shape");
	}
}

interface ShapeFactory{
	Shape createShape();
}
//Step 4: Implement Factory classes for each shape type
class CircleFactory implements ShapeFactory{
	public Shape createShape() {
		return new Circle();
	}
}
class SqaueFactory implements ShapeFactory{
	public Shape createShape () {
		return new Square();
	}
} 

public class FactoryPattern {
	
	public static void main(String []args) {
		ShapeFactory circle1=new CircleFactory();
		Shape circle2 =circle1.createShape();
		circle2.draw();
		
		ShapeFactory square1=new SqaueFactory();
		Shape square2=square1.createShape();
		square2.draw();
	}
	
	

}
