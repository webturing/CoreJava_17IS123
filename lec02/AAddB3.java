package io;

import java.util.Scanner;

public class AAddB3 {

	/**
	 * 3
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
		int T=cin.nextInt();//T=3;
		//for(int i=0;i<T;i++)
		//for(int i=1;i<=T;i++)
		while(T-->0)
		{
			int a=cin.nextInt();
			int b=cin.nextInt();
			System.out.println(a+b);
		}

	}

}
