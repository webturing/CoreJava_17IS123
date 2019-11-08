package lec08midcontest;

import java.util.Scanner;

public class C {
    static long f(int n) {//n!!
        long result = 1;
        for (int i = 3; i <= n; i += 2) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int T = cin.nextInt(); T-- > 0; ) {
            int n = cin.nextInt();
            long sum = 0;
            for (int i = 1; i <= n; i++) sum += f(i);
            System.out.println(sum);
        }
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);
}

