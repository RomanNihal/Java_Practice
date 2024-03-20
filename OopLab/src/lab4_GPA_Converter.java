import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab4_GPA_Converter implements ActionListener {
    JTextField txt1,txt2;
    JButton b1,b2;
    lab4_GPA_Converter(){
        JFrame frame1 = new JFrame("Converter");
        frame1.setSize(400,400);
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt1.setBounds(100,50,100,50);
        txt2.setBounds(100,100,100,50);
        frame1.add(txt1);
        frame1.add(txt2);
        b1 = new JButton("Marks");
        b2 = new JButton("GPA");
        b1.setBounds(200,60,100,30);
        b2.setBounds(200,110,100,30);
        frame1.add(b1);
        frame1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            double a = Double.parseDouble(txt1.getText());
            if(a>=0.00 && a<=100.00){
                if(a>=80.00 && a<=100.00){
                    txt2.setText("4.00");
                }
                if(a>=75.00 && a<80.00){
                    txt2.setText("3.75");
                }
                if(a>=70.00 && a<75.00){
                    txt2.setText("3.50");
                }
                if(a>=65.00 && a<70.00){
                    txt2.setText("3.25");
                }
                if(a>=60.00 && a<65.00){
                    txt2.setText("3.00");
                }
                if(a>=55.00 && a<60.00){
                    txt2.setText("2.75");
                }
                if(a>=50.00 && a<55.00){
                    txt2.setText("2.50");
                }
                if(a>=45.00 && a<50.00){
                    txt2.setText("2.25");
                }
                if(a>=40.00 && a<45.00){
                    txt2.setText("2.00");
                }
                if(a>=0.00 && a<40.00){
                    txt2.setText("Fail");
                }
            }
            else{
                txt2.setText("Invalid Input");
            }
        }
        if(e.getSource() == b2){
            double a = Double.parseDouble(txt2.getText());
            if(a>=0.00 && a<=4.00){
                if(a==4.00){
                    txt1.setText("80 - 100");
                }
                if(a>=3.75 && a<4.00){
                    txt1.setText("75 - 80");
                }
                if(a>=3.50 && a<3.75){
                    txt1.setText("70 - 75");
                }
                if(a>=3.25 && a<3.50){
                    txt1.setText("65 - 70");
                }
                if(a>=3.00 && a<3.25){
                    txt1.setText("60 - 65");
                }
                if(a>=2.75 && a<3.00){
                    txt1.setText("55 - 60");
                }
                if(a>=2.50 && a<2.75){
                    txt1.setText("50 - 55");
                }
                if(a>=2.25 && a<2.50){
                    txt1.setText("45 - 50");
                }
                if(a>=2.00 && a<2.25){
                    txt1.setText("40 - 45");
                }
                if(a>=0.00 && a<2.00){
                    txt1.setText("Fail");
                }
            }
            else{
                txt1.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        new lab4_GPA_Converter();
    }
}
