import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame5 extends Frame
{
	JButton b1,b2;
	MyActionListener ml;
	MyFrame5()
	{
		setLayout(null);
		ml = new MyActionListener(this);

		JButton b1=new JButton("homepg");
        b1.setBackground(Color. WHITE);
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/issuehome.png")));
        b1.setBounds(28,0,48,50);
        add(b1);
        b1.addActionListener(ml);

        JButton b2 = new JButton("shut");
        b2.setIcon(new ImageIcon(this.getClass().getResource("Images/issueshut.png")));
		b2.setBounds(1532,750,48,54);
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
        Image i=t.getImage("Images/issue.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}