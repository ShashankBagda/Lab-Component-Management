import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame4 extends Frame
{
	JButton b1;//b2
	TextField t1;
	MyActionListener ml;
	MyFrame4()
	{
		setLayout(null);
		ml = new MyActionListener(this);

		t1 = new TextField();
		t1.setBounds(200,236,370,56);
		add(t1);
		

		JButton b1=new JButton("generate");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/gen.png")));
        b1.setBounds(200,345,370,56);
        add(b1);
        b1.setVisible(true);
        b1.addActionListener(ml);

        // JButton b2=new JButton("regenerate");
        // b2.setIcon(new ImageIcon(this.getClass().getResource("Images/genre.png")));
        // b2.setBounds(200,345,370,56);
        // add(b2);
        // b2.setVisible(false);
        // b2.addActionListener(ml);

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
        Image i=t.getImage("Images/otp.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}