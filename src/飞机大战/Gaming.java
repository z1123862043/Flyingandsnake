package 飞机大战;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class Gaming extends JPanel {
    public static final int WIDTH = 400;  //窗口的宽
    public static final int HEIGHT = 600; //窗口的高
    //静态资源
    public static BufferedImage background; //背景图
    public static BufferedImage start;     //开始图
    public static BufferedImage pause;      //暂停图
    public static BufferedImage gameover;   //游戏结束图
    public static BufferedImage airplane;   //敌机图
    public static BufferedImage bee;        //蜜蜂图
    public static BufferedImage bullet;     //子弹图
    public static BufferedImage hero0;      //英雄机0图
    public static BufferedImage hero1;      //英雄机1图

    public static final int START = 0;
    public static final int RUNNING = 1;
    public static final int PAUSE = 2;
    public static final int GAME_OVER = 3;
    private int state = 0;   //当前状态

    private Hero hero = new Hero();         //英雄机
    private Shootdan[] bullets={} ;          //子弹数组
    private Flyingobj[] flyings ={};     //敌人数组
    private int score;
    private Timer timer;

    private int intervel = 10;              //间隔时间：单位--毫秒

    static {
        try {
            background = (BufferedImage) ImageIO.read(new File("D://IDEAproject//src//飞机大战//background.png"));
            start = (BufferedImage)ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//start.png"));
            pause = (BufferedImage)ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//pause.png"));
            gameover = (BufferedImage)ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//gameover.png"));
            airplane =(BufferedImage) ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//airplane.png"));
            bee = (BufferedImage)ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//bee.png"));
            bullet = (BufferedImage)ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//bullet.png"));
            hero0 = (BufferedImage)ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//hero0.png"));
            hero1 = (BufferedImage)ImageIO.read(new File("D://IDEAproject//src//飞机大战//image//hero1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public  Flyingobj getair(){
        Random ran = new Random();
        int a = ran.nextInt(15);
        if(a ==0){
            return new Bee();
        }
        else
            return new enemyair();
    }
    private int enemyair_index=0;
    public void  enemyaction(){
        enemyair_index++;
        if(enemyair_index%30==0){
            Flyingobj obj = getair();
            flyings = Arrays.copyOf(flyings,flyings.length + 1);
            flyings[flyings.length - 1] = obj;//将敌人赋值给flyings数组的最后一个元素
        }
    }
    public void stepaction(){
        hero.step();
        for(int i=0;i<flyings.length;i++){
            flyings[i].step();
        }
        for(int i=0;i<bullets.length;i++){
            bullets[i].step();
        }
    }
    private int shoot_index=0;
    public void shootaction(){
        shoot_index++;
        if(shoot_index%20==0){
            Shootdan[] bs = hero.shoot();//获取子弹对象
            bullets = Arrays.copyOf(bullets,bullets.length + bs.length);
            /*
            * arraycopy()方法实现数组的复制
            * arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
            * src:原数组
            * srcPos：原数组要复制的起始位置
            * dest：目的数组
            * destPos：目的数组放置的起始位置
            * length：复制的长度
            * */
            System.arraycopy(bs, 0, bullets, bullets.length - bs.length,bs.length);
        }

    }
    //删除出界的飞行物
    public void out_flyobj(){
        int index = 0;
        Flyingobj[] flyobjlive = new Flyingobj[flyings.length];
        for(int i=0;i<flyobjlive.length;i++){
            if(!flyings[i].outofBound()){
                flyobjlive[index]=flyings[i];
                index++;
            }
        }
        flyings = Arrays.copyOf(flyobjlive,index);
        index =0;
        Shootdan[] shootdanlive = new Shootdan[bullets.length];
        for(int i =0;i<shootdanlive.length;i++){
            if(!bullets[i].outofBound()){
                shootdanlive[index] =bullets[i];
                index++;
            }
        }
        bullets = Arrays.copyOf(shootdanlive,index);

    }
    /*
    判断一个子弹是否击中
     */
    public void  bang(Shootdan a){
        int index = -1;//击中飞行物的索引
        for(int i =0;i<flyings.length;i++){
            if(flyings[i].shoot_out(a)){
                index = i;
                break;
            }
        }

            if(index!=-1){
        Flyingobj obj = flyings[index] ;//判断飞行物的类型
        if(obj instanceof enemyair){
            score+=((enemyair) obj).getscore();

        }
        if(obj instanceof Bee){
            Random ran = new Random();
            int type = ran.nextInt(2);
            switch (type){
                case 0:hero.addshoot_shijian();hero.addshoot_shu();break;
                case 1:hero.addlife();
                default:hero.addlife();
            }

        }
        //把被击中的飞行物进行删除
        Flyingobj t = flyings[index];
        flyings[index] = flyings[flyings.length-1];
        flyings[flyings.length-1]=t;
        flyings= Arrays.copyOf(flyings,flyings.length-1);
        }}
        //判断所有的子弹是否击中
        public  void bangaction(){
        for(int i=0;i<bullets.length;i++){
           bang(bullets[i]);
        }
        }
        public boolean isover(){
        for(int i =0;i<flyings.length;i++){
            if(hero.hit(flyings[i])){
                Flyingobj t = flyings[i];
                flyings[i] = flyings[flyings.length-1];
                flyings[flyings.length-1]=t;
                flyings= Arrays.copyOf(flyings,flyings.length-1);
                hero.jslife();
                hero.jsshoot_jc();

            }
        }

        return hero.getLife()<=0;
        }

    public void checkGameOverAction() {
        if (isover()) {    //结束游戏
            state = GAME_OVER;
        }
    }
        //启动
        public void action() {
            MouseAdapter a = new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    if (state == RUNNING) {  //运行状态下执行
                        int x = e.getX();      //鼠标Y坐标
                        int y = e.getY();      //鼠标X坐标
                        hero.move(x, y);     //英雄机随着鼠标移动而移动

                    }
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    switch (state) {
                        case START:
                            state = RUNNING;
                            break;
                        case GAME_OVER:
                            hero = new Hero();//清理现场
                            flyings = new Flyingobj[0];
                            bullets = new Shootdan[0];
                            score = 0;
                            state = START;
                            break;
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                    if (state == PAUSE) {
                        state = RUNNING;
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {

                    if (state == RUNNING) {
                        state = PAUSE;
                    }
                }
            };
            this.addMouseListener(a);//添加鼠标操控器
            this.addMouseMotionListener(a);//处理鼠标移动操作
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (state == RUNNING) {
                        enemyaction();
                        stepaction();
                        shootaction();
                        out_flyobj();
                        bangaction(); //子弹与敌人撞
                        checkGameOverAction();
                    }
                    repaint();
                }


            }, intervel, intervel);


        }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(background,0,0,null); //画背景图
        paintHero(g);
        paintFlyingObjects(g);
        paintBullets(g);
        paintScore(g);      //画分，画名
        paintState(g);
    }
    public void paintState(Graphics g){
        switch(state){
            case START:           //启动状态画启动图
                g.drawImage(start,0,0,null);
                break;
            case PAUSE:           //暂停状态画暂停图
                g.drawImage(pause,0,0,null);
                break;
            case GAME_OVER:       //结束状态画结束图
                g.drawImage(gameover,0,0,null);
                break;

        }
    }
    public void paintHero(Graphics g){
        g.drawImage(hero.image,hero.x,hero.y,null);  //画英雄机对象
    }
    public void paintFlyingObjects(Graphics g){
        for(int i =0;i < flyings.length;i++){
            Flyingobj f = flyings[i];
            g.drawImage(f.image,f.x,f.y,null);
        }
    }
    public void paintBullets(Graphics g){
        for(int i = 0;i < bullets.length;i++){
            Shootdan b = bullets[i];
            g.drawImage(b.image,b.x,b.y,null);
        }

    }

    public void paintScore(Graphics g){    //画分，画命
        g.setColor(new Color(0xFF0000));
        g.drawString("SCORE: " + score,20,25);
        g.drawString("LIFE: " + hero.getLife(),20, 45);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("飞机大战");
        Gaming gaming = new Gaming();
        jf.add(gaming);
        jf.setSize(WIDTH,HEIGHT);
        jf.setVisible(true);
        jf.setAlwaysOnTop(true);        //设置一直在最上面
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置默认关闭的操作：窗口关闭时退出程序
        jf.setLocationRelativeTo(null);  //设置窗口初始位置（居中)
        gaming.action();

        }


}
