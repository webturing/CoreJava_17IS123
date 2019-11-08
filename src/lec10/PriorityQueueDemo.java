import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> Q=new PriorityQueue<>();
        Q.offer(2);
        Q.offer(1);
        Q.offer(3);
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.poll();
        }
    }
}
