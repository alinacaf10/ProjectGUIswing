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

        b1.setBounds(10,81,60,60);
        b2.setBounds(80,81,60,60);
        b3.setBounds(150,81,60,60);
        b4.setBounds(10,151,60,60);
        b5.setBounds(80,151,60,60);
        b6.setBounds(150,151,60,60);
        b7.setBounds(10,221,60,60);
        b8.setBounds(80,221,60,60);
        b9.setBounds(150,221,60,60);


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
        frame.add(text);

    }
}
