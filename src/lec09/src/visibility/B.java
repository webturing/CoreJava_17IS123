package visibility;

public class B {
	void f()
	{
		A a=new A();
		//a.privateField++;
		a.protectedField++;
		a.packageField++;
		a.publicField++;
	}
}
