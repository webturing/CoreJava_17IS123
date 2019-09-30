package lec03;

public class Main {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        final int N=10000;
        int cnt=0;
        for (int x=0;x<=N;x++)
            for(int y=0;y<=N;y++)
                for(int z=0;z<=N;z++){
                    if(x+y+z==N&&5*x+3*y+z/3==N&&z%3==0){
                        System.out.println(String.format("%d %d %d",x,y,z));
                    }
                }

        long end=System.currentTimeMillis();
        System.out.println(String.format("%.3f",(end-start)/1000.0));
    }
}
