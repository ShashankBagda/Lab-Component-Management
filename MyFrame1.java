
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class MyFrame1 extends Frame
{
	JButton b1,b2;
	MyActionListener ml;
	MyFrame1()
	{
		setLayout(null);
		ml = new MyActionListener(this);
		
		
		//b1=new Button("Checkout");
		JButton b1 = new JButton("Checkout");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/homeb1.png")));
		b1.setBounds(135,507,250,72);
		add(b1);
		b1.addActionListener(ml);

		JButton b2 = new JButton("1");
	    b2.setBounds(100, 100, 30, 25);
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
        Image i=t.getImage("Images/list.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}