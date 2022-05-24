import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame2 extends Frame
{
	JButton b3;
	TextField t1, t2, t3;
	MyActionListener ml;
	MyFrame2()
	{
		setLayout(null);
		ml = new MyActionListener(this);
		
        JButton b3 = new JButton("AddStud");
        b3.setIcon(new ImageIcon(this.getClass().getResource("Images/signupb3.png")));
		b3.setBounds(635,666,326,56);
		add(b3);
		b3.addActionListener(ml);

		t1 = new TextField();
		t2 = new TextField(6);
		t3 = new TextField();

		JPasswordField t4 = new JPasswordField(8); 
		
		t1.setBounds(635,266,326,56);
		t2.setBounds(635,370,326,56);
		t3.setBounds(635,472,326,56);
		t4.setBounds(635,576,326,56);

		add(t1);
		add(t2);
		add(t3);
		add(t4);

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
        Image i=t.getImage("Images/signup.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}