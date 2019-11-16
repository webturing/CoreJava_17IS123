package lec05;

import java.util.Arrays;
import java.util.Scanner;

public class P1159b {
    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = cin.nextInt();
            }
            Arrays.sort(A);
            int sum = 0;
            for (int i = 1; i <= n - 2; i++) sum += A[i];
            double avg = 1.0 * sum / (n - 2);
            System.out.println(String.format("%.2f", avg));

        }
    }

    static Scanner cin = new Scanner(System.in);
}
