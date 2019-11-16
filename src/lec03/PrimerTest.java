package lec03;

public class PrimerTest {
    public static boolean prime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0 || n < 2) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i != 0) continue;
            return false;
        }
        return true;
    }
}
