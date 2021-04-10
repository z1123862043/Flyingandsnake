package Guiprogram.Jframe_Test;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIcondemo extends JFrame {
    ImageIcondemo(){
        URL url = ImageIcondemo.class.getResource("tp.png");
        System.out.println(url);
        this.setVisible(true);
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = getContentPane();
        ImageIcon imageIcon = new ImageIcon(url);
        JLabel jLabel = new JLabel();
       jLabel.setIcon(imageIcon);
        container.add(jLabel);
    }

    public static void main(String[] args) {
                new ImageIcondemo();
    }
}
