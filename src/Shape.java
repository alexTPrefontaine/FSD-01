//Alexandre Trzcinski-Préfontaine ID:0858514


public abstract class Shape {
	
	private String color;
	private boolean filled;
	
	
//Constructors
	public Shape(){
		this.color = "No color";
	}
	
	public Shape(String color, boolean filled) {
		this.color =color;
		this.filled = filled;
	}
	
	
//Getters and Setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

//toString()	

	public String toString() {
		
		return "A Shape with color of " + color + " is " + (filled==true ?  "filled" : "not filled");
	
	}
	
	
//getArea and getPerimeter
	public abstract double getArea();
		
	public abstract double getPerimeter();
	
}
