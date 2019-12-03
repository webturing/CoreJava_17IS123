package algorithm.math;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]=new int[]{1,3,5,2,4,6,8,0,7,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Integer[] b={1,3,4,5,7,2,4,0,8,9,};
		Arrays.sort(b);
		Arrays.sort(b,Collections.reverseOrder());
		Arrays.sort(b,new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
			
		});

	}

}
