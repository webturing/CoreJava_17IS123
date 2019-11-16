import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int n = cin.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = cin.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[n / 2]);
    }
}
