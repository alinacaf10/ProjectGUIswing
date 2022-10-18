package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculator");
        JTextField text=new JTextField();
        text.setBounds(10,11,300,30);


        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JButton b0=new JButton("0");
        JButton bdot=new JButton(".");
        JButton bclear=new JButton("CLEAR");
        JButton bper=new JButton("%");
        JButton bplus=new JButton("+");
        JButton bminus=new JButton("-");
        JButton bx=new JButton("x");
        JButton bdivide=new JButton("/");
        JButton bequal=new JButton("=");


        bclear.setBounds(10,81,130,60);
        bper.setBounds(150,81,60,60);
        b1.setBounds(10,151,60,60);
        b2.setBounds(80,151,60,60);
        b3.setBounds(150,151,60,60);
        b4.setBounds(10,221,60,60);
        b5.setBounds(80,221,60,60);
        b6.setBounds(150,221,60,60);
        b7.setBounds(10,291,60,60);
        b8.setBounds(80,291,60,60);
        b9.setBounds(150,291,60,60);
        b0.setBounds(10,361,130,60);
        bdot.setBounds(150,361,60,60);
        bdivide.setBounds(220,81,60,60);
        bx.setBounds(220,151,60,60);
        bplus.setBounds(220,221,60,60);
        bminus.setBounds(220,291,60,60);
        bequal.setBounds(220,361,60,60);



        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(bdot);
        frame.add(bper);
        frame.add(bclear);
        frame.add(bplus);
        frame.add(bminus);
        frame.add(bdivide);
        frame.add(bx);
        frame.add(bequal);

        frame.add(text);

    }
}
