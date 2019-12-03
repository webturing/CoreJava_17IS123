package week12a.thread;

class MyThread extends Thread{
    String name;
    public MyThread(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){

            try {
                Thread.sleep(100);
                System.out.println(this.name+":"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        new MyThread("tom").start();
        new MyThread("jerry").start();
    }
}
