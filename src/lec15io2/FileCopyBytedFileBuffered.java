import java.io.*;

public class FileCopyBytedFileBuffered {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("soft.exe")));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("soft2.exe")));
            int x;
            while ((x = bis.read()) != -1) {
                bos.write(x);
            }
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }
}
