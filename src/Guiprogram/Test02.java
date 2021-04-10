package Guiprogram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//panel的初使用
public class Test02 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个界面");
        Panel panel = new Panel();
        frame.setBounds(300,300,400,400);
        frame.setBackground(Color.BLACK);
        panel.setBounds(350,350,200,200);
        panel.setBackground(Color.BLUE);
        frame.setLayout(null);
        frame.add(panel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               // super.windowClosed(e);
                System.exit(0);
            }
        });
    }
}
