/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtabledb;
import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexz
 */
public class details extends JFrame{
    
    public void JTabledemo () {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/classdemodb","root","");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("Select * from classdemo");
            ResultSetMetaData data = rs.getMetaData();
            System.out.println(data.getColumnCount());
            Vector column = new Vector();
            for(int i = 0; i < data.getColumnCount(); i++){
                System.out.println(data.getColumnName(i).toString().toUpperCase());
            }
            Vector row;
            Vector records = new Vector();
            while(rs.next()){
                row = new Vector();
                for(int i=1; i<=data.getColumnCount();i++){
                    row.add(rs.getString(i));
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(details.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    setSize(900,900);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    
    String[] columnname = {"Name","Department","Rolling Number"};
    String[][] rows = {
        {"Emmanuel","Computer Science","0553314187"},
        {"Ahmed","Btech ICT","0552218695"},
        {"Zormelo","ICT","0203314158"},
    };
    
    JTable table = new JTable(rows,columnname);
    table.setBounds(30,30,700,200);
    JTextField field = new JTextField();
    field.setBounds(10,250,100,30);
    
    JScrollPane pane = new JScrollPane(table);
    pane.setBounds(30,30,700,200);
    table.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            field.setText(dtm.getValueAt(table.getSelectedRow(), 1).toString());
        }
});
    
    
    
    
    
    
    
    
    
    
    //adding
    add(pane);
    
    
    setVisible(true);
    
} 
    
}
