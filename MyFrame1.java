import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class MyFrame1 extends Frame
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	TextField t1;
	int cart=0;
	MyActionListener ml;
	MyFrame1()
	{
		setLayout(null);
		ml = new MyActionListener(this);

		t1 = new TextField();
		t1.setBounds(128,655,104,80);
		Font f1 = new Font("Comic Sans MS",Font.BOLD,75);
        t1.setFont(f1);
		add(t1);
		t1.setText("" + cart);
		
		JButton b1 = new JButton("Checkout");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Images/listb1.png")));
		b1.setBounds(186,504,156,80);
		add(b1);
		b1.addActionListener(ml);

		JButton b2 = new JButton("1");
		b2.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b2.setBounds(898, 172, 36, 38);
	    add(b2);
	    b2.addActionListener(ml);

	    JButton b3 = new JButton("2");
		b3.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b3.setBounds(898, 250, 36, 38);
	    add(b3);
	    b3.addActionListener(ml);

	    JButton b4 = new JButton("3");
		b4.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b4.setBounds(898, 340, 36, 38);
	    add(b4);
	    b4.addActionListener(ml);

	    JButton b5 = new JButton("4");
		b5.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b5.setBounds(898, 416, 36, 38);
	    add(b5);
	    b5.addActionListener(ml);

	    JButton b6 = new JButton("5");
		b6.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b6.setBounds(1256, 172, 36, 38);
	    add(b6);
	    b6.addActionListener(ml);

	    JButton b7 = new JButton("6");
		b7.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b7.setBounds(1256, 250, 36, 38);
	    add(b7);
	    b7.addActionListener(ml);

	    JButton b8 = new JButton("7");
		b8.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b8.setBounds(1256, 340, 36, 38);
	    add(b8);
	    b8.addActionListener(ml);

	    JButton b9 = new JButton("8");
		b9.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b9.setBounds(1256, 416, 36, 38);
	    add(b9);
	    b9.addActionListener(ml);

	    JButton b10 = new JButton("LED");
		b10.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b10.setBounds(784, 675, 36, 38);
	    add(b10);
	    b10.addActionListener(ml);

	    JButton b11 = new JButton("Battery");
		b11.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b11.setBounds(1016, 675, 36, 38);
	    add(b11);
	    b11.addActionListener(ml);

	    JButton b12 = new JButton("Board");
		b12.setIcon(new ImageIcon(this.getClass().getResource("Images/0.png")));
	    b12.setBounds(1234, 675, 36, 38);
	    add(b12);
	    b12.addActionListener(ml);

	    JButton b13=new JButton("homepg");
        b13.setBackground(Color. WHITE);
        b13.setIcon(new ImageIcon(this.getClass().getResource("Images/listhome.png")));
        b13.setBounds(28,0,48,50);
        add(b13);
        b13.addActionListener(ml);

        JButton b14=new JButton("shut");
        b14.setBackground(Color. WHITE);
        b14.setIcon(new ImageIcon(this.getClass().getResource("Images/listshut.png")));
        b14.setBounds(1532,750,48,54);
        add(b14);
        b14.addActionListener(ml);

        JButton b15=new JButton("delete");
        b15.setIcon(new ImageIcon(this.getClass().getResource("Images/listdel.png")));
        b15.setBounds(1532,0,48,54);
        add(b15);
        b15.addActionListener(ml);
		
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