package Guiprogram.Jframe_Test;

import javax.swing.*;
import java.awt.*;

public class TestJframe  {
    public static void main(String[] args) {
new MyJframe().init();
    }
}
class MyJframe extends JFrame{
    public  void init(){
        setBounds(1,1,200,400);
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
        JLabel jLabel = new JLabel("欢迎光临");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(jLabel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
