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
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
public class AddBook extends JFrame implements ActionListener  {
    private JPanel content;
    private JTextField id,name,isbn,publisher,edition,price,pages;
    private JButton ad,back;
    public void random(){
        Random r=new Random();
        id.setText(""+r.nextInt(1000+1));
    }
    public AddBook() {
         super("Add Books");
         setBounds(350,100,606,500);
         content=new JPanel();
         setContentPane(content);
         content.setBackground(Color.WHITE);
         content.setLayout(null);
         content.setBorder(new EmptyBorder(5,5,5,5));
         
         JLabel n=new JLabel("Name");
         n.setForeground(Color.BLACK);
         n.setFont(new Font("Tahoma",Font.BOLD,14));
         n.setBounds(150,114,92,22);
         content.add(n);
         
         JLabel is=new JLabel("ISBN");
         is.setForeground(Color.BLACK);
         is.setFont(new Font("Tahoma",Font.BOLD,14));
         is.setBounds(150,147,92,22);
         content.add(is);
         
         JLabel pub=new JLabel("Publisher");
         pub.setForeground(Color.BLACK);
         pub.setFont(new Font("Tahoma",Font.BOLD,14));
         pub.setBounds(150,180,150,22);
         content.add(pub);
         
         JLabel edi=new JLabel("Edition");
         edi.setForeground(Color.BLACK);
         edi.setFont(new Font("Tahoma",Font.BOLD,14));
         edi.setBounds(150,215,92,22);
         content.add(edi);
         
         JLabel prices=new JLabel("Price");
         prices.setForeground(Color.BLACK);
         prices.setFont(new Font("Tahoma",Font.BOLD,14));
         prices.setBounds(150,250,92,22);
         content.add(prices);
         
         JLabel page=new JLabel("Pages");
         page.setForeground(Color.BLACK);
         page.setFont(new Font("Tahoma",Font.BOLD,14));
         page.setBounds(150,279,92,30);
         content.add(page);
         
         JLabel ide=new JLabel("Book ID");
         ide.setForeground(Color.BLACK);
         ide.setFont(new Font("Tahoma",Font.BOLD,14));
         ide.setBounds(150,80,150,22);
         content.add(ide);
         
         //id,name,isbn,publisher,edition,price,pages;
         id= new JTextField("");
         id.setForeground(Color.BLACK);
         id.setFont(new Font("Trebuchet MS",Font.PLAIN,14));
         id.setBounds(285,80,170,22);
         id.setEditable(false);
         content.add(id);
         
         name= new JTextField("");
         name.setForeground(Color.BLACK);
         name.setFont(new Font("Trebuchet MS",Font.PLAIN,14));
         name.setBounds(285,114,170,22);
         content.add(name);
         
         isbn= new JTextField("");
         isbn.setForeground(Color.BLACK);
         isbn.setFont(new Font("Trebuchet MS",Font.PLAIN,14));
         isbn.setBounds(285,147,170,22);
         content.add(isbn);
         
         publisher= new JTextField("");
         publisher.setForeground(Color.BLACK);
         publisher.setFont(new Font("Trebuchet MS",Font.PLAIN,14));
         publisher.setBounds(285,180,170,22);
         content.add(publisher);
         
         edition= new JTextField("");
         edition.setForeground(Color.BLACK);
         edition.setFont(new Font("Trebuchet MS",Font.PLAIN,14));
         edition.setBounds(285,215,170,22);
         content.add(edition);
         
         price= new JTextField("");
         price.setForeground(Color.BLACK);
         price.setFont(new Font("Trebuchet MS",Font.PLAIN,14));
         price.setBounds(285,250,170,22);
         content.add(price);
         
         pages= new JTextField("");
         pages.setForeground(Color.BLACK);
         pages.setFont(new Font("Trebuchet MS",Font.PLAIN,14));
         pages.setBounds(285,285,170,22);
         content.add(pages);
         
         ad=new JButton("ADD");
         ad.addActionListener(this);
         ad.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         ad.setFont(new Font("Tahoma",Font.BOLD,25));
         ad.setBounds(150,330,108,33);
         ad.setForeground(Color.WHITE);
         ad.setBackground(Color.BLACK);
         content.add(ad);
         
         back=new JButton("BACK");
         back.addActionListener(this);
         back.setBorder(new CompoundBorder(new LineBorder(Color.WHITE),null));
         back.setFont(new Font("Tahoma",Font.BOLD,25));
         back.setBounds(320,330,108,33);
         back.setForeground(Color.WHITE);
         back.setBackground(Color.BLACK);
         content.add(back);
         
         JPanel forBorder=new JPanel();
         forBorder.setBorder(new TitledBorder(new LineBorder(Color.RED,2),"Add Books",TitledBorder.LEADING,TitledBorder.TOP,null,Color.GREEN));
         forBorder.setBounds(60,40,470,370);
         content.add(forBorder);
         forBorder.setBackground(Color.white);
         random();
        
    }
    @Override
    public void actionPerformed(ActionEvent a){
        try{
            Connecting connect=new Connecting();
            if(a.getSource()==ad){
                String tobeexecuted="insert into book(book_id,name,isbn,publisher,edition,price,pages) values(?,?,?,?,?,?,?)";
                PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
                st.setString(1,id.getText());
                st.setString(2,name.getText());
                st.setString(3,isbn.getText());
                st.setString(4,publisher.getText());
                st.setString(5,edition.getText());
                st.setString(6,price.getText());
                st.setString(7,pages.getText());
                
                int rs=st.executeUpdate();
                if(rs>0){
                    JOptionPane.showMessageDialog(null,"Book Added Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error!");
                }
                random();
                name.setText("");
                isbn.setText("");
                publisher.setText("");
                edition.setText("");
                pages.setText("");
                price.setText("");
                st.close();
            }
            if(a.getSource()==back){
                this.setVisible(false);
                new Home().setVisible(true);
            }
            connect.c.close();
        }
        catch(Exception e){
            
        }
    }
    public static void main(String args[]){
        new AddBook().setVisible(true);
    }
    
}
