import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame2 extends Frame
{
	JButton b3;
	MyActionListener ml;
	MyFrame2()
	{
		setLayout(null);
		ml = new MyActionListener(this);
		
		ImageIcon AddEntry = new ImageIcon("signupb3.png");
        JButton b3 = new JButton(AddEntry);
		//b3=new Button("Add Entry");
		add(b3);
		b3.setBounds(635,666,326,56);
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