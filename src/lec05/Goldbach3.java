package lec05;

public class Goldbach3 {
    static final int N = 10000000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int n = 6; n <= N; n += 2) {
            if (!test(n)) {
                System.out.println("Congratulations,goldbach theory is wrong for n=" + n);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + " Second(s).");
    }

    private static boolean test(int n) {
        for (int p = 3; p <= n / 2; p += 2) {
            if (primer(p) && primer(n - p)) return true;
        }
        return false;
    }

    private static boolean primer(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
