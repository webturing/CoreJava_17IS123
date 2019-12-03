package lec11collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] a = new String[cin.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = cin.next();
        Arrays.sort(a, new Comparator<String>() {
            public int compare(String sa, String sb) {
                return (sa + sb).compareTo(sb + sa);
            }
        });
        System.out.print(Integer.parseInt(a[0]));
        for (int i = 1; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        cin.close();
    }
}
