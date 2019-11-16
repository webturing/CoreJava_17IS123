package lec04;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 0; i <= 25; i++) {
            System.out.println(i + "!=" + factorial(i));
        }
    }

    private static long factorial(int n) {
        if (n <= 1) return 1;
        return factorial(n - 1) * n;
    }


}
