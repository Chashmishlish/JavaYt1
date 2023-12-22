
package com.mycompany.project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton btn;
    
    MyFrame (){
       c=this.getContentPane();
       c.setLayout(null);
       
       btn =new JButton("Click me");
       btn.setBounds(100,100,100,50);
       c.add(btn);
       btn.addActionListener(this); //last line of code
    }
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.PINK); //2nd last
    }
}
public class ActionDemo {
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setTitle("Action Demo");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
}
