package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JTextField text;
    private static double answer;
    private static double number;
    static int operation;
    public static void calc(){
        switch (operation){
            case 1:
                answer=number+Double.parseDouble(text.getText());
                text.setText(Double.toString(answer));
                break;
            case 2:
                answer=number-Double.parseDouble(text.getText());
                text.setText(Double.toString(answer));
                break;
            case 3:
                answer=number/Double.parseDouble(text.getText());
                text.setText(Double.toString(answer));
                break;
            case 4:
                answer=number*Double.parseDouble(text.getText());
                text.setText(Double.toString(answer));
                break;
        }
    }

    public static void main(String[] args) {

        JFrame frame=new JFrame("Calculator");
        JLabel label=new JLabel();
        label.setBounds(10,5,270,10);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.setVisible(true);
        text=new JTextField();
        text.setBounds(10,20,270,40);
        text.setHorizontalAlignment(SwingConstants.RIGHT);
        text.setEditable(false);
        text.setBackground(Color.white);


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
        JButton bx=new JButton("*");
        JButton bdivide=new JButton("/");
        JButton bequal=new JButton("=");


        bclear.setBounds(10,80,130,60);
        bper.setBounds(150,80,60,60);
        b1.setBounds(10,150,60,60);
        b2.setBounds(80,150,60,60);
        b3.setBounds(150,150,60,60);
        b4.setBounds(10,220,60,60);
        b5.setBounds(80,220,60,60);
        b6.setBounds(150,220,60,60);
        b7.setBounds(10,290,60,60);
        b8.setBounds(80,290,60,60);
        b9.setBounds(150,290,60,60);
        b0.setBounds(10,360,130,60);
        bdot.setBounds(150,360,60,60);
        bdivide.setBounds(220,80,60,60);
        bx.setBounds(220,150,60,60);
        bplus.setBounds(220,220,60,60);
        bminus.setBounds(220,290,60,60);
        bequal.setBounds(220,360,60,60);

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+e.getActionCommand());
            }
        });

//        bdot.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String test[]=text.getText().split("");
//                for (int i=0;i<test.length;i++) {
//                    if (test[i]!=".") {
//                        text.setText(text.getText() + e.getActionCommand());
//                    }
//                }
//
//            }
//        });
        bper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(String.valueOf((Double.parseDouble(text.getText())/100)));
            }
        });
        bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });
        bplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(text.getText());
                operation=1;
                text.setText("");
                label.setText(number+e.getActionCommand());
            }
        });
        bminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(text.getText());
                operation=2;
                text.setText("");
                label.setText(number+e.getActionCommand());


            }
        });
        bdivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(text.getText());
                operation=3;
                text.setText("");
                label.setText(number+e.getActionCommand());


            }
        });
        bx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number=Double.parseDouble(text.getText());
                operation=4;
                text.setText("");
                label.setText(number+e.getActionCommand());


            }
        });
        bequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc();
                label.setText(e.getActionCommand());

            }
        });


        frame.setSize(320,500);
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

        frame.add(label);
        frame.add(text);

    }

}
