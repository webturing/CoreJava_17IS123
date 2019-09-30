package lec04;

class Main {
    public static void main(String[] args) {
        int n = 1234;
        int cnt = 0;
        for (int p = 3; p <= n / 2; p += 2) {
            if (primer(p) && primer(n - p)) {
                //System.out.println(n + "=" + p + "+" + (n - p));
                ++cnt;
            }
        }
        System.out.println(cnt);
    }

    private static boolean primer(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int c = 3; c * c <= n; c += 2) {
            if (n % c == 0)
                return false;
        }
        return true;
    }
}
