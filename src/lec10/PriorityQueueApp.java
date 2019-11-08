import java.util.PriorityQueue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        int[] arr = {2, 4, 5, 9};
        for (int i : arr) {
            Q.offer(i);
        }
        int tot = 0;
        while (Q.size() > 1) {
            int x = Q.peek();
            Q.poll();
            int y = Q.peek();
            Q.poll();
            Q.offer(x + y);
            tot += x + y;
        }
        System.out.println(tot);
    }
}
