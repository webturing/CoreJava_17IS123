package lec09.shape;

public class Rectangle extends Shape2D {
	double length, width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	double getPerimeter() {
		
		return 2*length+2*width;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
