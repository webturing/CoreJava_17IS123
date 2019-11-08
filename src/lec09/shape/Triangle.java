package lec09.shape;

public class Triangle extends Shape2D {
	double a,b,c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	double getPerimeter() {

		return a+b+c;
	}

	@Override
	double getArea() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	
	
}
