package lec03;

import java.util.Scanner;

public class Sort3C {
    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            int min, mid, max;
            min = a;
            if (b < min) min = b;
            if (c < min) min = c;
            max = a;
            if (b > max) max = b;
            if (c > max) max = c;

            //if(a!=min && a!=max)mid=a;
            mid = a + b + c - min - max;
            System.out.println(min + " " + mid + " " + max);
        }


    }

    static Scanner cin = new Scanner(System.in);
}
