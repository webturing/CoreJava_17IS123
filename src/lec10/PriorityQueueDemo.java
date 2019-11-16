package lec10;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());//大顶堆
        PriorityQueue<Integer> Q = new PriorityQueue<>();//默认是小顶堆
        Q.offer(2);
        Q.offer(1);
        Q.offer(3);
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.poll();
        }
    }
}
