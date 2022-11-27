/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zormeloalex_0320080084;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexz
 */
public class ZormeloAlex_0320080084 extends JFrame{
    public Connection con;
    public Statement st;
    ResultSet rs = null;
    public Vector data, row, column;
    String query;

    /**
     * @param args the command line arguments
     */
    public void Exams_Btech(){
        
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/workerdb", "root","");
                st = con.createStatement();
                
                String genderset = "Male";
        
        //making the JFrame
        setLayout(null);
        
        //creating first label
        JLabel title = new JLabel("Workers Registration Form");
        title.setSize(500,50);
        title.setLocation(200,30);
        title.setFont(new Font(Font.SERIF,Font.BOLD,35));
        add(title);
        
        //creating other labels
        JLabel name = new JLabel("Name:");
        name.setSize(100,30);
        name.setLocation(30,100);
        name.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(name);
        
        JLabel Idlabel = new JLabel("Id:");
        Idlabel.setSize(100,30);
        Idlabel.setLocation(30,150);
        Idlabel.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(Idlabel);
        
        JLabel basic = new JLabel("Basic:");
        basic.setSize(100,30);
        basic.setLocation(30,200);
        basic.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(basic);
        
        JLabel over = new JLabel("Over:");
        over.setSize(100,30);
        over.setLocation(30,250);
        over.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(over);
        
        JLabel deduct = new JLabel("Deduct:");
        deduct.setSize(100,30);
        deduct.setLocation(30,300);
        deduct.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(deduct);
        
        JLabel net = new JLabel("Net:");
        net.setSize(100,30);
        net.setLocation(30,350);
        net.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(net);
        
        JLabel gender = new JLabel("Gender:");
        gender.setSize(100,30);
        gender.setLocation(30,400);
        gender.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(gender);
        
        //creating textfields
        JTextField namet = new JTextField("Enter The Name of Person");
        namet.setSize(400,40);
        namet.setLocation(140,100);
        namet.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(namet);
        
        JTextField Idtext = new JTextField("Enter Staff ID");
        Idtext.setSize(400,40);
        Idtext.setLocation(140,150);
        Idtext.setFont(new Font(Font.SERIF,Font.BOLD,25));
        Idtext.setEditable(false);
        add(Idtext);
        
        JTextField basict = new JTextField("Enter Basic Salary");
        basict.setSize(400,40);
        basict.setLocation(140,200);
        basict.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(basict);
        
        JTextField overt = new JTextField("Enter Over Time Salary");
        overt.setSize(400,40);
        overt.setLocation(140,250);
        overt.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(overt);
        
        JTextField deductt = new JTextField("Enter Monthly Deduction");
        deductt.setSize(400,40);
        deductt.setLocation(140,300);
        deductt.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(deductt);
        
        JTextField nettext = new JTextField("Generate monthly take home");
        nettext.setSize(400,40);
        nettext.setLocation(140,350);
        nettext.setFont(new Font(Font.SERIF,Font.BOLD,25));
        nettext.setEditable(false);
        add(nettext);
        
        //creating radiobuttons
        ButtonGroup gen = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        male.setSize(200,30);
        male.setLocation(140,400);
        male.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setSize(200,30);
        female.setLocation(350,400);
        female.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(female);
        gen.add(male);
        gen.add(female);
        
        //creating buttons
        JButton generate = new JButton("Generate");
        generate.setSize(200,40);
        generate.setLocation(550,350);
        generate.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(generate);
        
        JButton idmaker = new JButton("Id Maker");
        idmaker.setSize(150,40);
        idmaker.setLocation(30,440);
        idmaker.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(idmaker);
        
        JButton save = new JButton("Save");
        save.setSize(200,40);
        save.setLocation(30,490);
        save.setFont(new Font(Font.SERIF,Font.BOLD,25));
        save.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String q = "INSERT INTO worker_table (id, name, gender, overtime, basic, deduction, take_home) VALUES('"+Idtext.getText()+"','"+namet.getText()+"','"+gender.getText()+"','"+overt.getText()+"','"+basict+"','"+deductt+"','"+nettext+"')";
                        try {
                            st.executeUpdate(q);
                            JOptionPane.showMessageDialog(null, "saved");
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "couldnt send");
                        }
                    }
                });
        add(save);
        
        JButton reset = new JButton("Reset");
        reset.setSize(200,40);
        reset.setLocation(240,490);
        reset.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(reset);
        
        JButton delete = new JButton("Delete");
        delete.setSize(200,40);
        delete.setLocation(450,490);
        delete.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(delete);
        
        JButton update = new JButton("Update");
        update.setSize(200,40);
        update.setLocation(670,490);
        update.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(update);
        
        JButton saveto = new JButton("Save To File");
        saveto.setSize(200,40);
        saveto.setLocation(890,490);
        saveto.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(saveto);
        
        JButton fillfile = new JButton("Fill File");
        fillfile.setSize(200,40);
        fillfile.setLocation(1100,490);
        fillfile.setFont(new Font(Font.SERIF,Font.BOLD,25));
        add(fillfile);
        
            //making Jtable
//      try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost/workerdb", "root","");
//            st = con.createStatement();

//            JPanel panel = new JPanel();
//            panel.setSize(1000,2000);
//            panel.setLocation(30,520);
//            JTable table = new JTable(data, column);
//             table.addMouseListener(new MouseAdapter() {
//
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                //DefaultTableModel dtm = (DefaultTableModel) table.getModel();
////                fnamebox.setText(dtm.getValueAt(table.getSelectedRow(), 1).toString());
////                lnamebox.setText(dtm.getValueAt(table.getSelectedRow(), 2).toString());
////                emailaddressBox.setText(dtm.getValueAt(table.getSelectedRow(), 4).toString());
////                confirmEmailaddressBox.setText(dtm.getValueAt(table.getSelectedRow(), 4).toString());
////                confirmPasswordBox.setText(dtm.getValueAt(table.getSelectedRow(), 5).toString());
////                passwordBox.setText(dtm.getValueAt(table.getSelectedRow(), 5).toString());
//                }
//            });
//            JScrollPane pane = new JScrollPane(table);
//            pane.setSize(1000,2000);
//            pane.setLocation(30, 520);
//            add(panel);
//            panel.setLayout(new BorderLayout());
//            panel.add(pane,BorderLayout.CENTER);
//         
//    }catch(Exception x){
//    JOptionPane.showMessageDialog(null, "ERROR cant fetch results");
//}
         

        
        
        
        
        
        
        setVisible(true);
          } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "couldnt");
            }
        
    }
    public void connectjtable(){
        //           String s = "SELECT * FROM worker_tabel";
//            rs = st.executeQuery(s);
//            ResultSetMetaData rsmt = rs.getMetaData();
//            int c = rsmt.getColumnCount();
//            Vector column = new Vector(c);
//            for(int i=1;i<=c;i++){
//                column.add(rsmt.getColumnName(i));
//            }
//            Vector data = new Vector();
//            Vector row = new Vector();
//            
//            while(rs.next())
//            {
//                row = new Vector(c);
//                for(int i =1; i<=c; i++){
//                    row.add(rs.getString(i));
//                }
//                data.add(row);
//            }
        
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        ZormeloAlex_0320080084 exam = new ZormeloAlex_0320080084();
        exam.setSize(1400,700);
        exam.setDefaultCloseOperation(EXIT_ON_CLOSE);
        exam.connectjtable();
        exam.Exams_Btech();
    }
    
}
