import java.lang.Long;
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
	MyFrame3 mf3;
	
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
	MyActionListener(MyFrame3 m)
	{
		this.mf3 = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());

		if(e.getActionCommand().equals("homepg"))
		{
			mf = new MyFrame();
			this.mf.setVisible(true);
			this.mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf1.setVisible(false);

			File directory = new File("D:\\OOP-Project\\Records");
	        int fileCount = directory.list().length;
	        this.mf.t1.setText(new Integer(fileCount).toString());
		}

		if(e.getActionCommand().equals("shut"))
		{
			System.exit(0);
		}

		if(e.getActionCommand().equals("myImage"))
        {
			mf1 = new MyFrame1();
			this.mf1.setVisible(true);
			this.mf1.setExtendedState(mf1.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf.setVisible(false);
		}

		if(e.getActionCommand().equals("Add Student"))
		{
			mf2 = new MyFrame2();
			this.mf2.setVisible(true);
			this.mf2.setExtendedState(mf2.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Checkout"))
		{
			mf = new MyFrame();
			this.mf.setVisible(true);
			this.mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf1.setVisible(false);

			File directory = new File("D:\\OOP-Project\\Records");
	        int fileCount = directory.list().length;
	        this.mf.t1.setText(new Integer(fileCount).toString());
		}

		if(e.getActionCommand().equals("abtus"))
		{
			mf3 = new MyFrame3();
			this.mf3.setVisible(true);
			this.mf3.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf.setVisible(false);
		}

		if(e.getActionCommand().equals("AddStud"))
		{
			mf = new MyFrame();

			String name = this.mf2.t1.getText();
			long Enroll = Long.parseLong(this.mf2.t2.getText());
			String Mail = this.mf2.t3.getText();
			//String Pass = this.mf2.t4.getText();

			File directory = new File("D:\\OOP-Project\\Records");
	        int fileCount = directory.list().length;
	        this.mf.t1.setText(new Integer(fileCount).toString());

			System.out.println(name);
			System.out.println(Enroll);
			System.out.println(Mail);

			String s = new String("D:\\OOP-Project\\Records\\" + Enroll + ".txt");
			File file = new File(s); 

			boolean result;  
			try   
			{  
				result = file.createNewFile();  //creates a new file  
			
				if(result)      // test if successfully created a new file  
				{  
					System.out.println("file created "+file.getCanonicalPath()); //returns the path string
					FileWriter myWriter = new FileWriter(s);
				    myWriter.write(name);
				    myWriter.write("  --  ");
				    myWriter.write(Mail);
				    myWriter.close();  
				}  
				else  
				{  
					System.out.println("File already exist at location: "+file.getCanonicalPath());  
				}  
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();    //prints exception if any  
			}    

			this.mf.setVisible(true);
			this.mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf2.setVisible(false);
		}

	}
}