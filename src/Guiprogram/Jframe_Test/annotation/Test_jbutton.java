package Guiprogram.Jframe_Test.annotation;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
/*
* 实现图形按钮
* */
public class Test_jbutton extends JFrame {
    public Test_jbutton()  {
        Container contentPane = getContentPane();
        URL url = Test_jbutton.class.getResource("tp.png");
        ImageIcon icon = new ImageIcon(url);
        JButton button = new JButton();
        button.setIcon(icon);
        contentPane.add(button);
        this.setVisible(true);
        this.setSize(200,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Test_jbutton();
    }
}
