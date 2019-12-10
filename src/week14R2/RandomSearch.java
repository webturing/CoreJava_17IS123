package week14R2;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class RandomSearch {
    public static void main(String[] args) {
        //X+Y=Z 123+456=5
        //X:Y:Z=1:2:3
        List<Integer> numbers=new Vector<Integer>();
        for(int i=1;i<=9;i++)numbers.add(i);
        while(true){
            Collections.shuffle(numbers);
            int X=numbers.get(0)*100+numbers.get(1)*10+numbers.get(2);
            int Y=numbers.get(3)*100+numbers.get(4)*10+numbers.get(5);
            int Z=numbers.get(6)*100+numbers.get(7)*10+numbers.get(8);
            if(X+Y==Z){
                System.out.println(numbers);
                break;
            }
        }
    }
}
