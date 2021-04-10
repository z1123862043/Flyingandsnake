package Guiprogram.Jframe_Test;

import javax.swing.*;
import java.awt.*;

public class Testjscoll extends JFrame {
    public Testjscoll(){
        this.setBounds(400,500,500,500);

        Container contentPane = getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea jTextArea = new JTextArea();
        jTextArea.setText("欢迎光临。。。。");
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        contentPane.add(jScrollPane);
        this.setVisible(true);//显示尽量放在末尾处
    }

    public static void main(String[] args) {
        new Testjscoll();
    }
}
