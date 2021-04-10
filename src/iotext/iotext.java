package iotext;

import java.io.File;
import java.io.IOException;

public class iotext {
    public static void main(String[] args)  {
        File file = new File("D:\\文件io流test\\text.txt");
        System.out.println(file.exists());
        File file2 = new File("D:\\文件io流test\\text2.txt");
        if(!file2.exists()){
            try {
                System.out.println(file2.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file3 = new File("D:\\文件io流test");
        File[] name = file3.listFiles();
        for(File file1 : name){
            if(file1.getName().endsWith(".txt"))
            System.out.println(file1.getPath());
        }
    }
}
