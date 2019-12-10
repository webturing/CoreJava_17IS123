package week14R2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import static java.util.Objects.hash;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> a=new Vector<Integer>();
        for(int i=0;i<10;i++){
            a.add((int)(Math.random()*100));
        }
        System.out.println(a);
        System.out.println(Collections.max(a));
        System.out.println(Collections.min(a));
        int k=13;
        System.out.println(a.contains(k));
        System.out.println(a.indexOf(k));
        Collections.sort(a);//increasing order
        Collections.sort(a,Collections.reverseOrder());//decreasing order
        Collections.sort(a,new Comparator<Integer>(){
            int hash(int x){
                if(x<10)return x;
                return hash(x/10)+x%10;
            }
            @Override
            public int compare(Integer ia, Integer ib) {
                    ///return ia.compareTo(ib);//default increasing
                return ib.compareTo(ia);//reverse order
                //return hash(ia)- (hash(ib));
            }
        });

        System.out.println(a);
       // System.out.println(Collections.binarySearch(a,k));
        System.out.println(Collections.binarySearch(a,k,Collections.reverseOrder()));
    }
}
