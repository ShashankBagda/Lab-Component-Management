import java.lang.Long;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;  
import java.util.*;

//set classpath=mail.jar;activation.jar;.;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*; 

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFrame1 mf1;
	MyFrame2 mf2;
	MyFrame3 mf3;
	MyFrame4 mf4;

	String main;
	String verr;
	
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
	MyActionListener(MyFrame4 m)
	{
		this.mf4 = m;
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
			this.mf2.setVisible(false);
			this.mf3.setVisible(false);
			this.mf4.setVisible(false);

			File directory = new File("D:\\OOP-Project\\Student Records\\Email");
	        int fileCount = directory.list().length;
	        this.mf.t1.setText(new Integer(fileCount).toString());
		}

		if(e.getActionCommand().equals("shut"))
		{
			System.exit(0);
		}

		if(e.getActionCommand().equals("myImage"))
        {
        	String z = new String("D:\\OOP-Project\\Records\\list.txt");

        	try
        	{
			    FileWriter fw = new FileWriter(z, false);
			    PrintWriter pw = new PrintWriter(fw, false);
			    pw.flush();
			    pw.close();
			    fw.close();
			}
			catch(Exception exception)
			{
			    System.out.println("Exception have been caught");
			}


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
			mf4 = new MyFrame4();
			this.mf4.setVisible(true);
			this.mf4.setExtendedState(mf4.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf1.setVisible(false);
		}

		if(e.getActionCommand().equals("abtus"))
		{
			mf3 = new MyFrame3();
			this.mf3.setVisible(true);
			this.mf3.setExtendedState(mf3.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf.setVisible(false);
		}

		if(e.getActionCommand().equals("generate"))
		{
			String s = (this.mf4.t1.getText() + ".txt");
			String z = new String("D:\\OOP-Project\\Student Records\\" + s);
			String z2 = new String("D:\\OOP-Project\\Student Records\\Email\\" + s);
			// System.out.println(z);

			// try   
			// {  
			// 	FileWriter myWriter = new FileWriter(z, true);
			// 	myWriter.write("\n\n");
			// 	myWriter.write("Hello");
			// 	myWriter.close();
			// }   
			
			// catch (IOException est)   
			// {  
			// 	est.printStackTrace();
			// } 


			try 
			{
			    File myObj = new File(z2);
			    Scanner myReader = new Scanner(myObj);
			    while (myReader.hasNextLine())
			    {
			        String data = myReader.nextLine();
			        System.out.println(data);
			        this.main = data;
			    }
			    myReader.close();
		    } 
		    catch (FileNotFoundException eqq) 
		    {
			    System.out.println("An error occurred.");
			    eqq.printStackTrace();
		    }


			long min = 000001;  
			long max = 999999;  
			double a = Math.random()*(max-min+1)+min;
			int value = (int)a;
			String code=Integer.toString(value);
			this.verr = code;
			System.out.println(verr); 




			String host="smtp.gmail.com";  
			final String user="shashank.bagda113475@marwadiuniversity.ac.in";//your email address
			final String password="Cpdc@626";//password  
			String to=main;//change accordingly  
	  
			//Get the session object  
			Properties props = new Properties();  
			props.put("mail.smtp.host",host);  
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.ssl.enable", "true");
		
	     
			Session session = Session.getDefaultInstance(props,  
					new javax.mail.Authenticator() 
					{  
						protected PasswordAuthentication getPasswordAuthentication() {  
						return new PasswordAuthentication(user,password);  
					}  
				});  
	  
			//Compose the message  
			try 
			{  
				MimeMessage message = new MimeMessage(session);  
				message.setFrom(new InternetAddress(user));  
				message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
				message.setSubject("Lab Component Management");  
				message.setText("Your OTP is : " + value);  
				Transport.send(message);  
				System.out.println("message sent successfully...");  
	   
			} 
			catch (MessagingException exn) 
			{
				exn.printStackTrace();
			}
		}


		if(e.getActionCommand().equals("verify"))
		{
			
			String uss = this.mf4.t2.getText();
			String veri = this.verr;
			if(uss == verr)
			{
				System.out.println("Issued Successfully !!!!!");
			}
			else
			{
				System.out.println("Invalid Code");
			}
		}



		





		if(e.getActionCommand().equals("AddStud"))
		{
			mf = new MyFrame();

			String name = this.mf2.t1.getText();
			long Enroll = Long.parseLong(this.mf2.t2.getText());
			String Mail = this.mf2.t3.getText();
			//String Pass = this.mf2.t4.getText();

			
			System.out.println(name);
			System.out.println(Enroll);
			System.out.println(Mail);

			String s = new String("D:\\OOP-Project\\Student Records\\" + Enroll + ".txt");
			File file = new File(s);

			String s2 = new String("D:\\OOP-Project\\Student Records\\Email\\" + Enroll + ".txt");
			File file2 = new File(s2); 

			boolean result;  
			try   
			{  
				result = file.createNewFile();  //creates a new file  
			
				if(result)      // test if successfully created a new file  
				{  
					System.out.println("file created "+file.getCanonicalPath()); //returns the path string
					FileWriter myWriter = new FileWriter(s);
				    myWriter.write(name);
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




			boolean result2;  
			try   
			{  
				result2 = file2.createNewFile();  //creates a new file  
			
				if(result2)      // test if successfully created a new file  
				{  
					System.out.println("file created "+file2.getCanonicalPath()); //returns the path string
					FileWriter myWriter2 = new FileWriter(s2);
				    myWriter2.write(Mail);
				    myWriter2.close();  
				}  
				else  
				{  
					System.out.println("File already exist at location: "+file2.getCanonicalPath());  
				}  
			}   
			
			catch (IOException est2)   
			{  
				est2.printStackTrace();    //prints exception if any  
			}




			File directory = new File("D:\\OOP-Project\\Student Records");
	        int fileCount = directory.list().length;
	        this.mf.t1.setText(new Integer(fileCount).toString());


			this.mf.setVisible(true);
			this.mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf2.setVisible(false);
		}


		if(e.getActionCommand().equals("1"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("10k Ohm");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("2"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("4.7k Ohm");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("3"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("100k Ohm");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("4"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("220k Ohm");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("5"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("BC547");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("6"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("BD438");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("7"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("BC847C - TP");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("8"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("BC817 - 25 - TP");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("LED"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("LED");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("Battery"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("Battery");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

		if(e.getActionCommand().equals("Board"))
		{
			String z = new String("D:\\OOP-Project\\Records\\list.txt");
			
			try   
			{  
				FileWriter myWriter = new FileWriter(z, true);
				myWriter.write("Board");
				myWriter.write("\n");
				myWriter.close();
			}   
			
			catch (IOException est)   
			{  
				est.printStackTrace();
			} 
		}

	}
}