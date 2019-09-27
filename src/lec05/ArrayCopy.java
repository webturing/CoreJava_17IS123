package lec05;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4,};
        int[] b = a;//shallow copy
        b[0]++;
        System.out.println(Arrays.toString(a));
        int[] c = new int[a.length];//deeply copy
        for (int i = 0; i < a.length; i++) c[i] = a[i];
        System.out.println(Arrays.toString(c));
        c[0]++;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(a));
        int[] d = c.clone();
        d[0]++;
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(c));
    }
}
