package javaee_classTest.day1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Font font1 = new Font("宋体",Font.BOLD,30);
        Font font2 = new Font("宋体",Font.BOLD,20);
        jf.setTitle("用户登录");
        jf.setSize(400,600);
        Container con;
        con =  jf.getContentPane();
        con.setLayout(new BorderLayout());
        JLabel backable = new JLabel();
        backable.setLocation(0,0);
        JLabel title = new JLabel();
        title.setFont(font1);
        title.setBounds(80,150,180,80);
        title.setText("欢迎登录");
        JLabel username = new JLabel();
        username.setBounds(120,250,100,40);
        username.setText("用户名：");
        username.setFont(font2);
        TextField user_text = new TextField();
        user_text.setBounds(220,250,100,40);
        user_text.setFont(font2);
        backable.add(title);
        backable.add(username);
        backable.add(user_text);
        JLabel pass = new JLabel();
        pass.setBounds(120,300,100,40);
        pass.setText("密 码：");
        pass.setFont(font2);
        backable.add(pass);
        TextField pass_text = new TextField();
        pass_text.setBounds(220,300,100,40);
        pass_text.setFont(font2);
        backable.add(pass_text);
        JButton jb = new JButton();
        jb.setBounds(180,350,80,40);
        jb.setText("登录");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String  username = user_text.getText();
                String password = pass_text.getText();
                boolean bool = equals1(username,password);
                if(bool){
                    try {
                        jf.dispose();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,"登录成功","成功",JOptionPane.PLAIN_MESSAGE);

                }
                else {
                    JOptionPane.showMessageDialog(null,"登录失败","失败",JOptionPane.PLAIN_MESSAGE);
                }

            }
        });
        backable.add(jb);

        jf.add(backable);
        jf.setVisible(true);

    }
    public static boolean equals1(String username,String password){
        boolean bl = false;
        if(username.equals("admin")&&password.equals("admin")){
            bl=true;
        }
        return  bl;

    }
}
