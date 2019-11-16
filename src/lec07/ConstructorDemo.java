package test;
class A{
	int x;
	public A(int x) {//Constructor
		this.x=x;
	}
	
}
public class ConstructorDemo {
public static void main(String[] args) {
	//new A();
	A b=new A(1);
	System.out.println(b.x);
}

}
