//Alexandre Trzcinski-Préfontaine ID:0858514


public class Circle extends Shape{
	
	private double radius;
	
	
//Constructors
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, double radius){
		super(color, filled);
		this.radius = radius;
	}
	
	
//Getter and Setter
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
//toString()
	@Override
	public String toString() {
		return super.toString() + ", A circle with radius: " + radius;
	}
	
	
//getArea and getPerimeter
	@Override
	public double getArea() {
		return Math.pow(radius, 2)*Math.PI ;
	}

	@Override
	public double getPerimeter() {
		return 2*(Math.PI*radius);
	}

}
