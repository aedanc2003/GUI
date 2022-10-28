package Drawing;
import javax.swing.*;
import java.awt.*;

public class flag{
    public static void main(String[] args){
      JFrame theGUI = new JFrame();
      theGUI.setTitle("Russia Flag");
      theGUI.setSize(300, 200);
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel1 = new JPanel(); 
      panel1.setBackground(Color.white);
      JPanel panel2 = new JPanel(); 
      panel2.setBackground(Color.blue);
      JPanel panel3 = new JPanel(); 
      panel3.setBackground(Color.red);
      Container pane = theGUI.getContentPane();
      pane.setLayout(new GridLayout(3, 1));
      pane.add(panel1); //white
      pane.add(panel2); //blue
      pane.add(panel3); //red
      theGUI.setVisible(true);
    }
}