package lec09.shape;

public class Cirlce extends Shape2D {
	double radius;

	public Cirlce(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	double getArea() {
		return Math.PI*radius*radius;
	}
	
	
}
