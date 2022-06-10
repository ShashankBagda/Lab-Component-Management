import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;

public class MyFrame4 extends Frame
{
	JButton b1, b2;
	TextField t1, t2;
	Font f1;
	MyActionListener ml;
	MyFrame4()
	{
		setLayout(null);
		ml = new MyActionListener(this);

		t1 = new TextField();
		t1.setBounds(200,236,370,56);
		add(t1);

		t2 = new TextField();
		t2.setBounds(200,478,370,56);
		add(t2);
		
		Font f1 = new Font("Comic Sans MS",Font.BOLD,30);

		t1.setFont(f1);
		t2.setFont(f1);

		JButton b1=new JButton("generate");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/gen.png")));
        b1.setBounds(200,345,370,56);
        add(b1);
        b1.setVisible(true);
        b1.addActionListener(ml);

        JButton b2=new JButton("verify");
        b2.setIcon(new ImageIcon(this.getClass().getResource("Images/ver.png")));
        b2.setBounds(200,594,370,56);
        add(b2);
        b2.setVisible(true);
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
        Image i=t.getImage("Images/otp.png");  
        g.drawImage(i, 0, 0,this);  
    } 
}