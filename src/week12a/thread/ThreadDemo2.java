package week12a.thread;

import javax.swing.*;

class YourThread extends JFrame implements Runnable {

    private String name;

    public YourThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
                System.out.println(this.name + ":" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        new Thread(new YourThread("tom")).start();
        new Thread(new YourThread("jerry")).start();
    }
}
