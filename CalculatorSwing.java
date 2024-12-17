import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener
    {
     JFrame f;
     JTextField tf;
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdec,bclr,beq;
     static double a=0,b=0,res=0;
     static int op=0;
     Calculator()
      {
       f=new JFrame("Calculator");
       tf=new JTextField("0");
       tf.setBounds(30,40,280,30);
       b1=new JButton("1");
       b2=new JButton("2");
       b3=new JButton("3");
       b4=new JButton("4");
       b5=new JButton("5");
       b6=new JButton("6");
       b7=new JButton("7");
       b8=new JButton("8");
       b9=new JButton("9");
       b0=new JButton("0");
       badd=new JButton("+");
       bsub=new JButton("-");
       bmul=new JButton("*");
       bdiv=new JButton("/");
       bdec=new JButton(".");
       bclr=new JButton("CLR");
       beq=new JButton("=");
       
       b1.setBounds(40,240,50,40);
       b2.setBounds(110,240,50,40);
       b3.setBounds(180,240,50,40);
       b4.setBounds(40,170,50,40);
       b5.setBounds(110,170,50,40);
       b6.setBounds(180,170,50,40);
       b7.setBounds(40,100,50,40);
       b8.setBounds(110,100,50,40);
       b9.setBounds(180,100,50,40);
       b0.setBounds(110,310,50,40);
       badd.setBounds(250,310,50,40);
       bsub.setBounds(250,240,50,40);
       bmul.setBounds(250,170,50,40);
       bdiv.setBounds(250,100,50,40);
       bdec.setBounds(40,310,50,40);
       bclr.setBounds(100,380,100,40);
       beq.setBounds(180,310,50,40);
       
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
       bmul.addActionListener(this);
       bdiv.addActionListener(this);
       bdec.addActionListener(this);
       bclr.addActionListener(this);
       beq.addActionListener(this);
       
       f.add(tf);
       f.add(b1);
       f.add(b2);
       f.add(b3);
       f.add(b4);
       f.add(b5);
       f.add(b6);
       f.add(b7);
       f.add(b8);
       f.add(b9);
       f.add(b0);
       f.add(badd);
       f.add(bsub);
       f.add(bmul);
       f.add(bdiv);
       f.add(bdec);
       f.add(bclr);
       f.add(beq);
       f.setSize(350,500);
       f.setLayout(null);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setResizable(true);
      }
     public void actionPerformed(ActionEvent ae)
          {
           if(ae.getSource()==b1)
            {
             tf.setText(tf.getText().concat("1"));
            } 
           if(ae.getSource()==b2)
            {
             tf.setText(tf.getText().concat("2"));
            } 
           if(ae.getSource()==b3)
            {
             tf.setText(tf.getText().concat("3"));
            } 
           if(ae.getSource()==b4)
            {
             tf.setText(tf.getText().concat("4"));
            } 
           if(ae.getSource()==b5)
            {
             tf.setText(tf.getText().concat("5"));
            } 
           if(ae.getSource()==b6)
            {
             tf.setText(tf.getText().concat("6"));
            } 
           if(ae.getSource()==b7)
            {
             tf.setText(tf.getText().concat("7"));
            } 
           if(ae.getSource()==b8)
            {
             tf.setText(tf.getText().concat("8"));
            } 
           if(ae.getSource()==b9)
            {
             tf.setText(tf.getText().concat("9"));
            } 
           if(ae.getSource()==b0)
            {
             tf.setText(tf.getText().concat("0"));
            } 
           if(ae.getSource()==bdec)
            {
             tf.setText(tf.getText().concat("."));
            } 
           if(ae.getSource()==badd)
            {
             a=Double.parseDouble(tf.getText());
             op=1;
             tf.setText("");
            } 
           if(ae.getSource()==bsub)
            {
            a=Double.parseDouble(tf.getText());
             op=2;
             tf.setText("");
            } 
           if(ae.getSource()==bmul)
            {
             a=Double.parseDouble(tf.getText());
             op=3;
             tf.setText("");
            } 
           if(ae.getSource()==bdiv)
            {
             a=Double.parseDouble(tf.getText());
             op=4;
             tf.setText("");
            } 
           if(ae.getSource()==bclr)
            {
             tf.setText("");
            } 
           if(ae.getSource()==beq)
            {
             b=Double.parseDouble(tf.getText());
             switch(op)
               {
                case 1:
                    res=a+b;
                    break;
                case 2:
                    res=a-b;
                    break;
                case 3:
                    res=a*b;
                    break;
                case 4:
                    res=a/b;
                    break;
                default :
                    res=0;
                 }
              tf.setText(""+res);
             }
              if(ae.getSource()==bclr)
                {
                 tf.setText("");
                }
         }     
     }         
            
          
class CalculatorSwing
    {
     public static void main(String args[])
         {
          Calculator obj=new Calculator();
         }
     }

