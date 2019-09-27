package lec04;

public class Binormial {
    public static void main(String[] args) {
        System.out.println(cnr(28, 26));
    }

    private static int cnr(int n, int r) {
        if (r * 2 > n) return cnr(n, n - r);
        if (r == n || r == 0) return 1;
        return cnr(n - 1, r - 1) + cnr(n - 1, r);
    }

}
