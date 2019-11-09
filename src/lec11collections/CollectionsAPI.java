package lec11collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsAPI {
    public static void main(String[] args) {
        List<String> v = Arrays.asList("zero one two three four five six seven eight nine ten".split("\\s+"));
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);
        Collections.sort(v, Collections.reverseOrder());
        System.out.println(Collections.max(v));
        System.out.println(Collections.min(v));
        System.out.println(v.contains("four"));//linear search O(n)
        System.out.println(v.indexOf("five"));//linear search O(n)
        System.out.println(Collections.binarySearch(v, "five"));//binarySearch O(n)
    }
}
