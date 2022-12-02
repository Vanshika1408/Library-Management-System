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
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
public class aboutUs extends JFrame implements ActionListener{
       private JPanel content;
       private JButton b1;
    public aboutUs() {
         super("About Us");
        setBounds(300,100,700,500);
        content=new JPanel();
        content.setBackground(Color.WHITE);
        setContentPane(content);
        content.setLayout(null);
        
        JLabel l1=new JLabel("Library");
        //l1.setBackground(Color.LIGHT_GRAY);
        l1.setForeground(Color.GREEN);
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));
        l1.setBounds(90,40,155,55);
        content.add(l1);
        
        JLabel l2=new JLabel("Management");
        //l2.setBackground(Color.LIGHT_GRAY);
        l2.setForeground(Color.GREEN);
        l2.setFont(new Font("Times New Roman",Font.BOLD,40));
        l2.setBounds(240,40,250,55);
        content.add(l2);
        
        JLabel l3=new JLabel("System");
        //l2.setBackground(Color.LIGHT_GRAY);
        l3.setForeground(Color.GREEN);
        l3.setFont(new Font("Times New Roman",Font.BOLD,40));
        l3.setBounds(480,40,200,55);
        content.add(l3);
        
        JLabel l4=new JLabel("Developed By:");
        //l2.setBackground(Color.LIGHT_GRAY);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Times New Roman",Font.BOLD,25));
        l4.setBounds(75,150,200,55);
        content.add(l4);
        
        JLabel l5=new JLabel("Tavishi Sharma,");
        //l2.setBackground(Color.LIGHT_GRAY);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Times New Roman",Font.BOLD,25));
        l5.setBounds(240,150,200,55);
        content.add(l5);
        
        JLabel l6=new JLabel("Vanshika Mahajan");
        //l2.setBackground(Color.LIGHT_GRAY);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Times New Roman",Font.BOLD,25));
        l6.setBounds(420,150,250,55);
        content.add(l6);
        
        b1=new JButton("Back");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.setFont(new Font("Tahoma",Font.BOLD,17));
         b1.setBounds(490,380,100,30);
         b1.addActionListener(this);
         content.add(b1);
        
//        
        JLabel l7=new JLabel("Contact Us:");
        //l2.setBackground(Color.LIGHT_GRAY);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Trebuchet MZ",Font.BOLD,25));
        l7.setBounds(75,300,200,55);
        content.add(l7);
        
        JTextArea t=new JTextArea("(Students of Thapar Institute of Engineering and Technology, Patiala)\n                                      (Batch of 2023)");
        t.setFont(new Font("Times new Roman",Font.BOLD+Font.ITALIC,18));
        t.setBounds(83,200,550,60);
        t.setForeground(Color.red);
        content.add(t);
        t.setEditable(false);
        
        JLabel l8=new JLabel("tsharma1_be19@thapar.edu");
        //l2.setBackground(Color.LIGHT_GRAY);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Times New Roman",Font.BOLD,22));
        l8.setBounds(220,302,500,55);
        content.add(l8);
        
          JLabel l9=new JLabel("vmahajan1_be19@thapar.edu");
        //l2.setBackground(Color.LIGHT_GRAY);
        l9.setForeground(Color.RED);
        l9.setFont(new Font("Times New Roman",Font.BOLD,22));
        l9.setBounds(220,330,500,55);
        content.add(l9);
        
        JPanel panel1 = new JPanel();
        panel1.setBorder(new LineBorder(Color.RED, 2, true));
	//panel.setBackground(new Color(211, 211, 211));
	panel1.setBounds(20, 30, 650, 400);
        panel1.setBackground(Color.WHITE);
	content.add(panel1);
        
        
        
    }
       @Override
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==b1){
            this.setVisible(false);
            
        }
    }
    
    public static void main(String args[]){
        new aboutUs().setVisible(true);
    }
}
