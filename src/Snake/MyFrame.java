package Snake;

import javax.swing.*;

public class MyFrame{
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("贪吃蛇");
        myFrame.setSize(900,720);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyJpanel myJpanel = new MyJpanel();
        myFrame.add(myJpanel);
        myFrame.setResizable(false);
        myFrame.setVisible(true);

    }
}
