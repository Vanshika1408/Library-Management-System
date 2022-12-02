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

public class SignUp extends JFrame implements ActionListener {
    private JPanel content;
    private JTextField userid;
    private JTextField name;
    private JTextField pass;
    private JButton create,back;
    
    public SignUp(){
         setBounds(300,150,606,406);
         content=new JPanel();
         setContentPane(content);
         content.setBackground(Color.LIGHT_GRAY);
         content.setLayout(null);
         
         JLabel username=new JLabel("User Id: ");
         username.setForeground(Color.BLACK);
         username.setFont(new Font("Tahoma",Font.BOLD,14));
         username.setBounds(160,86,92,26);
         content.add(username);
         
         JLabel names=new JLabel("Name: ");
         names.setForeground(Color.BLACK);
         names.setFont(new Font("Tahoma",Font.BOLD,14));
         names.setBounds(160,123,92,26);
         content.add(names);
         
         JLabel passw=new JLabel("Password: ");
         passw.setForeground(Color.BLACK);
         passw.setFont(new Font("Tahoma",Font.BOLD,14));
         passw.setBounds(160,160,92,26);
         content.add(passw);
         
         userid=new JTextField();
         userid.setBounds(250,91,148,20);
         content.add(userid);
         
         name=new JTextField();
         name.setBounds(250,128,148,20);
         content.add(name);
         
         pass=new JTextField();
         pass.setBounds(250,165,148,20);
         content.add(pass);
         
         create=new JButton("Create");
         create.setBackground(Color.RED);
         create.setForeground(Color.WHITE);
         create.setFont(new Font("Tahoma",Font.BOLD,17));
         create.setBounds(150,220,100,30);
         create.addActionListener(this);
         content.add(create);
         
         back=new JButton("Back");
         back.setBackground(Color.RED);
         back.setForeground(Color.WHITE);
         back.setFont(new Font("Tahoma",Font.BOLD,17));
         back.setBounds(350,220,100,30);
         back.addActionListener(this);
         content.add(back);
         
         JPanel forBorder=new JPanel();
         forBorder.setForeground(Color.green);
         forBorder.setBorder(new TitledBorder(new LineBorder(Color.RED,2),"Sign Up",TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
         forBorder.setBounds(60,36,476,296);
         forBorder.setBackground(Color.LIGHT_GRAY);
         content.add(forBorder);     
    }
    
    @Override
    public void actionPerformed(ActionEvent a){
        try{
            Connecting connect=new Connecting();
            if(a.getSource()==create){
                String tobeexecuted="insert into account(username,name,password) values(?,?,?)";
                PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
                st.setString(1,userid.getText());
                st.setString(2,name.getText());
                st.setString(3,pass.getText());
                
                int check=st.executeUpdate();
                if(check>0){
                    JOptionPane.showMessageDialog(null,"Account Created Successfully");
                }
                userid.setText("");
                pass.setText("");
                name.setText("");  
            }
            if(a.getSource()==back){
                this.setVisible(false);
                new UserLogin().setVisible(true);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new SignUp().setVisible(true);
    }
}
