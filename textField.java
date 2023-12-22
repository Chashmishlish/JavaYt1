package com.mycompany.project1;

import java.awt.Container;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTextField;


public class textField {
    public static void main(String args[]){
       
    JFrame frame = new JFrame();
     frame.setVisible(true); //screen visiblity
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500); //left, top, width, heigth -- for boundaries at corner 
        frame.setTitle("H³S Airlines"); //for title
        Container c = frame.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        
        //For text field --- import javax.swing.JTextField;
        JTextField tf = new JTextField();
        tf.setBounds(100,50,120,30);
        c.add(tf);
        
        tf.setText("Enter your name");
        //if i want k mere textbox me likha text koi change na kr paye tow..
        tf.setEditable(false); //if true user can edit text, if false user can't 
        
        
        //font - 3 parameters (font family, nature of font, size of font)
        Font font = new Font("Georgia", Font.ITALIC, 14);
        tf.setFont(font);
        
        //to change text color - foreground
        tf.setForeground(Color.BLUE);
        tf.setBackground(Color.PINK);
        
       
}
}
