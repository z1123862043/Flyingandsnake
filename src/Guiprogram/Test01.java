package Guiprogram;

import java.awt.*;

public class Test01 {
    //创造一个图形界面
    public static void main(String[] args) {
//        Frame frame = new Frame("这是一个图形界面");
//        frame.setVisible(true);
//        frame.setBounds(200,200,400,400);
//        frame.setBackground(new Color(190, 90, 50));
//        frame.setResizable(false);//是否变动窗口大小
//        //创造多个图形变量
        MyFrame myFrame = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame1 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame2= new MyFrame(100,  300, 200, 200, Color.red);
        MyFrame myFrame3 = new MyFrame(300,  300, 200, 200, Color.black);

    }
}
class  MyFrame extends  Frame{
    MyFrame(int x ,int y ,int w ,int h ,Color color){
        super("这是一个图形界面");
        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);
    }
}

