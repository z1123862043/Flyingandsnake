package Guiprogram.Jframe_Test.annotation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;
/**
 * 列表框
 * */
public class TestJlist extends JFrame {
    public TestJlist()  {
        Container container = getContentPane();
        Vector list = new Vector();
        list.add("1111");
        list.add("1111");
        list.add("1111");
        JList jList = new JList(list);
        container.add(jList);



        this.setSize(200,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestJlist();
    }
}
