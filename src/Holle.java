import javax.swing.*;
import java.awt.*;

public class Holle {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(1024,768);
        jFrame.setTitle("满天的星星");

        Myjpanel myjpanel = new Myjpanel();
        jFrame.add(myjpanel);
        Thread t1= new Thread(myjpanel);
        t1.start();
        jFrame.setVisible(true);

    }

        }
class Myjpanel extends JPanel implements Runnable{
    int xx[];
    int yy[];
    int fontsize[];
    Font font[];
   public Myjpanel(){
       xx=new int[200];
       yy=new int[200];
       font=new Font[200];
       fontsize=new int[200];
       for(int i=0; i<200;i++){
           xx[i]=(int)(Math.random()*1024);
           yy[i]=(int)(Math.random()*768);
           fontsize[i]=(int)(Math.random()*40);
           font[i]=new Font("宋体",Font.BOLD,fontsize[i]);
       }
   }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.white);
        for (int i = 0; i < 200; i++) {
            g.setFont(font[i]);
            g.drawString("*", xx[i], yy[i]);
        }
    }

    @Override
    public void run() {
        while(true){
            for(int i=0;i<200;i++){

                yy[i]+=19;


                    fontsize[i]--;
                    font[i]=new Font("宋体",Font.BOLD,fontsize[i]);


                if(yy[i]>768){
                    yy[i]=0;
                }
                if(fontsize[i]<0)
                {fontsize[i]=50;
                yy[i]=0;}
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
        }
    }
}
