package Guiprogram.Jframe_Test.annotation;

import javax.swing.*;
import java.awt.*;
/*
* 实现单选按钮和复选按钮
* */
public class Test01 extends JFrame {
    public Test01()  {
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1));
        ButtonGroup group = new ButtonGroup();
        JRadioButton radioButton01= new JRadioButton("button01");
        JRadioButton radioButton02= new JRadioButton("button02");
        JRadioButton radioButton03= new JRadioButton("button03");
        group.add(radioButton01);
        group.add(radioButton02);
        group.add(radioButton03);
        JPanel jPanel = new JPanel();
        jPanel.add(radioButton01);
        jPanel.add(radioButton02);
        jPanel.add(radioButton03);
        container.add(jPanel);
        JPanel jPanel1 = new JPanel();
        Checkbox checkbox3 = new Checkbox("Checkbox03");
        Checkbox checkbox1 = new Checkbox("Checkbox01");
        Checkbox checkbox2= new Checkbox("Checkbox02");
        jPanel1.add(checkbox1);
        jPanel1.add(checkbox2);
        jPanel1.add(checkbox3);
        container.add(jPanel1);
        this.setSize(400,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new Test01();
    }
}
