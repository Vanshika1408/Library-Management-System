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
import javax.swing.border.*;
import java.awt.event.*;
public class ReadMe extends JFrame {
    private JPanel content;
    
    public ReadMe() {
        super("Read Me- Library Management System");
        setBounds(300,100,700,500);
        
        content=new JPanel();
        setContentPane(content);
        content.setLayout(null);
        JLabel l1=new JLabel("Library");
        //l1.setBackground(Color.LIGHT_GRAY);
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));
        l1.setBounds(90,40,155,55);
        content.add(l1);
        
        JLabel l2=new JLabel("Management");
        //l2.setBackground(Color.LIGHT_GRAY);
        l2.setForeground(Color.blue);
        l2.setFont(new Font("Times New Roman",Font.BOLD,40));
        l2.setBounds(240,40,250,55);
        content.add(l2);
        
        JLabel l3=new JLabel("System");
        //l2.setBackground(Color.LIGHT_GRAY);
        l3.setForeground(Color.blue);
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
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.GREEN, 2, true));
	//panel.setBackground(new Color(211, 211, 211));
	panel.setBounds(65, 150, 580, 60);
        panel.setBackground(Color.WHITE);
	content.add(panel);
        
        JPanel panel1 = new JPanel();
        panel1.setBorder(new LineBorder(Color.BLACK, 2, true));
	//panel.setBackground(new Color(211, 211, 211));
	panel1.setBounds(60, 260, 600, 160);
        panel1.setBackground(Color.WHITE);
	content.add(panel1);
        
        JTextArea t=new JTextArea("Library Management System is small effort by us that aims to automate the\nlibrary system thereby reducing human effort and paperwork. The project has\nbeen designed such that the system can maintain the record of all the daily\nactivities of a library. For eg: the track of all the books present in the library\nand total students registered. Further, it keeps the track of books issued to\nwhich student along with the date of issue and similarly, it keeps track of the\nreturned books. ");
        t.setFont(new Font("Times new Roman",Font.ITALIC,18));
        t.setBounds(60,260,600,150);
        t.setForeground(Color.red);
        panel1.add(t);
        t.setEditable(false);
        
        
    }
    public static void main(String args[]){
        new ReadMe().setVisible(true);
    }
    
}
