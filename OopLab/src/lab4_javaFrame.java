import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab4_javaFrame implements ActionListener {
    JTextField txt1,txt2,txt3;
    JButton b1,b2,b3;
    lab4_javaFrame(){
        JFrame frame1 = new JFrame("Converter");
        frame1.setSize(400,400);
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txt1.setBounds(100,50,100,50);
        txt2.setBounds(100,100,100,50);
        txt3.setBounds(100,150,100,50);
        frame1.add(txt1);
        frame1.add(txt2);
        frame1.add(txt3);
        b1 = new JButton("Celsius");
        b2 = new JButton("Fahrenheit");
        b3 = new JButton("Kelvin");
        b1.setBounds(200,60,100,30);
        b2.setBounds(200,110,100,30);
        b3.setBounds(200,160,100,30);
        frame1.add(b1);
        frame1.add(b2);
        frame1.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            double a = Double.parseDouble(txt1.getText());
            double  fahrenheit = ((a*(9/5.0))+32);
            txt2.setText(String.valueOf(String.format("%.3f",fahrenheit)));
            double kelvin = (a+273.15);
            txt3.setText(String.valueOf(String.format("%.3f",kelvin)));
        }
        if(e.getSource() == b2){
            double a = Double.parseDouble(txt2.getText());
            double celsius = ((a-32)*(5/9.0));
            txt1.setText(String.valueOf(String.format("%.3f",celsius)));
            double kelvin = (((a-32)*(5/9.0))+273.15);
            txt3.setText(String.valueOf(String.format("%.3f",kelvin)));
        }
        if(e.getSource() == b3){
            double a = Double.parseDouble(txt3.getText());
            double celsius = (a-273.15);
            txt1.setText(String.valueOf(String.format("%.3f",celsius)));
            double fahrenheit = (((a-273.15)*(9/5.0))+32);
            txt2.setText(String.valueOf(String.format("%.3f",fahrenheit)));
        }
    }
    public static void main(String[] args) {

        new lab4_javaFrame();
    }
}