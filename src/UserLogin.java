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
import java.awt.event.*;  //for action listener
import java.sql.*;
public class UserLogin extends JFrame implements ActionListener{
    private JPanel p;
    private JTextField id;
    private JPasswordField pass;
    private JButton login,signup;
    
    public UserLogin(){
        setLayout(null); //not using predefined layouts
       // setBackground(Color.BLACK);
        setBounds(300,150,600,400);
        
        p=new JPanel();
        p.setBackground(Color.BLACK);
        setContentPane(p); //covering the whole frame
        p.setLayout(null);
        
        JLabel one=new JLabel("User Id: ");
        one.setForeground(Color.white);
        one.setFont(new Font("Tahoma",Font.BOLD,16));
        one.setBounds(124,89,95,24);
        p.add(one);
        
        JLabel two=new JLabel("Password: ");
        two.setForeground(Color.white);
        two.setFont(new Font("Tahoma",Font.BOLD,16));
        two.setBounds(124,124,95,24);
        p.add(two);
        
        id=new JTextField();
        id.setBounds(230,93,157,20);
        p.add(id);
        
        pass=new JPasswordField();
        pass.setBounds(230,128,157,20);
        p.add(pass);
        
        login=new JButton("Login");
        login.addActionListener(this);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Tahoma",Font.BOLD,16));
        login.setBackground(Color.RED);
        login.setBounds(230,181,113,39);
        p.add(login);
        
        JLabel three=new JLabel("Don't have an Account?");
        three.setForeground(Color.white);
        three.setFont(new Font("Tahoma",Font.BOLD,10));
        three.setBounds(230,250,120,39);
        p.add(three);
        
        signup=new JButton("Sign Up");
        signup.addActionListener(this);
        signup.setForeground(Color.WHITE);
        signup.setBackground(Color.RED);
        signup.setFont(new Font("Tahoma",Font.BOLD,16));
        signup.setBounds(230,280,113,39);
        p.add(signup);
        
    }
    @Override
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==login){
            //Boolean status=false;
            try{
                Connecting connect=new Connecting();
                String tobeexecuted="Select * from account where username=? and password=?";
                PreparedStatement st=connect.c.prepareStatement(tobeexecuted);
                st.setString(1,id.getText());
                st.setString(2,pass.getText());
                
                ResultSet r=st.executeQuery(); //resultset runs line by line in table until found
                if(r.next()){
                    this.setVisible(false);
                    new Home().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid User ID Or Password");
                    
                }
            }
            catch(Exception e2){
                System.out.println(e2);
            }
        }
        if(a.getSource()==signup){
            setVisible(false);
            new SignUp().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new UserLogin().setVisible(true);
    }
            
    
}
