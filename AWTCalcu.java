/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops.AWT;

import java.awt.*;
import java.awt.event.*;
class AWTCalcu implements ActionListener
{
    Frame f;
    Label L;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button badd,bsub,bmult,bdiv,bcalc;
    double num1,num2, result;
    int Flag;
    AWTCalcu()
    {
        f= new Frame("MY CALCULATOR");
        L=new Label();
        L.setBackground(Color.LIGHT_GRAY);
        L.setBounds(50,50,260,60);
        b1=new Button("1");
         b1.setBounds(50,340,50,50);
        b2=new Button("2");
         b2.setBounds(120,340,50,50);
        b3=new Button("3");
         b3.setBounds(190,340,50,50);
        b4=new Button("4");
         b4.setBounds(50,270,50,50);
        b5=new Button("5");
         b5.setBounds(120,270,50,50);
        b6=new Button("6");
         b6.setBounds(190,270,50,50);
        b7=new Button("7");
         b7.setBounds(50,200,50,50);
        b8=new Button("8");
         b8.setBounds(120,200,50,50);
        b9=new Button("9");
         b9.setBounds(190,200,50,50);
        b0=new Button("0");
         b0.setBounds(120,410,50,50);
        badd=new Button("+");
         badd.setBounds(260,340,50,50);
        bsub=new Button("-");
         bsub.setBounds(260,270,50,50);
        bmult=new Button("*");
         bmult.setBounds(260,200,50,50);
        bdiv=new Button("/");
         bdiv.setBounds(260,130,50,50);
        bcalc=new Button("=");
         bcalc.setBounds(245,410,65,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bcalc.addActionListener(this);

        f.add(L);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4);
        f.add(b5);f.add(b6); f.add(b7); f.add(b8);
        f.add(b9);f.add(b0); f.add(badd);
        f.add(bsub);
        f.add(bmult); f.add(bdiv); f.add(bcalc);
        f.setSize(360,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
         String Rnum, Wnum;
        if(e.getSource()==b1)
        {
        Rnum=L.getText();
        Wnum=Rnum+"1";
         L.setText(Wnum);
        }
        if(e.getSource()==b2)
        {
        Rnum=L.getText();
        Wnum=Rnum+"2";
        L.setText(Wnum);
        }
        if(e.getSource()==b3)
        {
         Rnum=L.getText();
         Wnum=Rnum+"3";
         L.setText(Wnum);
        }
        if(e.getSource()==b4)
        {
        Rnum=L.getText();
         Wnum=Rnum+"4";
         L.setText(Wnum);
        }
        if(e.getSource()==b5)
        {
         Rnum=L.getText();
         Wnum=Rnum+"5";
         L.setText(Wnum);
        }
        if(e.getSource()==b6)
        {
         Rnum=L.getText();
         Wnum=Rnum+"6";
         L.setText(Wnum);
        }
        if(e.getSource()==b7)
        {
         Rnum=L.getText();
         Wnum=Rnum+"7";
         L.setText(Wnum);
        }
        if(e.getSource()==b8)
        {
         Rnum=L.getText();
         Wnum=Rnum+"8";
         L.setText(Wnum);
        }
        if(e.getSource()==b9)
        {
         Rnum=L.getText();
         Wnum=Rnum+"9";
         L.setText(Wnum);
        }
        if(e.getSource()==b0)
        {
         Rnum=L.getText();
         Wnum=Rnum+"0";
         L.setText(Wnum);
        }
        
        if(e.getSource()==badd)
        {
            try
            {
                num1=Double.parseDouble(L.getText());
            }
            catch(NumberFormatException f)
            {
                L.setText("Invalid Format");
                return;
            }
            Wnum="";
            L.setText(Wnum);
            Flag=1;
        }
       if(e.getSource()==bsub)
        {
            try
            {
                num1=Double.parseDouble(L.getText());
            }
            catch(NumberFormatException f)
            {
                L.setText("Invalid Format");
                return;
            }
            Wnum="";
            L.setText(Wnum);
            Flag=2;
        }
       if(e.getSource()==bcalc)
        {
            try
            {
                num2=Double.parseDouble(L.getText());
            }
            catch(Exception f)
            {
                L.setText("ENTER NUMBER FIRST ");
                return;
            }
            if(Flag==1)
            {
                result =num1+num2;
            }
            if(Flag==2)
            {
                result =num1-num2;
            }
            if(Flag==3)
            {
                result =num1*num2;
            }
            if(Flag==4)
            {
                result =num1/num2;
            }
            L.setText(String.valueOf(result));
        }
    }
    public static void main(String args[])
    {
        new AWTCalcu();
    }
} 
