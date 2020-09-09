package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");
        //创建文件
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //判断文件的属性，都会翻译boolean值
        file.canExecute();
        file.canRead();
        file.canWrite();
        //判断文件是否存在
        System.out.println(file.exists());
        //获取文件的名称
        System.out.println(file.getName());
        //获取绝对路径,无论文件是否存在，只要给定文件具体路径，都可以返回路径
        System.out.println(file.getAbsolutePath());
        //获取当前文件的父路径名称，如果文件的路径中，值包含文件名称，显示为空
        System.out.println(file.getParent());
        //返回文件绝对路径的规范格式，也就是/与系统相匹配
        System.out.println(file.getCanonicalPath());
        //返回操作系统的分隔符
        System.out.println(File.separator);
        //判断是否是文件，如果文件不存在，就是false
        System.out.println(file.isFile());
        //判断是否是目录
        System.out.println(file.isDirectory());
//下面无法正常输出路径[Ljava.lang.String;@610455d6
        File file1 = new File("/Users/hedy/Desktop/Java学习代码/src");
        String[] list = file1.list();
        for(String str:list){
            System.out.println(list);
        }
//下面可正常输出路径/Users/hedy/Desktop/Java学习代码/src/DataDemo
        File[] files = file1.listFiles();
        for(File f:files){
            System.out.println(f);
        }
//打印当前文件系统的所有盘符   /
        File[] files1 = File.listRoots();
        for(int i=0;i<files1.length;i++){
            System.out.println(files1[i]);
        }

        //创建目录
        file1.mkdir();

        //循环遍历输出C盘所有文件的绝对路径
        //使用递归;文件遍历的时候会出现空指针，因为某些文件没有权限访问
        printFile(new File("/Users/hedy/Desktop/Java学习代码/src"));



    }

    //遍历文件
    public static  void printFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                printFile(f);
            }
        }else {
            System.out.println("传入的是文件，此文件的目录如下");
            System.out.println(file.getAbsolutePath());
        }

    }

}
