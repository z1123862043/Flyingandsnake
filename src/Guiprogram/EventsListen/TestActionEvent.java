package Guiprogram.EventsListen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame("开始-停止");
        frame.setSize(200,200);
        Button start = new Button("start");
        Button stop = new Button("stop");
        MyActionListener myActionListener = new MyActionListener();
        start.addActionListener(myActionListener);
        stop.addActionListener(myActionListener);
        frame.add(start,BorderLayout.EAST);
        frame.add(stop,BorderLayout.WEST);
        frame.pack();
        WindowsClosing(frame);
        frame.setVisible(true);

    }
    static void WindowsClosing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class MyActionListener implements ActionListener{


    @Override
    public void actionPerformed(ActionEvent e) {
        SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("按钮被点击=》"+si.format(e.getWhen()));
    }
}
