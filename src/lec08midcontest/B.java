package lec08midcontest;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        for (int T = cin.nextInt(); T-- > 0; ) {
            int p = cin.nextInt();
            String s = cin.next();
            System.err.println("p=" + p + ",s=" + s);
            if (p > s.length()) {
                System.out.println("single dog!");
            } else {
                System.out.println(s.charAt(p - 1));
            }
        }
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);
}

