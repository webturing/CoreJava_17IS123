package lec06;

import java.util.Scanner;

public class Hex2Bin {
    static String HEX = "0123456789ABCDEF";

    public static void main(String[] args) {
        while (cin.hasNext()) {
            String s = cin.next();
            for (char c : s.toCharArray()) {
                int idx = HEX.indexOf(c);
                //int idx = Integer.parseInt("" + c, 16);
                String b = Integer.toBinaryString(idx);
                while (b.length() < 4) {
                    b = "0" + b;
                }
                System.out.print(b);
            }
            System.out.println();
        }
        cin.close();

    }

    static Scanner cin = new Scanner(System.in);
}
