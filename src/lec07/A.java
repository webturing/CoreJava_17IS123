
public class A {
	static int x=0;
	int y=1;
	
	public static void main(String[] args) {
		int x=3,y=4;
		System.out.println(x);//0 or 3
		System.out.println(A.x);
		A a=new A();
		System.out.println(a.y);
		A b=new A();
		System.out.println(b.y);
		a.y++;
		System.out.println(a.y);
		a.x++;
		System.out.println(a.x);
		System.out.println(b.x);
		A c=null;
		//System.out.println(c.y);//Null
		System.out.println(c.x);

	}

}
