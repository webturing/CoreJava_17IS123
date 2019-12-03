package week12a.thread;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
       for(int i=0;i<100;i++){
           int s=0;
           for(int j=0;j<2000000000;j++){
               s+=j;
           }

           System.out.println(new Date().toLocaleString());
       }
    }
}
