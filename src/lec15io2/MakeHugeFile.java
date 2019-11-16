import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MakeHugeFile {
    public static void main(String[] args) {
        Random random = new Random();
        try {
            FileWriter fw = new FileWriter("E:\\huge.txt");
            while (true) {
                fw.write(random.nextInt(256));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
