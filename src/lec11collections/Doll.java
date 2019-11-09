package lec11collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Doll {
    public static void main(String[] args) {
        Vector<Integer> balls = new Vector<>();
        for (int i = 1; i <= 35; i++)
            balls.add(i);
        System.out.println(balls);
        Collections.shuffle(balls);
        System.out.println(balls);
        List<Integer> firstPrize =new Vector<Integer>();
        for(int i=0;i<6;i++)firstPrize.add(balls.get(i));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$"+firstPrize+"$$$$$$$$$$$$$$$$$$$$$$$$$$");

        for(int i=0;i<100000000;i++)
        {
            Collections.shuffle(balls);//机选
            List<Integer> user= balls.subList(0,6);
            getPrize(user,firstPrize);
        }
    }

    private static int getPrize(List<Integer> user, List<Integer> firstPrize) {
        int matches=0;
        for(int i=0;i<6;i++){
            if(user.get(i).equals(firstPrize.get(i))){
                ++matches;
            }
        }
        if(matches==6){
            System.out.println(user);
            System.out.println("TOP PRIZE: $5,000,000");

        } if(matches==5){
            System.out.println(user);

            System.out.println("FIRST PRIZE: $300,000");

        }
//        if(matches==4){
//            System.out.println("THIRD PRIZE: $20,000");
//
//        }
//        if(matches==3){
//            System.out.println("THIRD PRIZE: $100");
//
//        }
       return matches;
    }
}
