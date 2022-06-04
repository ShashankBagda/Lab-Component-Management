import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame3 extends Frame
{
	JButton b1,b2;
	MyActionListener ml;
	MyFrame3()
	{
		setLayout(null);
		ml = new MyActionListener(this);

		JButton b1=new JButton("homepg");
        b1.setBackground(Color. WHITE);
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/abtushome.png")));
        b1.setBounds(28,0,48,50);
        add(b1);
        b1.addActionListener(ml);

        JButton b2 = new JButton("shut");
        b2.setIcon(new ImageIcon(this.getClass().getResource("Images/abtusshut.png")));
		b2.setBounds(635,666,326,56);
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
        Image i=t.getImage("Images/abtus.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}