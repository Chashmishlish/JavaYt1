//video 5
package com.mycompany.project1;

import java.awt.*;
import javax.swing.*;


public class myButton {
      public static void main(String args[]){
       
    JFrame frame = new JFrame();
     frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500); //left, top, width, heigth -- for boundaries at corner 
        frame.setTitle("H³S Airlines"); //for title
        Container c = frame.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        //button me image show, folder me img dalni pregi wrna run nhi krega
//        ImageIcon icon = new ImageIcon("")
//        JButton btn = new JButton("icon");
//        btn.setSize(icon.getIconWidth(), icon.getIconHeight());
          
//button banane k liye - object
     JButton btn = new JButton("Click me"); //iska peramete change hoga img insert krne k liye
     btn.setSize(100,30); //ye change hoga jb button me insert krenge img
     btn.setLocation(100,100);
     c.add(btn);
     
     Font font = new Font("Georgia", Font.BOLD, 12);
     btn.setFont(font);
     
     btn.setText("My Button");  //to overwrite text
     btn.setForeground(Color.BLUE);
     btn.setBackground(Color.YELLOW);
     
     //to change the face of cursor 
//  Cursor cur = new Cursor(Cursor.HAND_CURSOR);
//  Cursor cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
    Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
    btn.setCursor(cur);
        
//     btn.setEnabled(false); //false to disable the button , you can't click 
//     btn.setVisible(false); //button show he na ho- false, ghyb hojayega
   
     
     
}
}
