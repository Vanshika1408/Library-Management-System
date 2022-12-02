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
import java.sql.*;

public class Home extends JFrame implements ActionListener {
    private JPanel content;
    private JButton bookadd,stat,studadd,issue,ret,about;
    

    public Home() {
        setBounds(320,50,700,600);
        content=new JPanel();
        setContentPane(content);
        content.setLayout(null);
        
        JMenuBar menu=new JMenuBar();
        menu.setBackground(Color.BLACK);
        content.add(menu);
        menu.setBounds(0,10,700,30);
        
        JMenu exitm=new JMenu("Exit");
        exitm.setForeground(Color.WHITE);
        
        JMenuItem logout=new JMenuItem("Logout");
        logout.setBackground(Color.WHITE);
        logout.setForeground(Color.BLACK);
        logout.addActionListener(this);
        exitm.add(logout);
        
        JMenuItem exititem=new JMenuItem("Exit");
        exititem.setBackground(Color.WHITE);
        exititem.setForeground(Color.BLACK);
        exititem.addActionListener(this);
        exitm.add(exititem);
        
        JMenu help=new JMenu("Help");
        help.setForeground(Color.WHITE);
        
        JMenuItem readme=new JMenuItem("Read Me");
        readme.setBackground(Color.WHITE);
        readme.setForeground(Color.BLACK);
        readme.addActionListener(this);
        help.add(readme);
        
        JMenuItem aboutus=new JMenuItem("About Us");
        aboutus.setBackground(Color.WHITE);
        aboutus.setForeground(Color.BLACK);
        aboutus.addActionListener(this);
        help.add(aboutus);
        
        JMenu record=new JMenu("Record");
        record.setForeground(Color.WHITE);
        
        
        JMenuItem bookdetails=new JMenuItem("Book Details");
        bookdetails.setBackground(Color.WHITE);
        bookdetails.setForeground(Color.BLACK);
        bookdetails.addActionListener(this);
        record.add(bookdetails);
        
        JMenuItem studentdetails=new JMenuItem("Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.setForeground(Color.BLACK);
        studentdetails.addActionListener(this);
        record.add(studentdetails);
        
        menu.add(record);
        menu.add(help);
        menu.add(exitm);
        
        JLabel welcome=new JLabel("WELCOME");
        welcome.setForeground(Color.RED);
        welcome.setFont(new Font("Times New Roman",Font.BOLD,35));
        welcome.setBounds(250,30,700,80);
        content.add(welcome);
        
        JLabel l1=new JLabel("");
        l1.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/second.png"));
        Image fin=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon displayed=new ImageIcon(fin);
        l1=new JLabel(displayed);
        l1.setBounds(75,100,159,152);
        content.add(l1);
        
        JLabel l2=new JLabel("");
        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/third.png"));
        Image fin1=i2.getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT);
        ImageIcon displayed1=new ImageIcon(fin1);
        l2=new JLabel(displayed1);
        l2.setBounds(270,100,159,152);
        content.add(l2);
        
        JLabel l3 = new JLabel("");
        ImageIcon i3  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fourth.png"));
        Image fin2 = i3.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon displayed2 = new ImageIcon(fin2);
        l3 = new JLabel(displayed2);
        l3.setBounds(470, 100, 159, 152);
        content.add(l3);

        bookadd = new JButton("Add Books");
        bookadd.addActionListener(this);
        bookadd.setBackground(Color.BLACK);
        bookadd.setForeground(Color.WHITE);
        bookadd.setBounds(75, 240, 145, 35);
        content.add(bookadd);

        stat = new JButton("Statistics");
        stat.addActionListener(this);
        stat.setBackground(Color.BLACK);
        stat.setForeground(Color.WHITE);
        stat.setBounds(280, 240, 145, 35);
        content.add(stat);

        studadd = new JButton("Add Student");
        studadd.addActionListener(this);
        studadd.setBackground(Color.BLACK);
        studadd.setForeground(Color.WHITE);
        studadd.setBounds(480, 240, 145, 35);
        content.add(studadd); 

        issue = new JButton("Issue Book");
        issue.addActionListener(this);
        issue.setBackground(Color.BLACK);
        issue.setForeground(Color.WHITE);
        issue.setBounds(75, 470, 145, 35);
        content.add(issue);

        ret = new JButton("Return Book");
        ret.addActionListener(this);
        ret.setBackground(Color.BLACK);
        ret.setForeground(Color.WHITE);
        ret.setBounds(280, 470, 145, 35);
        content.add(ret);

        about = new JButton("About Us");
        about.addActionListener(this);
        about.setBackground(Color.BLACK);
        about.setForeground(Color.WHITE);
        about.setBounds(480, 470, 145, 35);
        content.add(about);

        JLabel l4 = new JLabel("");
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fifth.png"));
        Image fin3 = i4.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon displayed3 = new ImageIcon(fin3);
        l4 = new JLabel(displayed3);
        l4.setBounds(75, 320, 159, 163);
        content.add(l4);

        JLabel l5 = new JLabel("");
        ImageIcon i5  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/sixth.png"));
        Image fin4 = i5.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon displayed4 = new ImageIcon(fin4);
        l5 = new JLabel(displayed4);
        l5.setBounds(280, 325, 139, 152);
        content.add(l5);

        JLabel l6 = new JLabel("");
        ImageIcon i6  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/seventh.png"));
        Image fin5 = i6.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon displayed5 = new ImageIcon(fin5);
        l6 = new JLabel(displayed5);
        l6.setBounds(480, 320, 157, 152);
        content.add(l6);

	}

    @Override
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Logout")){
            this.setVisible(false);
             new UserLogin().setVisible(true);
            }
        else if(msg.equals("Exit")){
                System.exit(ABORT);
            }
        else if(msg.equals("Read Me")){
            new ReadMe().setVisible(true);
            }
        else if(msg.equals("About Us")){ 
		new aboutUs().setVisible(true);
            }
        else if(msg.equals("Book Details")){
                this.setVisible(false);
		new BookDetails().setVisible(true);
            }
        else if(msg.equals("Student Details")){
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }

            if(ae.getSource() == bookadd){
                this.setVisible(false);
                new AddBook().setVisible(true);
            }
            if(ae.getSource() == stat){
                this.setVisible(false);
                new Statistics().setVisible(true);
            }
            if(ae.getSource() == studadd){
                this.setVisible(false);
                new AddStudent().setVisible(true);
            }
            if(ae.getSource() == issue){
                this.setVisible(false);
                new IssueBook().setVisible(true);
            }
            if(ae.getSource() == ret){
                this.setVisible(false);
                new ReturnBook().setVisible(true);

            }
            if(ae.getSource() == about){
               // this.setVisible(false);
                new aboutUs().setVisible(true);

            }

        }
      
    public static void main(String args[]){
        new Home().setVisible(true);
    }
    
}
