package 飞机大战;

import java.awt.image.BufferedImage;

public  abstract class Flyingobj {
    protected BufferedImage image;
    protected int x;//x坐标
    protected  int y;//y坐标
    protected  int width;
    protected  int hight;
    public abstract void  step();
    public abstract boolean outofBound();
    public boolean shoot_out(Shootdan zdan){
        int x1 =this.x;
        int x2 =this.x+this.width;
        int y1 =this.y;
        int y2=this.y+this.hight;
        return x1<zdan.x&&x2>zdan.x&&y1<zdan.y&&y2>zdan.y;

    };
}
