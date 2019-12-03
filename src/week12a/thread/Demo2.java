package week12a.thread;

import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
       for(int i=0;i<100;i++){
           try {
               Thread.sleep(1000);
               System.out.println(new Date().toLocaleString());
           } catch (InterruptedException e) {
               e.printStackTrace();
           }


       }
    }
}
