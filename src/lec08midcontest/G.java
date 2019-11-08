package lec08midcontest;

import java.util.Arrays;
import java.util.Scanner;


public class G {

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int[] a = new int[3];
            a[0] = cin.nextInt();
            a[1] = cin.nextInt();
            a[2] = cin.nextInt();
            Arrays.sort(a);
            System.out.println(a[1]);
        }

    }

    static Scanner cin = new Scanner(System.in);

}
