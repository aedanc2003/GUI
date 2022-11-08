package PaintApp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ColorButton extends JButton{
    //class variables
    private String name;
    private Color color;
    public static Random rand=new Random();

    public ColorButton(){
        color = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
        name = "try me";
        this.setBackground(this.color);
        this.setText(this.name);
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color g){
        this.setBackground(g);
    }

}