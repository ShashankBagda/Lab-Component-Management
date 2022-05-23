import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame2 extends Frame
{
	Button b3;
	MyActionListener ml;
	MyFrame2()
	{
		setLayout(null);
		ml = new MyActionListener(this);
		
		
		b3=new Button("Sign Up");
		add(b3);
		b3.setBounds(128,506,256,72);
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
        Image i=t.getImage("signup.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}