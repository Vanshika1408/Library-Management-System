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
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.awt.event.*;
public class Statistics extends JFrame {
    private JPanel content;
    private JTable table;
    private JTable table_1;
    
    public Statistics() {
        setBounds(200,50,810,594);
        content=new JPanel();
        setContentPane(content);
        content.setBackground(Color.WHITE);
        content.setLayout(null);
        
        JScrollPane scrollpane=new JScrollPane();
        scrollpane.setBounds(40,51,708,217);
        content.add(scrollpane);
        
        table=new JTable();
        table.setBackground(Color.WHITE);
        table.setForeground(Color.RED);
        table.setFont(new Font("Trebuchet MS",Font.BOLD,15));
        scrollpane.setViewportView(table);
        
         JPanel forBorder1=new JPanel();
         forBorder1.setBorder(new TitledBorder(new LineBorder(Color.CYAN,2),"Issue Book Details",TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLUE));
         forBorder1.setBounds(26,36,737,240);
         content.add(forBorder1);
         forBorder1.setBackground(Color.white);
         
         JLabel l1=new JLabel("Back");
        l1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent arg0){
                setVisible(false);
                new Home().setVisible(true);
            }
        });
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Tahome",Font.BOLD,18));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i2=i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l1.setIcon(i3);
        l1.setBounds(690,13,96,27);
        content.add(l1);
        
        JScrollPane scrollpane1=new JScrollPane();
        scrollpane1.setBounds(40,316,717,217);
        content.add(scrollpane1);
        
        table_1=new JTable();
        table_1.setBackground(Color.WHITE);
        table_1.setForeground(Color.MAGENTA);
        table_1.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        scrollpane1.setViewportView(table_1);
        
         JPanel forBorder2=new JPanel();
         forBorder2.setBorder(new TitledBorder(new LineBorder(Color.GREEN,2),"Return Book Details",TitledBorder.LEADING,TitledBorder.TOP,null,Color.orange));
         forBorder2.setBounds(22,299,741,240);
         content.add(forBorder2);
         forBorder2.setBackground(Color.white);
        
         IssueBook();
         ReturnBook();
    }
    public void IssueBook(){
        try{
            Connecting connect=new Connecting();
            String tobeexecuted="Select * from issueBook";
            PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
            ResultSet rs=st.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            
        }
    }
    public void ReturnBook(){
        try{
            Connecting connect=new Connecting();
            String tobeexecuted="Select * from returnBook";
            PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
            ResultSet rs=st.executeQuery();
            table_1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            
        }
    }
    
    public static void main(String args[]){
        new Statistics().setVisible(true);
    }
    
}
