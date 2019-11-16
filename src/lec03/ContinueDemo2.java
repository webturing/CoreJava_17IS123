package lec03;

public class ContinueDemo2 {
    public static void main(String[] args) {
        for (int x = 1; x <= 3; x++)
            for (int y = 1; y <= 3; y++) {
                if (x == y) continue;
                for (int z = 1; z <= 3; z++) {
                   if(x==z)continue;
                   if(y==z)continue;
                    System.out.println(String.format("%d %d %d", x, y, z));
                }
            }
    }
}
