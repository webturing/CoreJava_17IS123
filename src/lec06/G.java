package lec06;

import java.util.Arrays;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.nextLine();
            char cs[] = s.toCharArray();
            Arrays.sort(cs);
            String m = cs[cs.length - 1] + "";
            //System.out.println(s.replace(m, m + "(max)"));
            for (char c : s.toCharArray()) {
                System.out.print(c);
                if (c == m.charAt(0)) {
                    System.out.print("(max)");
                }
            }
            System.out.println();
        }
        cin.close();
    }
}
