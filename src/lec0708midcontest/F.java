package lec0708midcontest;

import java.util.Arrays;
import java.util.Scanner;
 
public class F {
 
    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] a = new int[n];
            int flag = cin.nextInt();
            for (int i = 0; i < n; i++)
                a[i] = cin.nextInt();
            Arrays.sort(a);
            if (flag == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
 
    }
 
    static Scanner cin = new Scanner(System.in);
 
}