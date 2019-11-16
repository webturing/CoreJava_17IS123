package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AddAB {
    static Scanner cin = null;

    static {
        try {
            cin = new Scanner(new File("input.txt"));
        } catch (IOException e) {
            cin = new Scanner(System.in);
        }
    }

    public static void main(String[] args) {
        int a = cin.nextInt();//+12345678
        int b = cin.nextInt();
        System.out.println(a + b);
        cin.close();
    }
}
