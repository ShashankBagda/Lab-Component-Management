import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame6 extends Frame
{
	JButton b1,b2,b3;
	TextField t1,t2;
	MyActionListener ml;
	MyFrame6()
	{
		setLayout(null);
		ml = new MyActionListener(this);

		t1 = new TextField();
        t2 = new TextField();

        t1.setBounds(625,278,374,70);
        t2.setBounds(625,396,374,70);

        Font f1 = new Font("Comic Sans MS",Font.BOLD,34);

        t1.setFont(f1);
        t2.setFont(f1);

        add(t1);
        add(t2);

		JButton b1=new JButton("homepg");
        b1.setBackground(Color. WHITE);
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/returnhome.png")));
        b1.setBounds(28,0,48,50);
        add(b1);
        b1.addActionListener(ml);

        JButton b2 = new JButton("shut");
        b2.setIcon(new ImageIcon(this.getClass().getResource("Images/returnshut.png")));
		b2.setBounds(1532,750,48,54);
		add(b2);
		b2.addActionListener(ml);

		JButton b3 = new JButton("retu");
        b3.setIcon(new ImageIcon(this.getClass().getResource("Images/returnb1.png")));
		b3.setBounds(600,530,400,78);
		add(b3);
		b3.addActionListener(ml);

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
        Image i=t.getImage("Images/return.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}