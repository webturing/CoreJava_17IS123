package lec0708midcontest;

import java.util.Arrays;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        long[] f = new long[21];//数组
        f[1] = f[2] = 1;//初始化
        for (int i = 3; i < f.length; i++) {//递推
            if (i % 2 == 0) f[i] = f[i - 1];
            else f[i] = f[i - 2] * i;
        }
        System.err.println(Arrays.toString(f));
        for (int i = 2; i < f.length; i++) {//部分和
            f[i] += f[i - 1];
        }
        System.err.println(Arrays.toString(f));
        for (int T = cin.nextInt(); T-- > 0; System.out.println(f[cin.nextInt()])) ;
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);
}

