package shape2;

public abstract class Shape2D {
	abstract double getPerimeter();
	abstract double getArea();
	void show(){
		System.out.println("Perimeter="+getPerimeter());
		System.out.println("Area="+getArea());
		
	}
}
