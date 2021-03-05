import java.awt.*;
import java.awt.event.*; 
public class AwtFrame{
public static void main(String[] args){
Frame frm = new Frame("Java AWT Frame");
Label lbl = new Label("Welcome .",Label.CENTER);
frm.add(lbl);
frm.setSize(400,400);
frm.setVisible(true);
  }
  public void windowClosing(WindowEvent e) {  
   
}  
}
