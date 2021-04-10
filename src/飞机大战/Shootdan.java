package 飞机大战;

public class Shootdan extends Flyingobj {
    private  int step = 3;
    Shootdan(int a,int b){
        image = Gaming.bullet;
        width = image.getWidth();
        hight=image.getHeight();
        this.x = a;
                this.y= b;

                }

@Override
public void step() {
        y-=step;

        }

@Override
public boolean outofBound() {
        return this.y<-this.hight;
        }
        }
