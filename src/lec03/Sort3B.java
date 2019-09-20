package lec03;

import java.util.Scanner;

public class Sort3B {
    public static void main(String[] args) {
        while(cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            if(a>b){
                int t=a;a=b;b=t;
            }
            if(b>c){
                int t=b;b=c;c=t;
            }
            if(a>b){
                int t=a;a=b;b=t;
            }
            System.out.println(String.format("%d %d %d",a,b,c));
        }


    }
    static Scanner cin=new Scanner(System.in);
}
