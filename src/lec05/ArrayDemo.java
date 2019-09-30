package lec05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // int a[3];
        int a[] = new int[3];
        int[] b = new int[3];
        int[] c = {1, 2, 3, 4};
        System.out.println(a.length);//3
        //output 1 by index write&read
        for (int i = 0; i < b.length; i++) {
            b[i]++;
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //output 2 for_each readOnly
        for (int e : c) {
            e++;
            System.out.print(e + " ");
        }
        System.out.println();
        //output 3 dump array
        System.out.println(Arrays.toString(c));
        int[] d = new int[]{3, 4, 5, 6};

    }
}
