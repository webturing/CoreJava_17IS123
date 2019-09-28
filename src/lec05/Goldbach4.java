import java.util.Arrays;

public class Goldbach4 {
    static int N = 50000000;
    static int A[] = new int[N+1];//0-N-1

    static void fill() {
       Arrays.fill(A,1);//0.假设所有的数都是素数
        A[0] = A[1] = 0;//1.删除0,1
        for (int c = 2; c * c <= N; c++) {
            if (A[c] == 1) {//如果c是第一个遇到的素数，
                for (int d = c * c; d < N; d += c) {//保留c,删除所有c的整数倍
                    A[d] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        fill();
        for (int n = 6; n <= N; n += 2) {
            if (!test(n)) {
                System.out.println("Congratulations, goldbach is wrong for n=" + n);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + " Second(s)");

    }
    private static boolean test(int n) {
        for (int p = 3; p <= n / 2; p += 2) {
            if (A[p]==1 && A[n-p]==1) {
                return true;
            }
        }
        return false;
    }
}
