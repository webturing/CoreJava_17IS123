
public class App {

	/**
	 * @param args
	 * 1/1+1/2+1/3+1/4...+1/10;
	 */
	public static void main(String[] args) {
		Fraction s=new Fraction(0,1);
		for(int i=1;i<=10;i++){
			s=s.add(new Fraction(1,i));
		}
		System.out.println(s);

	}

}
