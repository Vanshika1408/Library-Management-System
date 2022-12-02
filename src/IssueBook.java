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

public class IssueBook extends JFrame implements ActionListener {
    private JPanel content;
    JDateChooser datechooser;
    private JTextField id,name,isbn,publisher,edition,price,pages,t1,t2,t3,t4,t5,t6;
    private JButton b1,b2,b3,b4;
    
    public IssueBook() {
        setBounds(200,120,830,500);
        content=new JPanel();
        setContentPane(content);
        content.setBackground(Color.WHITE);
        content.setLayout(null);
        
        JLabel ide=new JLabel("Book ID");
        ide.setForeground(Color.BLACK);
        ide.setFont(new Font("Tahoma",Font.BOLD,14));
        ide.setBounds(47,63,100,23);
        content.add(ide);
        
        JLabel n=new JLabel("Name");
        n.setForeground(Color.BLACK);
        n.setFont(new Font("Tahoma",Font.BOLD,14));
        n.setBounds(47,97,100,23);
        content.add(n);
        
        JLabel is=new JLabel("ISBN");
        is.setForeground(Color.BLACK);
        is.setFont(new Font("Tahoma",Font.BOLD,14));
        is.setBounds(47,131,92,22);
        content.add(is);
        
        JLabel pub=new JLabel("Publisher");
        pub.setForeground(Color.BLACK);
        pub.setFont(new Font("Tahoma",Font.BOLD,14));
        pub.setBounds(47,165,150,22);
        content.add(pub);
        
        JLabel edi=new JLabel("Edition");
        edi.setForeground(Color.BLACK);
        edi.setFont(new Font("Tahoma",Font.BOLD,14));
        edi.setBounds(47,199,92,22);
        content.add(edi);
        
        JLabel prices=new JLabel("Price");
        prices.setForeground(Color.BLACK);
        prices.setFont(new Font("Tahoma",Font.BOLD,14));
        prices.setBounds(47,233,92,22);
        content.add(prices);
         
        JLabel page=new JLabel("Pages");
        page.setForeground(Color.BLACK);
        page.setFont(new Font("Tahoma",Font.BOLD,14));
        page.setBounds(47,263,92,30);
        content.add(page);
        
         id= new JTextField("");
         id.setForeground(Color.BLACK);
         id.setFont(new Font("Trebuchet MS",Font.BOLD,14));
         id.setBounds(126,66,86,20);
         //id.setEditable(false);
         content.add(id);
         
         name= new JTextField("");
         name.setForeground(Color.BLACK);
         name.setFont(new Font("Trebuchet MS",Font.BOLD,14));
         name.setBounds(126,100,208,20);
         name.setEditable(false);
         content.add(name);
         name.setColumns(10);
         
         isbn= new JTextField("");
         isbn.setForeground(Color.BLACK);
         isbn.setFont(new Font("Trebuchet MS",Font.BOLD,14));
         isbn.setBounds(126,134,208,20);
         isbn.setEditable(false);
         content.add(isbn);
         isbn.setColumns(10);
         
         publisher= new JTextField("");
         publisher.setForeground(Color.BLACK);
         publisher.setFont(new Font("Trebuchet MS",Font.BOLD,14));
         publisher.setBounds(126,168,208,20);
         publisher.setEditable(false);
         content.add(publisher);
         publisher.setColumns(10);
         
         edition= new JTextField("");
         edition.setForeground(Color.BLACK);
         edition.setFont(new Font("Trebuchet MS",Font.BOLD,14));
         edition.setBounds(126,202,208,20);
         edition.setEditable(false);
         content.add(edition);
         edition.setColumns(10);
         
         price= new JTextField("");
         price.setForeground(Color.BLACK);
         price.setFont(new Font("Trebuchet MS",Font.BOLD,14));
         price.setBounds(126,236,208,20);
         price.setEditable(false);
         content.add(price);
         price.setColumns(10);
         
         pages= new JTextField("");
         pages.setForeground(Color.BLACK);
         pages.setFont(new Font("Trebuchet MS",Font.BOLD,14));
         pages.setEditable(false);
         pages.setBounds(126,270,208,20);
         content.add(pages);
         pages.setColumns(10);
         
         b1=new JButton("Search");
         b1.addActionListener(this);
         b1.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         b1.setFont(new Font("Tahoma",Font.BOLD,14));
         b1.setBounds(234,59,100,30);
         b1.setForeground(Color.WHITE);
         b1.setBackground(Color.BLACK);
         content.add(b1);
         
         JPanel forBorder=new JPanel();
         forBorder.setBorder(new TitledBorder(new LineBorder(Color.PINK,2),"Issue Book",TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLUE));
         forBorder.setBounds(10,38,345,288);
         content.add(forBorder);
         forBorder.setBackground(Color.white);
         
        JLabel l1 = new JLabel("Student ID");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(384, 63, 100, 23);
	content.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(384, 103, 100, 23);
	content.add(l2);

	JLabel l3 = new JLabel("Father's Name");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(384, 145, 110, 23);
	content.add(l3);

	JLabel l4 = new JLabel("Branch");
	l4.setForeground(new Color(25, 25, 112));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(384,230, 102, 22);
	content.add(l4);

        JLabel l5 = new JLabel("Course");
	l5.setForeground(new Color(25, 25, 112));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(384, 187, 100, 23);
	content.add(l5);

	JLabel l6 = new JLabel("Semester");
	l6.setForeground(new Color(25, 25, 112));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(384, 275, 100, 23);
	content.add(l6);
        
        t1 = new JTextField();
	t1.setForeground(Color.BLACK);
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
       // t1.setEditable(false);
	t1.setBounds(508, 66, 86, 20);
	content.add(t1);
	t1.setColumns(10);
        
         b2=new JButton("Search");
         b2.addActionListener(this);
         b2.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         b2.setFont(new Font("Tahoma",Font.BOLD,14));
         b2.setBounds(604,59,100,30);
         b2.setForeground(Color.WHITE);
         b2.setBackground(Color.BLACK);
         content.add(b2);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
        t2.setEditable(false);
	t2.setBounds(508, 106, 208, 20);
	content.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
        t3.setEditable(false);
	t3.setBounds(508, 149, 208, 20);
	content.add(t3);
        
        t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setEditable(false);
	t4.setColumns(10);
	t4.setBounds(508, 190, 208, 20);
	content.add(t4);
        
        t5 = new JTextField();
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t5.setEditable(false);
	t5.setColumns(10);
	t5.setBounds(508, 234, 208, 20);
	content.add(t5);
        
        t6 = new JTextField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setEditable(false);
	t6.setColumns(10);
	t6.setBounds(508, 278, 208, 20);
	content.add(t6);
        
         JPanel forBorder1=new JPanel();
         forBorder1.setBorder(new TitledBorder(new LineBorder(Color.CYAN,2),"Student Details",TitledBorder.LEADING,TitledBorder.TOP,null,Color.MAGENTA));
         forBorder1.setBounds(360,38,378,340);
         content.add(forBorder1);
         forBorder1.setBackground(Color.white);
        
        JLabel l7 = new JLabel("Date Of Issue");
	l7.setForeground(Color.BLUE);
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(20, 338, 118, 26);
	content.add(l7);
        
        datechooser=new JDateChooser();
        datechooser.setBorder(new LineBorder(Color.BLACK,1,true));
        datechooser.setForeground(Color.GRAY);
        datechooser.setBounds(137,337,200,29);
        content.add(datechooser);
        
        b3=new JButton("Issue");
        b3.addActionListener(this);
         b3.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         b3.setFont(new Font("Tahoma",Font.BOLD,14));
         b3.setBorder(new LineBorder(Color.BLACK,1,true));
         b3.setBounds(60,385,118,33);
         b3.setForeground(Color.WHITE);
         b3.setBackground(Color.BLACK);
         content.add(b3);
         
         b4=new JButton("Back");
        b4.addActionListener(this);
         b4.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         b4.setFont(new Font("Tahoma",Font.BOLD,14));
         b4.setBorder(new LineBorder(Color.BLACK,1,true));
         b4.setBounds(550,400,118,33);
         b4.setForeground(Color.WHITE);
         b4.setBackground(Color.BLACK);
         content.add(b4); 
    }
    @Override
    public void actionPerformed(ActionEvent a){
        try{
            Connecting connect= new Connecting();
            if(a.getSource()==b1){
            String tobeexecuted="Select * from book where book_id=?";
            PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
            st.setString(1,id.getText());
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                name.setText(rs.getString("name"));
                isbn.setText(rs.getString("isbn"));
                publisher.setText(rs.getString("publisher"));
                edition.setText(rs.getString("edition"));  
                price.setText(rs.getString("price"));
                pages.setText(rs.getString("pages"));
            }
            st.close();
            rs.close();
            }
            if(a.getSource()==b2){
            String tobeexecuted="Select * from student where student_id=?";
            PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
            st.setString(1,t1.getText());
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                t2.setText(rs.getString("name"));
                t3.setText(rs.getString("father"));
                t4.setText(rs.getString("course"));
                t5.setText(rs.getString("branch"));  
                t6.setText(rs.getString("semester"));
            }
            st.close();
            rs.close();
            }
            if(a.getSource()==b3){
                try{
                String tobeexecuted="insert into issuebook(book_id,student_id,bname,sname,course,branch,dateofissue) values(?,?,?,?,?,?,?)";
                PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
                st.setString(1,id.getText());
                st.setString(2,t1.getText());
                st.setString(3,name.getText());
                st.setString(4,t2.getText());
                st.setString(5,t4.getText());
                st.setString(6,t5.getText());
                st.setDate(7, new java.sql.Date(datechooser.getDate().getTime()));
                
                int rs=st.executeUpdate();
                if(rs>0){
                    JOptionPane.showMessageDialog(null,"Book Issued Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error!");
                }
               
            }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(a.getSource()==b4){
                this.setVisible(false);
                new Home().setVisible(true);
            }
            connect.c.close();
        }
        catch(Exception e){
            
        }
    }
    public static void main(String args[]){
        new IssueBook().setVisible(true);
    }
}
