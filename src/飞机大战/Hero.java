package 飞机大战;

import java.awt.image.BufferedImage;

public class Hero extends Flyingobj{
    private int life;
    private  int shoot_shu;
    private  int shoot_shijian;
    private  int defeng;
    private  int index_yangshi;
    private BufferedImage[] images;
    Hero(){
        image = Gaming.hero0;
        width =image.getWidth();
        hight=image.getHeight();
        x=150;
        y=450;
        life=3;
        shoot_shu=0;
        images = new BufferedImage[]{Gaming.hero0,Gaming.hero1};
        index_yangshi = 0;

    }
    public Shootdan[] shoot(){
        int xStep = this.width/8;
        Shootdan[] shootdans =null;
        switch (shoot_shu){
            case 0:  shootdans = new Shootdan[1];
                shootdans[0] = new Shootdan(this.x + 4 * xStep,this.y - 20);
                break;
            case 1:shootdans = new Shootdan[2];
                shootdans[0] = new Shootdan(this.x + 2 * xStep,this.y - 20);
                shootdans[1] = new Shootdan(this.x + 6 * xStep,this.y - 20);
                break;

            case 2:shootdans = new Shootdan[3];
                shootdans[0] = new Shootdan(this.x + 1 * xStep,this.y - 20);
                shootdans[1] = new Shootdan(this.x + 4 * xStep,this.y - 20);
                shootdans[2] = new Shootdan(this.x + 7 * xStep,this.y - 20);
        }
        return  shootdans;
    }
    public void move(int x,int y){
        this.x = x - this.width/2;
        this.y = y - this.hight/2;
    }

    @Override
    public void step() {
        image =images[index_yangshi++/10%images.length];

    }

    @Override
    public boolean outofBound() {
        return false;
    }
    public  void addlife(){
        life++;
    }
    public void addshoot_shijian(){
        shoot_shijian+=40;
    }
    public void addshoot_shu(){
        if(this.shoot_shu<2)
            shoot_shu++;
    }
    public  void jslife(){
        life--;
    }
    public  void jsshoot_jc(){
        shoot_shijian=0;
        shoot_shu=0;
    }
    public boolean hit(Flyingobj air){
        int x1=air.x-this.width/2;
        int x2=air.x+air.width+this.width;
        int y1=air.y-this.hight;
        int y2=air.y+air.hight+this.hight;
        int hx = this.x + this.width/2;
        int hy = this.y + this.hight/2;
        return (hx>x1)&&(hx<x2)&&(hy>y1)&&(hy<y2);
    }
    public int getLife(){
        return life;
    }

}
