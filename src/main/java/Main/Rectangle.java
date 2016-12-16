package Main;

public class Rectangle {

	private double length;
	private double breadth;
	
	public Rectangle(){
		length = 0.0;
		breadth = 0.0;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}
	
	public Rectangle(double l, double b){
		this.length = l;
		this.breadth = b;
	}
	
	public double getArea(){
		double AreaRectangle = length * breadth;
		return AreaRectangle;
	}
	
	public String toString() {
		return ("Length of the rectangle " + this.length + ","
				+ "Breadth of the triangle " + this.breadth);
	}
}
