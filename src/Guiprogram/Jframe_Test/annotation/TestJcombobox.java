package Guiprogram.Jframe_Test.annotation;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
/**
 * 下拉列表框
 * */
public class TestJcombobox extends JFrame {
    public TestJcombobox() {
        Container container = getContentPane();
        JComboBox comboBox = new JComboBox();

        comboBox.addItem("zhangs");
        comboBox.addItem("zhangss");
        comboBox.addItem("zhangsss");
        comboBox.addItem("zhangssss");
        container.add(comboBox);
        this.setSize(200,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestJcombobox();
    }
}
