package FileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamDemo {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("/Users/hedy/Desktop/Java学习代码/src/abc.txt");
            //方式一：每次读取一个字节
//            int read = inputStream.read();
//            System.out.println((char)read);
//            read = inputStream.read();
//            System.out.println((char)read);
//            int read=0;
//            //方式三：缓冲区方式读取，一次可以将所有数据添加到缓冲区，当缓冲区满了之后，一次性读取，而不是每个字节读取；a,b,c,d,e,f,z
//            byte[] buffer = new byte[1024];
//            while ((read=inputStream.read(buffer))!=-1){
//                System.out.println(new String(buffer,0,read));
//            }

            int read=0;
            //方式三：缓冲区方式读取，这样一次性可以读取5个数据
            byte[] buffer = new byte[1024];
            while ((read=inputStream.read(buffer,5,5))!=-1){
                System.out.println(new String(buffer,5,read));
            }

            //方式二：循环输出所有的字节
            int length=0;
            while ((length=inputStream.read())!=-1){
            System.out.println((char)length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
