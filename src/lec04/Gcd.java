package lec04;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(6, 8) + " " + lcm(6, 8));

    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
