import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileReaderDemo {
    public static void main(String[] args) {
       File file=new File("20191116.log");
        try {
            FileWriter fw=new FileWriter(file,true);
            fw.write("Hello admin!");
            fw.write ("Login at : "+new Date().toLocaleString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
