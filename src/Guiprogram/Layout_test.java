package Guiprogram;
//练习布局的排放
import java.awt.*;

public class Layout_test {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个界面");
        frame.setBounds(400,400,200,200);
        Button b1= new Button("b1");
        Button b2= new Button("b2");
        Button b3= new Button("b3");
        Button b4= new Button("b4");
        Button b5= new Button("b5");
        Button b6= new Button("b6");
        Button b7= new Button("b7");
        Button b8= new Button("b8");
        Button b9= new Button("b9");
        Button b10= new Button("b10");
        frame.setLayout(new GridLayout(2,1));
        Panel panel = new Panel(new BorderLayout());
        Panel panel1 = new Panel(new BorderLayout());
        frame.add(panel);
        frame.add(panel1);
        panel.add(b1,BorderLayout.EAST);
        panel.add(b2,BorderLayout.WEST);
        Panel panel2 = new Panel();
        panel.add(panel2,BorderLayout.CENTER);
        panel2.setLayout(new GridLayout(2,1));
        panel2.add(b3);
        panel2.add(b4);
        panel1.add(b5,BorderLayout.WEST);
        panel1.add(b6,BorderLayout.EAST);
        Panel panel3 = new Panel(new GridLayout(2, 2));
        panel1.add(panel3);
        panel3.add(b7);
        panel3.add(b8);
        panel3.add(b9);
        panel3.add(b10);
        frame.setVisible(true);

    }
}
