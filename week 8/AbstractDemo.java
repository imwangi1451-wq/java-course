// This program demonstrates abstract classes.
// An abstract class cannot be instantiated; it acts as a contract for subclasses.

abstract class Shape {
	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	public void displayName() {
		System.out.println("Shape: " + name);
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		// Shape cannot be instantiated because it is abstract.
		Shape myCircle = new Circle(5.0);
		Shape myRect = new Rectangle(4.0, 6.0);

		myCircle.displayName();
		System.out.println("Area: " + myCircle.calculateArea());

		System.out.println();

		myRect.displayName();
		System.out.println("Area: " + myRect.calculateArea());
	}
}
