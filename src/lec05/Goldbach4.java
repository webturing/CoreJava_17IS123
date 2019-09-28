package lec05;

import java.util.Arrays;

public class Goldbach4 {
    static final int N = 40000000;
    static int A[] = new int[N];

    static void fill() {
        //for(int i=0;i<N;i++)A[i]=1;
        Arrays.fill(A, 1);
        A[0] = A[1] = 0;
        for (int i = 2; i * i <= N; i++) {
            if (A[i] == 1) {
                for (int j = 2 * i; j < N; j += i) {
                    A[j] = 0;
                }
            }
        }
    }

    private static boolean test(int n) {
        for (int p = 3; p <= n / 2; p += 2) {
            if (A[p] == 1 && A[n - p] == 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        fill();
        for (int n = 6; n <= N; n += 2) {
            if (!test(n)) {
                System.out.println("Congratulations,goldbach theory is wrong for n=" + n);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + " Second(s).");


    }
}
