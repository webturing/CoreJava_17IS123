package lec10;

import java.util.Arrays;
import java.util.Stack;

public class StackApp2 {
    public static void main(String[] args) {
        String exp[] = "1 2 + 3 4 + *".split("\\s+");
        System.out.println(Arrays.toString(exp));
        Stack<Double> S = new Stack<>();
        for (String s : exp) {
            if (s.equals("+") || s.equals("*")) {
                double b = S.peek();
                S.pop();
                double a = S.peek();
                S.pop();
                switch (s.charAt(0)) {
                    case '+':
                        S.push(a + b);
                        break;
                    case '*':
                        S.push(a * b);
                        break;
                }
            } else {
                S.push(Double.parseDouble(s));
            }

        }
        System.out.println(S.peek());
    }
}
