import java.awt.*;  
import java.awt.event.*;  
public class Frame  extends WindowAdapter{  
    Frame f;  
   Frame(){  
        f=new Frame();  
		Label lbl = new Label("Welcome .",Label.CENTER);
        f.addWindowListener(this);  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void windowClosing(WindowEvent e) {  
    f.dispose();  
}  
public static void main(String[] args) {  
    new Frame();  
}  
}  
