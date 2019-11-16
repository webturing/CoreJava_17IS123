package lec06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        String t = new StringBuffer(s).reverse().toString();
        if (t.equals(s)) System.out.println("Y");
        else System.out.println("N");
        cin.close();
    }
}
