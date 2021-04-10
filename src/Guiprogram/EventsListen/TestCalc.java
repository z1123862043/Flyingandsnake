package Guiprogram.EventsListen;

import org.omg.CORBA.INTERNAL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 一个简单的加法计算器
* 利用事件监听器对文本进行监听
* */
public class TestCalc {
    public static void main(String[] args) {
        new MyFrame3().LoadCalc();
    }
}
class MyFrame3 extends Frame{

    //3个文本
    TextField num1 =new TextField();
    TextField num2 =new TextField();
    TextField num3 =new TextField();

    //1个标签
    Label label = new Label("+");
    //1个按钮
    Button btm = new Button();
   void  LoadCalc(){
     setSize(500,500);
     setLayout(new FlowLayout());
     btm.addActionListener(new MyActionListener_Calc());
     add(num1);
     add(label);
     add(num2);
     add(btm);
     add(num3);
pack();
     setVisible(true);
    TestActionEvent.WindowsClosing(this);

    }
    //使用内部类可以简单对类中的数据进行处理
    private   class   MyActionListener_Calc  implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            String text1 = num1.getText();
            String text2 = num2.getText();
            int i = Integer.parseInt(text1)+Integer.parseInt(text2);

            num3.setText(String.valueOf(Integer.parseInt(""+i)));
            num1.setText("");
            num2.setText("");
        }
    }


}
