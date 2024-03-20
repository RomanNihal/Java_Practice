package Swing_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class calculator implements ActionListener {
    TextField tx,tx1,tx2,tx3;
    Button b1,b2,b3,b4;

    calculator(){
        JFrame jf = new JFrame();
        jf.setSize(400,400);

        tx = new TextField();
        tx.setBounds(100,50,150,30);
        tx.setText("Enter two numbers");
        tx.setEditable(false);
        jf.add(tx);

        tx1 = new TextField();
        tx1.setBounds(100,100,50,30);
        jf.add(tx1);

        tx2 = new TextField();
        tx2.setBounds(200,100,50,30);
        jf.add(tx2);

        b1 = new Button("+");
        b1.setBounds(80,150,50,30);
        jf.add(b1);
        b1.addActionListener(this);

        b2 = new Button("-");
        b2.setBounds(130,150,50,30);
        jf.add(b2);
        b2.addActionListener(this);

        b3 = new Button("*");
        b3.setBounds(180,150,50,30);
        jf.add(b3);
        b3.addActionListener(this);

        b4 = new Button("/");
        b4.setBounds(230,150,50,30);
        jf.add(b4);
        b4.addActionListener(this);

        tx3 = new TextField();
        tx3.setBounds(100,200,150,30);
        jf.add(tx3);

        jf.setLayout(null);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            if(tx1.getText().equals("")){
                tx1.setText("!");
            }
            else if(tx2.getText().equals("")){
                tx2.setText("!");
            }
            else{
                try{
                    int a = Integer.parseInt(tx1.getText());
                    int b = Integer.parseInt(tx2.getText());
                    int c = a+b;
                    tx3.setText(String.valueOf(c));
                    tx1.setText(null);
                    tx2.setText(null);
                }
                catch (Exception e1){
                    tx3.setText("Invalid Input");
                }
            }
        }
        if(e.getSource()==b2){
            if(tx1.getText().equals("")){
                tx1.setText("!");
            }
            else if(tx2.getText().equals("")){
                tx2.setText("!");
            }
            else{
                try {
                    int a = Integer.parseInt(tx1.getText());
                    int b = Integer.parseInt(tx2.getText());
                    int c = a - b;
                    tx3.setText(String.valueOf(c));
                    tx1.setText(null);
                    tx2.setText(null);
                }
                catch (Exception e1){
                    tx3.setText("Invalid Input");
                }
            }
        }
        if(e.getSource()==b3){
            if(tx1.getText().equals("")){
                tx1.setText("!");
            }
            else if(tx2.getText().equals("")){
                tx2.setText("!");
            }
            else{
                try{
                    int a = Integer.parseInt(tx1.getText());
                    int b = Integer.parseInt(tx2.getText());
                    int c = a*b;
                    tx3.setText(String.valueOf(c));
                    tx1.setText(null);
                    tx2.setText(null);
                }
                catch (Exception e1){
                    tx3.setText("Invalid Input");
                }
            }
        }
        if(e.getSource()==b4){
            if(tx1.getText().equals("")){
                tx1.setText("!");
            }
            else if(tx2.getText().equals("")){
                tx2.setText("!");
            }
            else{
                try{
                    int a = Integer.parseInt(tx1.getText());
                    int b = Integer.parseInt(tx2.getText());
                    int c = a/b;
                    tx3.setText(String.valueOf(c));
                    tx1.setText(null);
                    tx2.setText(null);
                }
                catch (ArithmeticException e1) {
                    tx3.setText("Can't divided by zero");
                }
                catch (Exception e1){
                    tx3.setText("Invalid Input");
                }
            }
        }

    }
    public static void main(String[] args) {
        new calculator();
    }
}
