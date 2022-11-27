package assignment01;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexz
 */
public class details extends JFrame implements ActionListener{
    JLabel label01, label02, label03;
    JTextField one , two, three, four, five, six, p1;
    JButton b1, b2;
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String s;
    public void assign(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/jassign01", "root", "");
            st = con.createStatement();
            s = "SELECT* FROM student_form";
            rs = st.executeQuery(s);
            ResultSetMetaData rsmt = rs.getMetaData();
            int c = rsmt.getColumnCount();
            Vector column = new Vector(c);
            for(int i=1; i<=c; i++){
                column.add(rsmt.getColumnName(i));
            }
            Vector data = new Vector();
            Vector row = new Vector();
            while(rs.next()){
                row = new Vector(c);
            
                for(int i=1; i<=c; i++){
                    row.add(rs.getString(i));
                }
                data.add(row);
                
            }
            
        setSize(700, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //creating first label
        label01 = new JLabel("Student Registration Form");
        label01.setBounds(200, 10, 400, 50);
        label01.setFont(new Font(Font.SERIF,Font.BOLD,20));
        //second label
        label02 = new JLabel("Student First Name");
        label02.setBounds(10, 70, 120, 20);
        //creating textfield
         one = new JTextField();
        one.setBounds(160, 70, 190, 22);
        //third label
        label03 = new JLabel("Student Last Name");
        label03.setBounds(10, 110, 120, 20);
        //creating textfield
        two = new JTextField();
        two.setBounds(160, 110, 190, 22);
        //another label
        JLabel label04 = new JLabel("Email Address");
        label04.setBounds(10, 160, 120, 20);
        //creating textfield
        three = new JTextField();
        three.setBounds(160, 160, 190, 22);
        //another label
        JLabel label05 = new JLabel("Confirm Email Address");
        label05.setBounds(10, 220, 140, 20);
        //creating textfield
        four = new JTextField();
        four.setBounds(160, 220, 190, 22);
        //another label
        JLabel label06 = new JLabel("Password");
        label06.setBounds(10, 280, 120, 20);
        //creating textfield
        five = new JTextField();
        five.setBounds(160, 280, 190, 22);
        //label seven
        JLabel label07 = new JLabel("Confirm Password");
        label07.setBounds(10, 340, 120, 20);
        //creating textfield
        six = new JTextField();
        six.setBounds(160, 340, 190, 22);
        //creating label
        JLabel label08 = new JLabel("Date of Birth");
        label08.setBounds(10, 380, 120, 20);
        //creating combobox
        String[]year={"Select Year","2000","2001","2002","2003","2005","2010","2012","2014","2017","2018","2019","2020","2021","2022"};
        JComboBox box1 = new JComboBox(year);
        box1.setBounds(160, 380, 100, 20);
        //creating combobox
        String[]month={"Select Month","January","February","March","April","May","June","July","Augest","September","October","November","December"};
        JComboBox box2 = new JComboBox(month);
        box2.setBounds(270, 380, 100, 20);
        //creating combobox
        String[]day={"Select Day","1","2","3","4","5","6","7","8","9","10","11","12","17","18","19","20","25","30"};
        JComboBox box3 = new JComboBox(day);
        box3.setBounds(380, 380, 100, 20);
        //creating label
        JLabel label09 = new JLabel("Gender");
        label09.setBounds(10, 430, 100, 20);
        //creating radiobutton
        ButtonGroup gender = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(160, 430, 70, 20);
        female.setBounds(270, 430, 70, 20);
        gender.add(male);
        gender.add(female);
        //creating label
        JLabel label10 = new JLabel("Department");
        label10.setBounds(10, 470, 100, 20);
        //creating radiobutton
        ButtonGroup department = new ButtonGroup();
        JRadioButton cmi = new JRadioButton("CMI");
        JRadioButton cs = new JRadioButton("Computer Science and Engineering");
        JRadioButton el = new JRadioButton("Electrical");
        JRadioButton ec = new JRadioButton("Electronics and Communications");
        JRadioButton mech = new JRadioButton("Mechanical");
        cmi.setBounds(160, 470, 250, 20);
        cs.setBounds(160, 510, 250, 20);
        el.setBounds(160, 550, 250, 20);
        ec.setBounds(160, 590, 250, 20);
        mech.setBounds(160, 630, 250, 20);
        department.add(cmi);
        department.add(cs);
        department.add(el);
        department.add(ec);
        department.add(mech);
        //creating buttons
        b1 = new JButton("Submit");
        b1.setBounds(160,690,100,20);
        b1.addActionListener(new ActionListener(){
            @Override
    public void actionPerformed(ActionEvent e) {
        p1.setText(one.getText()+" "+two.getText()+" "+three.getText());
        }
        });
        b2 = new JButton("Cancel");
        b2.setBounds(300, 690, 100, 20);
        b2.addActionListener(new ActionListener(){
            @Override
    public void actionPerformed(ActionEvent e) {
        p1.setText("");
        }
        });
        //creating jpanel
        p1 = new JTextField();
        p1.setBounds(500, 470, 150, 200);
        p1.setBackground(Color.white);
        
        
        
        
        //adding to frame
        add(label01);
        add(label02);
        add(one);
        add(label03);
        add(two);
        add(label04);
        add(three);
        add(label05);
        add(four);
        add(label06);
        add(five);
        add(label07);
        add(six);
        add(label08);
        add(box1);
        add(box2);
        add(box3);
        add(label09);
        add(male);
        add(female);
        add(label10);
        add(cmi);
        add(cs);
        add(el);
        add(ec);
        add(mech);
        add(b1);
        add(b2);
        add(p1);
        setVisible(true);
        }
    
            
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
         finally{
            try{
                st.close();
                rs.close();
                con.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "error");
                
            }
        }
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        p1.setText(one.getText()+" "+two.getText()+" "+three.getText());
////To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
