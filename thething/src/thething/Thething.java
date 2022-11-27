/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thething;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class Thething extends JFrame{
    Connection con;
    Statement st;
    //JRadioButton male ,female;
    
    
    public void main(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/examples","root", "");
            st = con.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't connect");
        }
    JLabel username = new JLabel("username:");
    username.setSize(100,20);
    username.setLocation(10,10);
    add(username);
    
    JTextField usernamet = new JTextField();
    usernamet.setSize(190,20);
    usernamet.setLocation(120,10);
    add(usernamet);
    
    JLabel password = new JLabel("password:");
    password.setSize(100,20);
    password.setLocation(10,40);
    add(password);
    
    JTextField passwordt = new JTextField();
    passwordt.setSize(190,20);
    passwordt.setLocation(120,40);
    add(passwordt);
    
    ButtonGroup gen = new ButtonGroup();
    JLabel gender = new JLabel("Gender:");
    gender.setSize(100,20);
    gender.setLocation(10,70);
    add(gender);
    
    JRadioButton male = new JRadioButton("male");
    male.setSize(100,20);
    male.setLocation(110,70);
    male.setSelected(true);
    add(male);
    
    
    JRadioButton female = new JRadioButton("female");
    female.setSize(150,20);
    female.setLocation(220,70);
    add(female);
    gen.add(male);
    gen.add(female);
    
    JButton save = new JButton("Save");
    save.setSize(100,30);
    save.setLocation(150,120);
    save.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           //To change body of generated methods, choose Tools | Templates.
            String gender = "l";
                if(male.isSelected()==true){
                    gender ="male";
                }else{
                    gender = "female";
                }

            String query = "INSERT INTO student (name, age ,gender) VALUES('"+usernamet.getText()+"','"+passwordt.getText()+"','"+gender+"')";
            try {
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Saved!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "couldn't insert");
            }
            
        }
    });
    add(save);
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thething dom = new Thething();
        dom.setSize(700,700);
        dom.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dom.setLayout(null);
        dom.setTitle("A Test Operation");
        dom.main();
        
        
        dom.setVisible(true);
    }
    
}
