import java.util.Arrays;
import java.util.Comparator;

public class Fraction extends Object {
	  int up, down;

	public Fraction(int up, int down) {
		this.up = up;
		this.down = down;
		this.rationalize();
	}

	public static void main(String[] args) {
		Fraction f = new Fraction(2, 12);
		System.out.println(f);
		Fraction g = new Fraction(3, 9);
		Fraction h = f.add(g);
		System.out.println(h);
		Fraction[] arr={f,g,h};
		Arrays.sort(arr,new Comparator<Fraction>(){

			@Override
			public int compare(Fraction o1, Fraction o2) {
				// TODO Auto-generated method stub
				//return o1.down-o2.down;
				double d1=1.0*o1.up/o1.down;
				double d2=1.0*o2.up/o2.down;
				if(d1<d2)return -1;
				if(d1>d2)return 1;
				return 0;
			}
			
		});
		System.out.println(Arrays.toString(arr));
	}

	Fraction add(Fraction that) {
		int up = this.up * that.down + this.down * that.up;
		int down = this.down * that.down;
		return new Fraction(up, down);
	}

	@Override
	public String toString() {

		return up + "/" + down;
	}

	void rationalize() {
		int g = gcd(up, down);
		this.up /= g;
		this.down /= g;

	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
