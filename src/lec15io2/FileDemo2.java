import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {
    //目录和文件的创建写入
    public static void main(String[] args) throws IOException {
        File file=new File("17IS123");
        if(!file.exists()){
            file.mkdir();
        }
        for(int i=1;i<=3;i++){
            File subfolder=new File(file,"17"+i);
            subfolder.mkdir();
            for(int j=0;j<10;j++){
                String user="270317"+String.format("%d%02d",i,j);
                File ssfile=new File(subfolder,user+".txt");
                FileWriter fw=new FileWriter(ssfile);
                fw.write("hello +"+user);
                fw.close();

            }
        }
    }
}
