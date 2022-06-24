import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;  
import java.io.IOException;
import sun.audio.*;

public class MyFrame extends Frame
{
    JButton b1, b2, b3, b4, b5;
    TextField t1;
    Font f1;
    MyActionListener ml;

    MyFrame()
    {
        setLayout(null);
        ml = new MyActionListener(this);

        t1 = new TextField();     
        t1.setBounds(482,512,130,100);        
        Font f1 = new Font("Comic Sans MS",Font.BOLD,75);
        t1.setFont(f1);       
        add(t1);
        
        //Count Records
        File directory = new File("D:\\OOP-Project\\Student Records\\Email");
        int fileCount = directory.list().length;
        t1.setText(new Integer(fileCount).toString());


        JButton b1 = new JButton("myImage");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/homeb1.png")));
        b1.setBounds(132,507,250,126);
        add(b1);
        b1.addActionListener(ml);
        

        JButton b2=new JButton("Add Student");
        b2.setIcon(new ImageIcon(this.getClass().getResource("Images/homeb2.png")));
        b2.setBounds(968,50,156,50);
        add(b2);
        b2.addActionListener(ml);

        JButton b3=new JButton("return");
        b3.setIcon(new ImageIcon(this.getClass().getResource("Images/homeb3.png")));
        b3.setBounds(1150,50,146,50);
        add(b3);
        b3.addActionListener(ml);

        JButton b4=new JButton("abtus");
        b4.setIcon(new ImageIcon(this.getClass().getResource("Images/homeb4.png")));
        b4.setBounds(1332,50,156,50);
        add(b4);
        b4.addActionListener(ml);

        JButton b5=new JButton("shut");
        b5.setBackground(Color. WHITE);
        b5.setIcon(new ImageIcon(this.getClass().getResource("Images/shut.png")));
        b5.setBounds(1532,750,48,54);
        add(b5);
        b5.addActionListener(ml);

        

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