package lec10;

import java.util.Stack;

public class StackApp1 {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        int n = 6;
        while (n > 0) {
            S.push(n % 2);
            n /= 2;
        }
        while (!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}
