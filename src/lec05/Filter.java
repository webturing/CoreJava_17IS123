public class Filter {
    static int N = 101;
    static int A[] = new int[N];//0-N-1

    static void fill() {

        for (int i = 0; i < A.length; i++) A[i] = 1;//0.假设所有的数都是素数
        A[0] = A[1] = 0;//1.删除0,1
        for (int c = 2; c * c <= N; c++) {
            if (A[c] == 1) {//如果c是第一个遇到的素数，
                for (int d = 2 * c; d < N; d += c) {//保留c,删除所有c的整数倍
                    A[d] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        fill();
        // System.out.println(Arrays.toString(A));
        for (int i = 1; i < N; i++)
            if (A[i] == 1) System.out.print(i + " ");
    }
}
