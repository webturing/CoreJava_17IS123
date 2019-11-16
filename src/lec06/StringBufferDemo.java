package lec06;

public class StringBufferDemo {
    //012345678910111213.....
    public static void main(String[] args) {
        StringBuffer b = new StringBuffer("");//StringBuilder
        for (int i = 0; i <= 100000; i++) {
            b.append(String.valueOf(i));
        }
        System.out.println(b.length());
        // System.out.println(s);
    }
}
