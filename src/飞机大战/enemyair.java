package 飞机大战;

import java.util.Random;

public class enemyair extends Flyingobj {
    private  int step = 2;
    enemyair(){
        image = Gaming.airplane;
        width = image.getWidth();
        hight = image.getHeight();
        Random ran = new Random();
        x=ran.nextInt(Gaming.WIDTH-this.width);
        y=-this.hight;
    }
    public int getscore(){
        return  5;
    }
    @Override
    public void step() {
        y+=step;
    }

    @Override
    public boolean outofBound() {
        return this.y>Gaming.HEIGHT;
    }
}
