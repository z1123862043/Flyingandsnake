package 飞机大战;

import 飞机大战.Flyingobj;
import 飞机大战.Gaming;

import java.util.Random;

public class Bee extends Flyingobj {
  private   int xstep=1;
   private int ystep=2;
    Bee(){
        image=Gaming.bee;
        width = image.getWidth();
        hight = image.getHeight();
        Random ran =new Random();
        x=ran.nextInt(Gaming.WIDTH-this.width);
        y=-this.hight;

    }
    @Override
    public void step() {
    x+=xstep;
    y+=ystep;
    }

    @Override
    public boolean outofBound() {
        return this.x> Gaming.WIDTH||this.y>Gaming.HEIGHT;
    }
}
