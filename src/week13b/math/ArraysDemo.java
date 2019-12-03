package week13b.math;

import java.util.Arrays;

public class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = new int[] { 1, 3, 5, 2, 4, 6, 8, 0, 17, 9 };
		Arrays.sort(a);
		int k = 7;
		System.out.println(Arrays.binarySearch(a, k));//log(N)
	}

}
