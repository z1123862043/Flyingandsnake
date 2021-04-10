package Guiprogram.EventsListen;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class TestPaint {
    public static void main(String[] args) {
        new Mypaint();

    }

}
class Mypaint extends Frame{
    ArrayList arrayList;
    Mypaint(){
        arrayList = new ArrayList();
        setSize(500,600);
        this.addMouseListener(new Mymoustlistener());
        TestActionEvent.WindowsClosing(this);
        setVisible(true);


    }

    @Override
    public void paint(Graphics g) {

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            g.setColor(Color.BLUE);
            Point a = (Point) iterator.next();
            g.fillOval(a.x,a.y,10,10);
        }
    }
    private  class  Mymoustlistener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            Mypaint source = (Mypaint) e.getSource();
            arrayList.add(new Point(e.getX(),e.getY()));
            repaint();
        }
    }
}
