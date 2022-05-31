// Running successfully and showing the image at exact position also the button

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;  

public class MyFrame extends Frame
{
    JButton b1, b2;
    MyActionListener ml;

    MyFrame()
    {
        setLayout(null);
        ml = new MyActionListener(this);

        JButton b1 = new JButton("myImage");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/homeb1.png")));
        b1.setBounds(135,507,250,72);
        add(b1);
        b1.addActionListener(ml);
        

        JButton b2=new JButton("Add Student");
        b2.setIcon(new ImageIcon(this.getClass().getResource("Images/homeb2.png")));
        b2.setBounds(968,50,156,50);
        add(b2);
        b2.addActionListener(ml);

        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                    System.exit(0);
                }
            });
    }

    public void paint(Graphics g) 
    {  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("Images/home.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
    {
        MyFrame mf = new MyFrame(); 
        mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        JFrame f=new JFrame(); 
        f.add(mf);  
        f.setVisible(true);
    }
} 