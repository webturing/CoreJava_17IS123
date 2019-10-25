package p0;
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//RTTI
		Person student = new Student();
		//student.show();
		Person teacher = new Teacher();
		//teacher.show();
		Person worker = new Worker();
		//worker.show();
		Person[] persons={student,teacher,worker};
		for(Person p:persons){
			p.work();
		}

	}

}
