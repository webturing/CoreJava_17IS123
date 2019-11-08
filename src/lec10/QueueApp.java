import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 1, 7, 5, 8, 9, 2, 4};
        Queue<Integer> Q = new LinkedList<>();//FIFO
        for(int i:arr){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            int x=Q.peek();
            System.out.print(x);
            Q.poll();
            if(Q.isEmpty())break;
            x=Q.peek();
            Q.poll();
            Q.offer(x);

        }

    }
}
