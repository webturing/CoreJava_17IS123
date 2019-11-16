import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {//
      try{
          BufferedReader br=new BufferedReader(new FileReader(new File("E:\\huge.txt")));
          BufferedWriter bw=new BufferedWriter(new FileWriter(new File("E.txt")));

         int x;
         while((x=br.read())!=-1){
             bw.write(x);
         }


          br.close();
          bw.close();;
      }catch(IOException e){
          e.printStackTrace();
      }
    }
}
