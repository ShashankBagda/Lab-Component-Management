import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame1 extends Frame
{
	Button b2;
	MyActionListener ml;
	MyFrame1()
	{
		setLayout(null);
		ml = new MyActionListener(this);
		
		
		b2=new Button("Checkout");
		add(b2);
		b2.setBounds(128,506,256,72);
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
        Image i=t.getImage("list.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}