package hack;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) {
        try {
//            if(Math.random()<0.5)
//            Runtime.getRuntime().exec("notepad.exe");
//            else
//            Runtime.getRuntime().exec("calc.exe");
            for(int i=0;i<10;i++){
                Runtime.getRuntime().exec("explorer.exe https://oj.ahstu.cc");
                Thread.sleep(500);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
