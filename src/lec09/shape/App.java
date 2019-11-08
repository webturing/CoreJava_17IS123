package lec09.shape;

public class App {
	public static void main(String[] args) {
		Shape2D[] shapes={
				new Triangle(3,4,5),
				new Cirlce(10),
				new Rectangle(4,5),
		};
		for(Shape2D shape:shapes){
			shape.show();
		}
	}

}
