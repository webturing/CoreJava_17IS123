import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tool {

    public static void main(String[] args) {
        int lines = countCodeLines("src/FileCopy.java");
        System.out.println(lines);
    }

    private static int countCodeLines(String file) {
        int tot = 0;
        try {
            Scanner cin = new Scanner(new File(file));
            while (cin.hasNext()) {
                String line = cin.nextLine();
                if (line.trim().isEmpty()) continue;
                ++tot;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return tot;
    }
}
