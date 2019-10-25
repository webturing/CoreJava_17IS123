package visibility;

public class D extends A{
	void g(){
		//privateField++;
		protectedField++;
		packageField++;
		publicField++;
	}

}
