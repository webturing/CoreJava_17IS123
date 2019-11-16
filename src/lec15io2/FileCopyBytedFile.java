import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class FileCopyBytedFile {
    public static void main(String[] args) {
        long start= System.currentTimeMillis();
      try{
          FileInputStream fis=new FileInputStream(new File("soft.exe"));
          FileOutputStream fos=new FileOutputStream(new File("soft2.exe"));

          int x;
          while((x=fis.read())!=-1){
              fos.write(x);
          }

          fis.close();
          fos.close();
      }catch(IOException e){
          e.printStackTrace();
      }
        long end= System.currentTimeMillis();
        System.out.println((end-start)/1000.0);
    }

}
