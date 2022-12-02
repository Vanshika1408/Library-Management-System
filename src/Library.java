/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahaj
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Library  extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1;
    public Library(){
        setSize(1000,550);
        setLayout(null);
        setLocation(150,100);
        l1=new JLabel("");
        b1=new JButton("NEXT");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Times New Roman",Font.BOLD,25));
        b1.setForeground(Color.YELLOW);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.png"));
       Image fin=i1.getImage().getScaledInstance(1000,550,Image.SCALE_DEFAULT);
       ImageIcon displayed=new ImageIcon(fin);
       l1=new JLabel(displayed);
       l1.setBounds(0,0,1000,550);
       add(l1);
       
       b1.setBounds(830,470,145,40);
       l1.add(b1);
       b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==b1){
        new UserLogin().setVisible(true);
        this.setVisible(false);
        }
    }
    public static void main(String args[]){
        new Library().setVisible(true);
    }
}
