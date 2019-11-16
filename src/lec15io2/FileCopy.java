import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
      try{
          FileReader fr=new FileReader(new File("E:\\huge.txt"));
          FileWriter fw=new FileWriter(new File("E.txt"));

          int x;
          while((x=fr.read())!=-1){
              fw.write(x);
          }

          fr.close();
          fw.close();
      }catch(IOException e){
          e.printStackTrace();
      }
    }
}
