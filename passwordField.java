
package com.mycompany.project1;

import java.awt.*;
import javax.swing.*;


public class passwordField {
    public static void main(String args[]){
       
    JFrame frame = new JFrame();
     frame.setVisible(true); //screen visiblity
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500); //left, top, width, heigth -- for boundaries at corner 
        frame.setTitle("H³S Airlines"); //for title
        Container c = frame.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        //For Password field
        JPasswordField pf = new JPasswordField();
        pf.setBounds(100,50,120,30);
        c.add(pf);
        
       pf.setText("1234");
       pf.setFont(new Font("Ariel", Font.ITALIC, 20));
        
       //for showing other special character for pass
       pf.setEchoChar('*');
       
       //for password - HIDE OR SHOW 
       pf.setEchoChar((char)0);
       
        //font - 3 parameters (font family, nature of font, size of font)
//        Font font = new Font("Georgia", Font.BOLD, 20);
//        pf.setFont(font);
//        
        //to change text color - foreground
        pf.setForeground(Color.BLUE);
        pf.setBackground(Color.PINK);
        
        
}
}
