package app;

import java.util.Arrays;

public class P1152SqrtN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {// O(Sqrt(2N))
		long n = 15;
		n *= 2;
		long start = System.currentTimeMillis();
		for (long p = (int) Math.sqrt(n); p >= 1; p--) {
			if (n % p != 0)
				continue;
			long q = n / p;
			// solve a+b==q && b-a+1==p
			// =>a=(q-p+1)/2 b=(p+q-1)/2
			long a = (q - p + 1) / 2;
			long b = (p + q - 1) / 2;
			if ((a + b) * (b - a + 1) == n && b >= a + 1)
				System.out.println(a + " " + b);
		}

		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0 + "Second(s).");

	}

}
