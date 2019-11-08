package lec09.visibility;

public class A {
	private int privateField;
	protected int protectedField;
	int packageField;
	public int publicField;
	
	void g(){
		privateField++;
		protectedField++;
		packageField++;
		publicField++;
		
	}

}
