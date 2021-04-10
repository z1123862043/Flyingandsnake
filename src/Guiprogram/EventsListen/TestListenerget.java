package Guiprogram.EventsListen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 输入框事件监听
* */
public class TestListenerget {
    public static void main(String[] args) {
        new MyFrame();
    }
}
class MyFrame extends Frame{
    MyFrame(){
        setSize(400,400);
        TextField textField = new TextField();
        MyActionLis myActionLis = new MyActionLis();
        textField.addActionListener(myActionLis);
        setVisible(true);
        add(textField);
        textField.setEchoChar('*');//设置文本编码
        TestActionEvent.WindowsClosing(this);
    }
}
class MyActionLis implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      TextField textField = (TextField) e.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}