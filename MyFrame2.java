import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame2 extends Frame
{
	JButton b1, b2, b3;
	TextField t1, t2, t3, t4;
	MyActionListener ml;
	MyFrame2()
	{
		setLayout(null);
		ml = new MyActionListener(this);

        JButton b1 = new JButton("AddStud");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/signupb1.png")));
		b1.setBounds(635,666,326,56);
		add(b1);
		b1.addActionListener(ml);

		JButton b2=new JButton("homepg");
        b2.setBackground(Color. WHITE);
        b2.setIcon(new ImageIcon(this.getClass().getResource("Images/signhome.png")));
        b2.setBounds(28,0,48,50);
        add(b2);
        b2.addActionListener(ml);

        JButton b3 = new JButton("shut");
        b3.setIcon(new ImageIcon(this.getClass().getResource("Images/signshut.png")));
		b3.setBounds(1532,750,48,54);
		add(b3);
		b3.addActionListener(ml);

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();

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
        Image i=t.getImage("Images/add.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}