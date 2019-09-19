package lec02;

import java.util.Scanner;

public class AAddB2 {

	/**
	 * 1 2
	 * 3 4
	 * 5 6
	 * 
	 * 
	 * 3 
	 * 7
	 * 11
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		while(cin.hasNext())
		{
			int a=cin.nextInt();
			int b=cin.nextInt();
			System.out.println(a+b);
		}

	}

}
