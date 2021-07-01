//Alexandre Trzcinski-Préfontaine ID:0858514


public class Rectangle extends Shape{
	
	private double width;
	
	private double length;
	
	
//Constructors
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(String color, boolean filled, double width, double length){
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	
//Getters and Setters
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	
//toString()
	@Override
	public String toString() {
		return super.toString() + ", A rectangle with width : " + width + " and length: " + length;
	}
	
	
//getArea and getPerimeter
	@Override
	public double getArea() {
		
		return width*length;
	}

	@Override
	public double getPerimeter() {

		return width*2+length*2;
	}

}
