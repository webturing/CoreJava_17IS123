package p0;
public class Person {
	String name;
	int age;

	void work() {
		System.out.println("人民有信仰,国家有力量,民族有希望!");
	}

	void grow() {
		++age;
	}

	void show() {
		System.out.print("Hello everybody:");
		System.out.println("My name is " + name + ".");
		System.out.println("I am " + age + " year(s) old.");
		System.out.println("Thank you!");
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Tom";
		p.age=18;
		p.grow();
		p.show();
		p.work();
	}

}
