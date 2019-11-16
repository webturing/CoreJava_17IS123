package lec05;

import java.util.Arrays;

public class FactorialArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 1;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] * i;
        }
        System.out.println(Arrays.toString(a));
        int n = 40585;
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s += a[d];
            n /= 10;
        }
        System.out.println(s);

    }
}
