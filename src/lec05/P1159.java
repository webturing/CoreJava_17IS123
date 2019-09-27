package lec05;

import java.util.Scanner;

public class P1159 {
    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = cin.nextInt();

            }
            // System.out.println(Arrays.toString(A));
            int max = A[0], min = A[0], sum = A[0];
            for (int i = 1; i < A.length; i++) {
                if (A[i] > max) max = A[i];
                if (A[i] < min) min = A[i];
                sum += A[i];
            }
            double avg = 1.0 * (sum - max - min) / (n - 2);
            System.out.println(String.format("%.2f", avg));
        }
    }

    static Scanner cin = new Scanner(System.in);
}
