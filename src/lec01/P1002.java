package lec01;

import java.util.Scanner;

public class P1002 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		double x1, x2;
		double delta = Math.sqrt(b * b - 4 * a * c);
		x1 = (-b - delta) / (2 * a);
		x2 = (-b + delta) / (2 * a);
		if (x1 < x2) {
			double t = x1;
			x1 = x2;
			x2 = t;
		}
		System.out.printf("%.2f %.2f", x1, x2);
	}
}
