import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;  

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFrame1 mf1;
	MyFrame2 mf2;
	
	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}
	MyActionListener(MyFrame1 m)
	{
		this.mf1 = m;
	}
	MyActionListener(MyFrame2 m)
	{
		this.mf2 = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("myImage"))
        	{
				System.out.println(e.getActionCommand() + "=" + this.mf.b1);
				mf1 = new MyFrame1();
				this.mf1.setVisible(true);
				this.mf1.setExtendedState(mf1.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				this.mf.setVisible(false);
			}

		if(e.getActionCommand().equals("Add Student"))
		{
			System.out.println(e.getActionCommand()  + "=" + this.mf.b4);
			mf2 = new MyFrame2();
			this.mf2.setVisible(true);
			this.mf2.setExtendedState(mf2.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Checkout"))
		{
			System.out.println(e.getActionCommand()  + "=" + this.mf1.b2);
			mf = new MyFrame();
			this.mf.setVisible(true);
			this.mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf1.setVisible(false);
		}

		if(e.getActionCommand().equals("Sign Up"))
		{
			System.out.println(e.getActionCommand()  + "=" + this.mf2.b3);
			mf = new MyFrame();
			this.mf.setVisible(true);
			this.mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf2.setVisible(false);
		}
		
		
	}
}