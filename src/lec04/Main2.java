package lec04;

class Main2 {
    public static void main(String[] args) {
        int max = 1;
        for (int x = 100; x <= 200; x++) {
            int y = foo(x);
            if (y > max) max = y;
        }
        System.out.println(max);
    }

    private static int foo(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) return foo(n / 2) + 1;
        return foo(3 * n + 1) + 1;
    }

    private static int foo2(int n) {
        int result = 1;
        while (n != 1) {
            ++result;
            if (n % 2 == 0) n = n / 2;
            else
                n = 3 * n + 1;
        }
        return result;
    }


}
