package lec10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();//FIFO
        for (int i = 0; i < 10; i++) {
            Q.offer(i);//
            System.out.println(Q);
        }
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.poll();
        }
    }
}
