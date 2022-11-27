/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smth;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author alexz
 */
public class Smth extends JFrame{
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement pst;
    
    public void lex(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/examples", "root", "");
            st = con.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "connection failed");
        }
        
        setLayout(null);  
        
        JLabel username = new JLabel("Username :");
        username.setSize(100,20);
        username.setLocation(10,10);
        add(username);
        
        JTextField usernameT = new JTextField();
        usernameT.setSize(190,20);
        usernameT.setLocation(110,10);
        add(usernameT);
        
        JLabel password = new JLabel("Password :");
        password.setSize(100,20);
        password.setLocation(10,50);
        add(password);
        
        JTextField passwordT = new JTextField();
        passwordT.setSize(190,20);
        passwordT.setLocation(110,50);
        add(passwordT);
        
        JLabel gender = new JLabel("Gender :");
        gender.setSize(100,20);
        gender.setLocation(10,90);
        add(gender);
        
        ButtonGroup gen = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        male.setSize(80,20);
        male.setLocation(110,90);
        male.setSelected(true);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setSize(80,20);
        female.setLocation(190,90);
        add(female);
        gen.add(male);
        gen.add(female);
        
        JButton save = new JButton("Save");
        save.setSize(70,30);
        save.setLocation(150,150);
        save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String gender;
            if(male.isSelected()==true){
                gender = "male";
            }else{
                gender ="female";
            }
            System.out.println("dom");
//            try{
//                String query = "INSERT INTO `details`(`name`, `password`, `gender`) VALUES('"+usernameT.getText()"','"+passwordT.getText()"','"+gender"') ";
//                pst = con.prepareStatement(query);
//            }catch{
//                JOptionPane.showMessageDialog(null, "wrong");
//            }
            
            
            }
        });
        add(save);
        
    }
    public void setTitle(){
        super.setTitle("RegistrationcForm");
    }
    public void setSizes(){
        super.setSize(700,500);
    }
    public static void main(String[] args){
        Smth test = new Smth();
        
        test.setSizes();
        test.setTitle();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.lex();
        test.setVisible(true);
        
        
//        try {
//            // TODO code application logic here
//            FileReader fr = new FileReader("out.txt");
//            BufferedReader br = new BufferedReader(fr);
//            String line = br.readLine();
//            System.out.println(line);
//            br.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Smth.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Smth.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    
    }
}
