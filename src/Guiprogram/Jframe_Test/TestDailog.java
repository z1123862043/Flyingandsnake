package Guiprogram.Jframe_Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 点击按钮弹出dialog窗口
 *
 *
 * */
public class TestDailog {
    public static void main(String[] args) {
        new MyJframe_dialog();
    }
}
class  MyJframe_dialog extends  JFrame{
    MyJframe_dialog(){
        setSize(500,600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.BLUE);
        Button button = new Button("点击这个按钮");
        button.setBounds(1,1,100,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Mydailog();
            }
        });
        container.add(button);
    }
}
class  Mydailog extends JDialog{
    Mydailog(){
        Container container = getContentPane();
        this.setLayout(null);
        this.setBounds(200,400,200,300);
        JLabel jLabel = new JLabel("我跳出来了");
        jLabel.setSize(200,300);
        container.add(jLabel);
        this.setVisible(true);
    }
}
