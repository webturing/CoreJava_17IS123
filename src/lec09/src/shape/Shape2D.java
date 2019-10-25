package shape;

public class Shape2D {
	double getPerimeter(){
		return 0.0;
	}
	double getArea(){
		return 0.0;
	}
	void show(){
		System.out.println("Perimeter="+getPerimeter());
		System.out.println("Area="+getArea());
		
	}
	public static void main(String[] args) {
		Shape2D shape=new Shape2D();
		shape.show();
	}

}
