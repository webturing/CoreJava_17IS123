package lec08midcontest;

import java.util.Scanner;

public class D {
    private static int f(long n, long m) {
        if (m % n != 0) return -1;
        long r = m / n;
        int tot = 0;
        while (r % 2 == 0) {
            r /= 2;
            ++tot;
        }
        while (r % 3 == 0) {
            r /= 3;
            ++tot;
        }
        return r == 1 ? tot : -1;
    }

    public static void main(String[] args) {
        for (int T = cin.nextInt(); T-- > 0; ) {
            long n = cin.nextLong();
            long m = cin.nextLong();
            System.out.println(f(n, m));
        }
        cin.close();
    }


    static Scanner cin = new Scanner(System.in);
}

