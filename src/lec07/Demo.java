package lec07;

public class Demo {
    final static int MOD = 1000000;

    public static void main(String[] args) {
        int[] a = new int[25];
        a[1] = 1;
        for (int i = 2; i <= 24; i++) {
            a[i] = (a[i - 1] * i) % MOD;

        }
        int s = 0;
        for (int i = 1; i <= 24; i++)
            s = (s + a[i]) % MOD;
        System.out.println(s);
    }
}
