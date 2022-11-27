/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btechtest_0320080084;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class details extends JFrame {
    public Connection con;
    public Statement smt;
    
    
    public void dom(){
        setLayout(null);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/examples", "root", "");
            smt = con.createStatement();
            //ResultSet rs = smt.executeQuery("SELECT * FROM details");
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "couldn't connect to db");
        }
            JLabel usernameLabel = new JLabel("Username:");
            usernameLabel.setSize(100, 20);
            usernameLabel.setLocation(10,10);
            add(usernameLabel);
            
            JTextField usernameText = new JTextField();
            usernameText.setSize(250, 20);
            usernameText.setLocation(150,10);
            add(usernameText);
            
            JLabel password = new JLabel("Password:");
            password.setSize(100, 20);
            password.setLocation(10,40);
            add(password);
            
            JTextField passwordT = new JTextField();
            passwordT.setSize(250, 20);
            passwordT.setLocation(150,40);
            add(passwordT);
            
            JLabel gender = new JLabel("gender:");
            gender.setSize(100, 20);
            gender.setLocation(10,70);
            add(gender);
            
            ButtonGroup gen = new ButtonGroup();
            JRadioButton male = new JRadioButton("male");
            male.setSize(70,20);
            male.setLocation(110,70);
            add(male);
            
            JRadioButton female = new JRadioButton("female");
            female.setSize(70,20);
            female.setLocation(200,70);
            female.setSelected(true);
            add(female);
            gen.add(male);
            gen.add(female);
            
            JButton save = new JButton("Save");
            save.setSize(100,30);
            save.setLocation(150, 150);
            save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String gender;
                if(male.isSelected()==true){
                    gender ="male";
                }else{
                    gender = "female";
                }
            }
        });
            add(save);
            
            
            setVisible(true);
    }
    public void setSize(){
        super.setSize(700,500);
    }
    public void setTitle(){
        super.setTitle("Registration Form");
    }
    
}
