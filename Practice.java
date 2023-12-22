
import javax.swing.*;
import java.awt.*;
public class Practice 
{
    
    public static void main(String args[]){
        JFrame frame = new JFrame();
        //Jframe is just like a window 
        //Jframe ke visiblity bydefault false hote hai
        frame.setVisible(true); //screen visiblity
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); //length, height
        frame.setLocation(100, 50); //left- 100px, top-50px 
        frame.setBounds(100, 100, 500, 500); //left, top, width, heigth -- for boundaries at corner 
        frame.setTitle("H³S Airlines"); //for title
     
        //container class k liye import krna pregi awt class
        Container c = frame.getContentPane();
        //Color color = new Color(157,34,53) -crimson;
        c.setBackground(Color.PINK);
        
        //if we want user to do not resize the window then,
        frame.setResizable(false);

      //error
        //for icon
//        ImageIcon icon = new ImageIcon("small_image.png");
//        frame.setIconImage(icon.getImage());
    }
}
