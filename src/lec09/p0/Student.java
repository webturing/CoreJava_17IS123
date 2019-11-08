package lec09.p0;

public class Student extends Person {
	void work(){
		System.out.println("�ú�ѧϰ,��������");
	}
	public static void main(String[] args) {
		//RTTI RunTime Type Identification
		Student s1 = new Student();
		s1.grow();
		Person p = new Student();
		p = new Worker();
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		System.out.println(p instanceof Worker);
	}

}
