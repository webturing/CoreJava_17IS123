package lec05;

public class Goldbach1 {
    static final int N = 200000;

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
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
