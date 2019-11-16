import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileListDemo3 {
    //目录和文件的创建写入
    public static void main(String[] args) throws Exception {
        File file=new File("17IS123");
        System.out.println(file.isDirectory());
        if(file.isDirectory()){
            String sfile[]=file.list();
            for(String temp:sfile){
                System.out.println(temp);
                File subfile=new File(file,temp);
                if(subfile.isDirectory()){
                    for(String stemp:subfile.list()){
                        System.out.println(stemp);
                    }
                }

            }
        }

    }
}
