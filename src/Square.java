//Alexandre Trzcinski-Préfontaine ID:0858514


public class Square extends Rectangle {
	
	private double side;
	
	
//Constructors
	public Square(){
		side=1.0;
		super.setLength(1.0);
		super.setWidth(1.0);
		super.setColor("No color");
	}
	
	public Square(double side) {
		this.side = side;
		super.setLength(side);
		super.setWidth(side);
	}
	
	public Square(String color, boolean filled, double side) {
		super.setColor(color);
		super.setFilled(filled);
		this.side = side;
		super.setLength(side);
		super.setWidth(side);
	}
	
	
//Getters and Setters
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setLength(double length) {
		super.setLength(length);
		super.setWidth(length);
		this.side = length;
	}
	
	@Override
	public void setWidth(double width) {
		super.setLength(width);
		super.setWidth(width);
		this.side = width;
	}
	
	
//toString
	@Override
	public String toString() {
		return super.toString() + ", A square with side: " + side;
	}
	
	
//getArea and get Perimeter
	@Override
	public double getArea() {
		return super.getArea();
	}
	
	@Override
	public double getPerimeter() {
		return super.getPerimeter();
	}
	

	
	
}
