package Guiprogram.Jframe_Test;

import javax.swing.*;
import java.awt.*;
//在Jlabel标签中添加图形标签Icon
public class Test_Icon extends JFrame implements Icon {
    private int width;
    private  int height;
    Test_Icon(){
}
    Test_Icon(int width,int height){
        this.width=width;
        this.height = height;
    }
   void init(){
       Test_Icon test_icon = new Test_Icon(15,15);
       this.setVisible(true);
       this.setSize(400,500);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       Container container = getContentPane();
       JLabel jLabel = new JLabel("icon",test_icon,SwingConstants.CENTER);
       jLabel.setSize(200,300);
       container.add(jLabel);
   }
    public static void main(String[] args) {
new Test_Icon(15,15).init();
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
