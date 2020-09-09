package FileDemo;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        File src = new File("abc.txt");
        File dest = new File("aaa.txt");

        //创建输入流对象
        InputStream inputStream = null;
        //创建输出流对象
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(dest);
            int lenth=0;

            //缓冲的输入输出
            byte[] buffer = new byte[1024];
            while ((lenth=inputStream.read(buffer))!=-1){
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            outputStream.close();
            inputStream.close();
        }


    }

}
