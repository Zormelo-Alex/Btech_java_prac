/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_0320080084;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexz
 */
public class details extends JFrame implements ActionListener{
    JLabel label1, id, name, age, temp, bp;
    JTextField one, two, three, four, five;
    JButton idmake, cancel, save, update, delete, get, create_file, create_db_file;
    JTable t1;
    JPanel panel;
    JScrollPane pane;
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String s;
    PreparedStatement pst = null;
    int random = (int) (Math.random()*100000);
    
    public void exam(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root","");
            st = con.createStatement();
            s = "SELECT* FROM patients_record";
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
                for(int i =1; i<=c; i++){
                    row.add(rs.getString(i));
                }
                data.add(row);
            }
            
            //frame
        setSize(900,750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        //creating label
        label1 = new JLabel("Patient's Record");
        label1.setBounds(150, 10, 200, 30);
        label1.setFont(new Font(Font.SERIF,Font.BOLD,20));
        //id label
        id = new JLabel("Id");
        id.setBounds(30, 45, 50, 30);
        //id textfield
        one = new JTextField();
        one.setBounds(250, 50, 250, 30);
        //idmake button
        idmake = new JButton("idmake");
        idmake.setBounds(520, 50, 90, 30);
        idmake.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                one.setText("PID"+random);
            }
        });
        //name label
        name = new JLabel("Enter Patient's Name");
        name.setBounds(30, 85, 150, 30);
        //name textfield
        two = new JTextField();
        two.setBounds(250, 90, 370, 30);
        //age label
        age = new JLabel("Age");
        age.setBounds(30, 125, 150, 30);
        //age textfield
        three = new JTextField();
        three.setBounds(250, 130, 370, 30);
        //temp label
        temp = new JLabel("Enter Patient's Temperature");
        temp.setBounds(30, 165, 170, 30);
        //temp textfield
        four = new JTextField();
        four.setBounds(250, 170, 370, 30);
        //bp label
        bp = new JLabel("Enter Patients BP");
        bp.setBounds(30, 205, 150, 30);
        //bp textfield
        five = new JTextField();
        five.setBounds(250, 210, 370, 30);
        //creating buttons
        cancel = new JButton("cancel");
        cancel.setBounds(70, 280, 90, 30);
        cancel.addActionListener(new ActionListener(){
            @Override
    public void actionPerformed(ActionEvent e) {
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
    }
        });
        save = new JButton("Save");
        save.setBounds(190, 280, 90, 30);
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //five.setText(one.getText()+two.getText()+three.getText()+four.getText()+five.getText());
                try{
                    String query = "INSERT INTO `patients_record` (`id`, `p_name`, `age`, `p_temp`, `p_bp`) VALUES(?,?,?,?,?)";
                    con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "");
                    pst = con.prepareStatement(query);
                    pst.setString(1, one.getText());
                    pst.setString(2, two.getText());
                    pst.setString(3, three.getText());
                    pst.setString(4, four.getText());
                    pst.setString(5, five.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Saved!");
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
    }
            
        });
        create_file = new JButton("Save To File");
        create_file.setBounds(520,280,160,30);
        create_file.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    FileOutputStream filestream;
                    try {
                        String out = two.getText();
                        filestream = new FileOutputStream("records/"+out+".txt");
                        PrintWriter writer = new PrintWriter(filestream);
                        writer.print("Patient ID: "+one.getText()+"\n");
                        writer.print("Patient Name: "+two.getText()+"\n");
                        writer.print("Age: "+three.getText()+"\n");
                        writer.print("Patient Temperature: "+four.getText()+"\n");
                        writer.print("Blood Pressure: "+five.getText()+"\n");
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Saved To File");
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "error saving to file");
                    }
                    
                }
            });
        
        create_db_file = new JButton("Save Database");
        create_db_file.setBounds(700,280,160,30);
        create_db_file.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    FileOutputStream filestream;
                    try {
                        //String out = two.getText();
                        //File file = new File("L:\\HTU BTECH.ICT\\L100\\sem2\\Object oriented programing\\Lab\\exam_0320080084\\records\\"+out);
//                        FileReader fr = new FileReader("records/"+out+".txt");
//                        BufferedReader br = new BufferedReader(fr);
//                        String line = br.readLine();
//                        three.setText(line);
//                        br.close();
                        filestream = new FileOutputStream("database/"+"data.txt");
                        PrintWriter writer = new PrintWriter(filestream);
                        for(int i=0;i<11;i++){
                            writer.print("Patient "+i+data.get(i)+"\n");
                        }
                        writer.print(column+"\n");
                        
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Saved To File");
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "error");
                    } catch (IOException ex) {
                        Logger.getLogger(details.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            });
        update = new JButton("Update");
        update.setBounds(410, 280, 90, 30);
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String query = "UPDATE `patients_record` SET `id`=?,`p_name`=?,`age`=?,`p_temp`=?,`p_bp`=? WHERE id LIKE ?";
                    con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "");
                    pst = con.prepareStatement(query);
                    pst.setString(1, one.getText());
                    pst.setString(2, two.getText());
                    pst.setString(3, three.getText());
                    pst.setString(4, four.getText());
                    pst.setString(5, five.getText());
                    pst.setString(6, one.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated!");
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
        delete = new JButton("Delete");
        delete.setBounds(300, 280, 90, 30);
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String query = "DELETE FROM `patients_record` WHERE id LIKE ?";
                    con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "");
                    pst = con.prepareStatement(query);
                    pst.setString(1, one.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Row Deleted Successfully!");
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
        
        //making Jtable
        panel = new JPanel();
        panel.setBounds(10,330,700,400);
        
        t1 = new JTable(data,column); 
        pane = new JScrollPane(t1);
        pane.setBounds(30,330,800,200);
        
        panel.setLayout(new BorderLayout());
        panel.add(pane,BorderLayout.CENTER);
        t1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            DefaultTableModel dtm = (DefaultTableModel) t1.getModel();
            one.setText(dtm.getValueAt(t1.getSelectedRow(), 0).toString());
            two.setText(dtm.getValueAt(t1.getSelectedRow(), 1).toString());
            three.setText(dtm.getValueAt(t1.getSelectedRow(), 2).toString());
            four.setText(dtm.getValueAt(t1.getSelectedRow(), 3).toString());
            five.setText(dtm.getValueAt(t1.getSelectedRow(), 4).toString());
            
        }
});
        
        
        
        
        
        
        //adding to frame
        add(label1);
        add(id);
        add(one);
        add(idmake);
        add(name);
        add(two);
        add(age);
        add(temp);
        add(bp);
        add(three);
        add(four);
        add(five);
        add(cancel);
        add(save);
        add(update);
        add(delete);
        add(pane);
        add(panel);
        add(create_file);
        add(create_db_file);
        setVisible(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
