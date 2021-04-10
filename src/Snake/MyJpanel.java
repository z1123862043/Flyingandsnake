package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MyJpanel extends JPanel implements ActionListener , KeyListener {
        int Snake_length;
        int Score;
        int [] Snakex = new int[600];
        int [] Snakey = new int[500];
        int foodx ;
        int foody;
        Random random = new Random();
    String Fx;
        boolean isStart;
        boolean isFeil;
        Timer  timer= new Timer(100,this);




    MyJpanel(){
           init();
           timer.start();
        this.setFocusable(true); //获取焦点事件
           this.addKeyListener(this);
}
    public void init(){
        isFeil=false;
        Snake_length = 3;
        Score = 0;
        Snakex[0]=100 ;Snakey[0] = 100;
        Snakex[1]=75 ;Snakey[1] = 100;
        Snakex[2]=50 ;Snakey[2] = 100;
        foodx = 25+25*random.nextInt(34);
        foody = 25+25*random.nextInt(24);
        Score = 0;
        Fx="R";


    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        setLayout(null);
        setBackground(Color.white);
       Date.Header.paintIcon(this,g,25,11);
        g.setColor(Color.BLACK);
        g.fillRect(25,75,850,600); //绘制游戏区域
        Date.food.paintIcon(this,g,foodx,foody);
        g.setFont(new Font("宋体",Font.BOLD,20));
        g.drawString("长度"+Snake_length,750,35);
        g.drawString("分数"+Score,750,55);
        if(Fx.equals("R")){
            Date.right.paintIcon(this,g,Snakex[0],Snakey[0]);
        }else if (Fx.equals("L")){
            Date.left.paintIcon(this,g,Snakex[0],Snakey[0]);
        }
        else if (Fx.equals("U")){
            Date.up.paintIcon(this,g,Snakex[0],Snakey[0]);
        }
        else if (Fx.equals("D")){
            Date.down.paintIcon(this,g,Snakex[0],Snakey[0]);
        }

        for(int i = 1;i<Snake_length;i++){
            Date.body.paintIcon(this,g,Snakex[i],Snakey[i]);
        }

        if(isStart==false){
            g.setColor(Color.WHITE);
            g.setFont(new Font("宋体",Font.BOLD,30));
            g.drawString("按下空格继续游戏",300,300);

        }
        if(isFeil){
            g.setColor(Color.WHITE);
            g.setFont(new Font("宋体",Font.BOLD,30));
            g.drawString("按下空格重新开始游戏",300,300);
        }






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart&&isFeil==false){
            if(Snakex[0]==foodx&&Snakey[0]==foody){
                Snake_length++;
                foodx = 25+25*random.nextInt(34);
                foody = 75+25*random.nextInt(24);
                Score+=5;
            }
            for(int i =Snake_length-1;i>0;i--){
                Snakex[i] = Snakex[i-1];Snakey[i] = Snakey[i-1];
            }

            if(Fx.equals("R")){
                Snakex[0]+=25;
                if(Snakex[0]>850){
                    Snakex[0]=25;
                }
            }
            else if (Fx.equals("U")) {
                Snakey[0]-=25;
                if(Snakey[0]<75){Snakey[0]=650;
                }
        }
            else if (Fx.equals("D")) {
                Snakey[0]+=25;
                if(Snakey[0]>650){Snakey[0]=75;
                }
            }
            else if (Fx.equals("L")) {
                Snakex[0]-=25;
                if(Snakex[0]<25){Snakex[0]=850;
                }
            }
            for (int i = 1; i < Snake_length; i++) {
                if(Snakex[0]==Snakex[i]&&Snakey[0]==Snakey[i]){
                    isFeil=true;
                }
            }


        repaint();
    }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_SPACE) {
                if(isFeil){
                    isFeil=false;
                    init();

                }
                else {
                    isStart = !isStart;
                }
                repaint();
            }

            if (keyCode == KeyEvent.VK_UP) {
                Fx = "U";
            } else if (keyCode == KeyEvent.VK_DOWN) {
                Fx = "D";
            } else if (keyCode == KeyEvent.VK_LEFT) {
                Fx = "L";
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                Fx = "R";
            }

            repaint();
        timer.start();
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
