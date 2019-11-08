package lec09;

public class Demo1 {
	int a;
	static int x;
	static int f[];
	static {
		f = new int[10];
	//	a++;
	}

	static int g() {
		x++;
		return x;
	}

	

	int h() {
		x++;
		a++;
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Demo1.f[0]);
		Demo1 d=new Demo1();
		System.out.println(d.x);
		System.out.println(Demo1.x);
		System.out.println(d.a);
		d.g();

	}

}
