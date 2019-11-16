import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class HashSetTreeSetDemo {

    public static void main(String[] args) {
        String[] edges = "AB AC AD BC BD CD DE FZ".split("\\s+");
        //Vector<String> vertex=new Vector<>();
        //TreeSet<String> vertex = new TreeSet<>();//O(logn)
		HashSet<String> vertex=new HashSet<>();//O(1)
        for (String edge : edges) {
            vertex.add(edge.substring(0, 1));
            vertex.add(edge.substring(1, 2));
        }
        vertex.add("OO");
		vertex.add("Y");
        System.out.println(vertex);
    }
}
