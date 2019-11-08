package lec09.exDom;
import lec09.visibility.A;

public class C {
	void f()
	{
		A a=new A();
		//a.privateField++;
		//a.protectedField++;
		//a.packageField++;
		a.publicField++;
	}
}
