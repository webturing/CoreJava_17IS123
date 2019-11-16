package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class SystemIn2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("input.txt"));
            int x;
            while ((x = fr.read()) != -1) {//EOF End Of File
                System.out.print((char) x);

            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
