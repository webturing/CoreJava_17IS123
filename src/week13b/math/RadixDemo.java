package algorithm.math;

import java.util.Stack;

public class RadixDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 1023;
		//System.out.println(dec2bin(x));
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toString(x));
		System.out.println(Integer.toHexString(x));
		System.out.println(Integer.toString(x,36));

	}

	private static String dec2bin(int x) {
		String s = "";
		Stack<Integer> S = new Stack<Integer>();
		do {
			S.push(x % 2);
			x /= 2;
		} while (x > 0);
		while (!S.isEmpty()) {
			s = s + S.peek();
			S.pop();
		}
		return s;

	}

}
