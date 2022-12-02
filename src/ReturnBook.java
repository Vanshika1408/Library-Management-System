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
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;
public class ReturnBook extends JFrame implements ActionListener {
private JPanel content;
    JDateChooser datechooser;
    private JTextField t,t1,t2,t3,t4,t5,t6;
    private JButton b1,b2,b3;
    public ReturnBook() {
        setBounds(320,150,617,363);
        content=new JPanel();
        setContentPane(content);
        content.setBackground(Color.WHITE);
        content.setLayout(null);
        
        JLabel ide=new JLabel("Book ID");
        ide.setForeground(Color.BLACK);
        ide.setFont(new Font("Tahoma",Font.BOLD,14));
        ide.setBounds(52,52,87,24);
        content.add(ide);
        
        JLabel l1 = new JLabel("Student ID");
	l1.setForeground(Color.BLACK);
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(243, 52, 87, 24);
	content.add(l1);
        
        JLabel l2 = new JLabel("Book");
	l2.setForeground(Color.BLACK);
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(52, 98, 71, 24);
	content.add(l2);
        
        JLabel l3 = new JLabel("Name");
	l3.setForeground(Color.BLACK);
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(300, 98, 71, 24);
	content.add(l3);
        
        JLabel l5 = new JLabel("Course");
	l5.setForeground(Color.BLACK);
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(52, 143, 87, 24);
	content.add(l5);
        
        JLabel l4 = new JLabel("Branch");
	l4.setForeground(Color.BLACK);
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(303,144, 68, 24);
	content.add(l4);
        
        JLabel l7 = new JLabel("Date Of Issue");
	l7.setForeground(Color.BLACK);
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(52, 188, 105, 29);
	content.add(l7);
        
        JLabel l8 = new JLabel("Date Of Return");
	l8.setForeground(Color.BLACK);
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(52, 234, 118, 29);
	content.add(l8);
        
        t = new JTextField();
	t.setForeground(Color.BLACK);
	t.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
       // t1.setEditable(false);
	t.setBounds(128, 56, 105, 20);
	content.add(t);
	t.setColumns(10);
        
        t1 = new JTextField();
	t1.setForeground(Color.BLACK);
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
       // t1.setEditable(false);
	t1.setBounds(340, 56, 93, 20);
	content.add(t1);
	t1.setColumns(10);
        
         b1=new JButton("Search");
         b1.addActionListener(this);
         b1.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         b1.setFont(new Font("Tahoma",Font.BOLD,14));
         b1.setBounds(443,52,105,29);
         b1.setForeground(Color.WHITE);
         b1.setBackground(Color.BLACK);
         content.add(b1);

	t2 = new JTextField();
	t2.setForeground(Color.BLACK);
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
        t2.setEditable(false);
	t2.setBounds(128, 102, 162, 20);
	content.add(t2);

	t3 = new JTextField();
	t3.setForeground(Color.BLACK);
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
        t3.setEditable(false);
	t3.setBounds(369, 102, 162, 20);
	content.add(t3);
        
        t4 = new JTextField();
	t4.setForeground(Color.BLACK);
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setEditable(false);
	t4.setColumns(10);
	t4.setBounds(128, 147, 162, 20);
	content.add(t4);
        
        t5 = new JTextField();
	t5.setForeground(Color.BLACK);
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t5.setEditable(false);
	t5.setColumns(10);
	t5.setBounds(369, 147, 179, 20);
	content.add(t5);
        
        t6 = new JTextField();
	t6.setForeground(Color.BLACK);
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setEditable(false);
	t6.setColumns(10);
	t6.setBounds(167, 194, 162, 20);
	content.add(t6);
        
        datechooser=new JDateChooser();
        datechooser.setBorder(new LineBorder(Color.BLACK,0,true));
        datechooser.setForeground(Color.GRAY);
        datechooser.setBounds(167,234,172,29);
        content.add(datechooser);
        
         b2=new JButton("Return");
         b2.addActionListener(this);
         b2.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         b2.setFont(new Font("Tahoma",Font.BOLD,14));
         b2.setBounds(369,179,149,30);
         b2.setForeground(Color.WHITE);
         b2.setBackground(Color.BLACK);
         content.add(b2);
         
        b3=new JButton("Back");
         b3.addActionListener(this);
         b3.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         b3.setFont(new Font("Tahoma",Font.BOLD,14));
         b3.setBounds(369,231,149,30);
         b3.setForeground(Color.WHITE);
         b3.setBackground(Color.BLACK);
         content.add(b3);
         
          JPanel forBorder1=new JPanel();
         forBorder1.setBorder(new TitledBorder(new LineBorder(Color.PINK,2),"Return Book",TitledBorder.LEADING,TitledBorder.TOP,null,Color.MAGENTA));
         forBorder1.setBounds(10,24,569,269);
         content.add(forBorder1);
         forBorder1.setBackground(Color.white); 
    }
    
@Override
    public void actionPerformed(ActionEvent a){
        try{
            Connecting connect=new Connecting();
            if(a.getSource()==b1){
                String tobeexecuted="Select * from issueBook where student_id=? and book_id=?";
                PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
                 st.setString(1,t1.getText());
                st.setString(2,t.getText());
                ResultSet rs=st.executeQuery();
                
                while(rs.next()){
                    t2.setText(rs.getString("bname"));
                    t3.setText(rs.getString("sname"));
                    t4.setText(rs.getString("course"));
                    t5.setText(rs.getString("branch"));
                    t6.setText(rs.getString("dateOfIssue"));
                }
                st.close();
                rs.close();
            }
             if(a.getSource()==b2){
                try{
                String tobeexecuted="insert into returnBook(book_id,student_id,bname,sname,course,branch,dateofissue,dateOfReturn) values(?,?,?,?,?,?,?,?)";
                PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
                st.setString(1,t.getText());
                st.setString(2,t1.getText());
                st.setString(3,t2.getText());
                st.setString(4,t3.getText());
                st.setString(5,t4.getText());
                st.setString(6,t5.getText());
                st.setString(7,t6.getText());
                st.setDate(8, new java.sql.Date(datechooser.getDate().getTime()));
                
                int rs=st.executeUpdate();
                if(rs>0){
                    JOptionPane.showMessageDialog(null,"Processing");
                    delete();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error!");
                }
               
            }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
             if(a.getSource()==b3){
                 this.setVisible(false);
                 new Home().setVisible(true);
             }
        }
        catch(Exception e){
            
        }
    }
    public static void main(String args[]){
        new ReturnBook().setVisible(true);
    }
    public void delete(){
        try{
            Connecting connect=new Connecting();
            String tobeexecuted="delete from issuebook where book_id=?";
            PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
            st.setString(1,t.getText());
            int checked=st.executeUpdate();
            if(checked>0){
                JOptionPane.showMessageDialog(null,"Book Returned");   
            }
            else{
                JOptionPane.showMessageDialog(null,"Error!");   
            }   
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"e");
            e.printStackTrace();
        }
    }
}
