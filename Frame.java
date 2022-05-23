import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;  

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame implements ActionListener
{
    
    private JButton button;
    private JPanel panel;

    public Frame()
    {               
        

        button = new JButton("Login");
        panel = new JPanel(){   public void paintComponent(Graphics g) 
                                {  
                                    Image img = Toolkit.getDefaultToolkit().getImage(  
                                    Frame.class.getResource(""));  
                                    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                                }  
                            };  
        
        button.setLocation(175,50);
        button.setSize(150, 50);
        
        Container contentPane = getContentPane();
        
        button.addActionListener(this);
        
        setLayout(null);
        setSize(1050, 712);   
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);   
        setLocationRelativeTo(null);
        
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));  
        panel.setLayout(new BorderLayout(0, 0));  
        setContentPane(panel); 
        contentPane.add(button);
         
    }
    
    public void paint(Graphics g) 
    {
        
    }
    
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == button)             
        {
            Color color = new Color(222, 12, 54);      
            getContentPane().setBackground(color); 
        }
    }
    
    
    public static void main(String[] args ) 
    {
        Frame app = new Frame();
    }
}
