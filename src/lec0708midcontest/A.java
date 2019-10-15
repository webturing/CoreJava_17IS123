package lec0708midcontest;
 
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) {
        while (cin.hasNext()) {
            long sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += cin.nextLong();
            }
            System.out.println(sum);
         }
        cin.close();
    }
 
    static Scanner cin = new Scanner(System.in);
}