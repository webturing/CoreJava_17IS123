package lec06;

import java.util.Arrays;
import java.util.Comparator;

public class StringArray {
    public static void main(String[] args) {
        String s = "zero one two three four     five six seven eight nine ten";
        String[] w = s.split("\\s+");
        System.out.println(Arrays.toString(w));
        //  Arrays.sort(w);

        Arrays.sort(w, new Comparator<String>() {
            @Override
            public int compare(String sa, String sb) {
                //  return -1*sa.compareTo(sb);
                return sa.length() - sb.length();
            }
        });
        System.out.println(Arrays.toString(w));
    }
}
