package lec09.visibility;

public class D extends A{
	void g(){
		//privateField++;
		protectedField++;
		packageField++;
		publicField++;
	}

}
