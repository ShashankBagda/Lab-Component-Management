import java.awt.*;  
import javax.swing.JFrame;  
  
public class MyCanvas extends Canvas{  
      
    public void paint(Graphics g) 
    {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("home.png");  
        g.drawImage(i, 0, 0,this);  
          
    }  
    
    public static void main(String[] args) 
    {  
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        //f.setSize(1600, 850);  
        f.setVisible(true);  
    }  
  
}  