package hack;


import java.net.URL;
import java.util.Scanner;

public class Crawler {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.ahstu.edu.cn");
            Scanner cin = new Scanner(url.openStream());
            while (cin.hasNext()) {
                System.out.println(cin.nextLine());
            }
            cin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
