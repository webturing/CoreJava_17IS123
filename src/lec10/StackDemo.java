package lec10;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<Integer>();//FILO
        for (int i = 0; i < 10; i++) {
            S.push(i);
            System.out.println(S);
        }
        while (!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}
