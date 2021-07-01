//Alexandre Trzcinski-Préfontaine ID:0858514


public class Driver {

	public static void main(String[] args) {
		
//Circle
		
		//constructor 1 + toString()
		Circle c1 = new Circle();
		System.out.println("c1.toString(): " + c1.toString() + "\n");
		
		//constructor 2 + getArea and getPerimeter
		Circle c2 = new Circle(2.2);
		System.out.println("c2 Area: " + c2.getArea() + "\nc2 Perimeter: " + c2.getPerimeter() + "\n");
		
		//constructor 3 + setters
		Circle c3 = new Circle("Green", true, 40);
		System.out.println("c3.toString(): " + c3.toString() + "\n");
		c3.setRadius(35);
		c3.setColor("Purple");
		c3.setFilled(false);
		System.out.println("c3.toString(): " + c3.toString() + "\n\n");
		
//Rectangle
		
		//constructor 1 + toString()
		Rectangle r1 = new Rectangle();
		System.out.println("r1.toString(): " + r1.toString() + "\n");
		
		//constructor 2 + getArea and getPerimeter
		Rectangle r2 = new Rectangle(2, 5);
		System.out.println("r2 Area: " + r2.getArea() + "\nr2 Perimeter: " + r2.getPerimeter() + "\n");
		
		//constructor 3 + setters
		Rectangle r3 = new Rectangle("Green", true, 2, 5);
		System.out.println("r3.toString(): " + r3.toString() + "\n");
		r3.setWidth(3);
		r3.setLength(6);
		r3.setColor("Purple");
		r3.setFilled(false);
		System.out.println("r3.toString(): " + r3.toString() + "\n\n");
		
//Square
		
		//constructor 1 + toString
		Square s1 = new Square();
		System.out.println("s1.toString(): " + s1.toString() + "\n");
		
		//constructor 2 + getArea and getPerimeter
		Square s2 = new Square(10);
		System.out.println("s2 Area: " + s2.getArea() + "\ns2 Perimeter: " + s2.getPerimeter() + "\n");
		
		//constructor 3 + setters
		Square s3 = new Square("Green", true, 10);
		System.out.println("s3.toString(): " + s3.toString() + "\n");
		s3.setSide(15);
		System.out.println("s3 side: " + s3.getSide());
		s3.setLength(20);
		System.out.println("s3 side: " + s3.getSide());
		s3.setWidth(25);
		System.out.println("s3 side: " + s3.getSide());
		
	}
	//meghrigJAC
}
