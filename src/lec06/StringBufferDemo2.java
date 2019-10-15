package lec06;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(rev(n));

        String s = Integer.toString(n);
        StringBuffer b = new StringBuffer(s);
        b.reverse();
        String t = b.toString();
        int m = Integer.parseInt(t);
        System.out.println(m);


        System.out.println(Integer.parseInt(new StringBuffer(Integer.toString(n)).reverse().toString()));
    }

    private static int rev(int n) {

        int m = 0;
        while (n > 0) {
            m = m * 10 + n % 10;
            n /= 10;
        }
        return m;
    }
}
