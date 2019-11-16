package io;

import java.io.IOException;

public class SystemIn {
    public static void main(String[] args)  {
        try {
            int x=System.in.read();
            System.out.println(x);//x='3'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
