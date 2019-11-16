import java.util.Collections;
import java.util.Vector;

public class PrimerCircle {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 1; i <= 10; i++) v.add(i);
        System.out.println(v);
        while (true) {
            Collections.shuffle(v);
            if (check(v)) {
                System.out.println(v);
                break;
            }
        }

    }

    private static boolean check(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            int j = (i + 1) % v.size();
            if (!prime(v.get(i) + v.get(j))) return false;
        }
        return true;

    }

    private static boolean prime(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19;
    }
}
