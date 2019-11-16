import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("a.txt");
       // File file=new File("E:/b.txt");
        //File file=new File("E:","b.txt");
        //File file=new File("res","c.txt");
        try {
            FileReader fr=new FileReader(file);
            int x;
            while((x=fr.read())!=-1){
                System.out.print((char)(x));
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       // System.out.println(file.exists());
    }
}
