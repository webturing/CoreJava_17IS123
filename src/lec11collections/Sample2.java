package lec11collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Sample2 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        while (cin.hasNext()) {
            v.add(cin.nextInt());
        }
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);
        System.out.println(v.get(v.size() / 2));
    }
}
