/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

/**
 *
 * @author alexz
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class other  extends javax.swing.JFrame {


    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    String s;
    ResultSetMetaData rsmt;
   
    
    
    ImageIcon image,imaged;
   JLabel formTitle,fname,lname,emailaddress,confirmEmailaddress,password,confirmPassword,dateofbirth,gender,department,imagelabel;
   JTextField fnamebox,lnamebox,emailaddressBox,confirmEmailaddressBox,passwordBox,confirmPasswordBox,box;
   JComboBox dateofbirthDropboxYear,dateofbirthDropboxMonth,dateofbirthDropboxDay; 
   JRadioButton gendermale,genderfemale,departmentCMI,departmentComputerScience,departmentElectrical,departmentElectronics,departmentMechanical;
   ButtonGroup gendergroup,departmentgroup;
   JButton submit,cancel,upload;
   JFrame frame;
   
 public void form() throws IOException{
    frame = new JFrame("Student form");
    frame.setSize(1300,700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    
    formTitle = new JLabel();
    formTitle.setFont(new Font(Font.SERIF, Font.BOLD,20));
    formTitle.setText("Student Registration Form");
    formTitle.setSize(400,20);
    formTitle.setLocation(350,10);
    frame.add(formTitle);
    
    fname = new JLabel();
    fname.setFont(new Font(Font.SERIF, Font.BOLD,15));
    fname.setText("Student First Name");
    fname.setBounds(10,40,200,20);
    frame.add(fname);
    
    fnamebox = new JTextField();
    fnamebox.setBounds(200,40,150,20);
    frame.add(fnamebox);
    
    lname = new JLabel();
    lname.setFont(new Font(Font.SERIF, Font.BOLD,15));
    lname.setText("Student Last Name");
    lname.setBounds(10,80,200,20);
    frame.add(lname);
    
    lnamebox = new JTextField();
    lnamebox.setBounds(200,80,150,20);
    frame.add(lnamebox);
    
    emailaddress = new JLabel();
    emailaddress.setFont(new Font(Font.SERIF, Font.BOLD,15));
    emailaddress.setText("Email Address");
    emailaddress.setBounds(10,120,200,20);
    frame.add(emailaddress);
    
    emailaddressBox = new JTextField();
    emailaddressBox.setBounds(200,120,150,20);
    frame.add(emailaddressBox);
    
    confirmEmailaddress = new JLabel();
    confirmEmailaddress.setFont(new Font(Font.SERIF, Font.BOLD,15));
    confirmEmailaddress.setText("Confirm Email Address");
    confirmEmailaddress.setBounds(10,160,200,20);
    frame.add(confirmEmailaddress);
    
    confirmEmailaddressBox = new JTextField();
    confirmEmailaddressBox.setBounds(200,160,150,20);
    frame.add(confirmEmailaddressBox);
    
    password = new JLabel();
    password.setFont(new Font(Font.SERIF, Font.BOLD,15));
    password.setText("Password");
    password.setBounds(10,200,200,20);
    frame.add(password);
    
    passwordBox = new JTextField();
    passwordBox.setBounds(200,200,150,20);
    frame.add(passwordBox);
    
    confirmPassword = new JLabel();
    confirmPassword.setFont(new Font(Font.SERIF, Font.BOLD,15));
    confirmPassword.setText("Confirm Password");
    confirmPassword.setBounds(10,240,200,20);
    frame.add(confirmPassword);
    
    confirmPasswordBox = new JTextField();
    confirmPasswordBox.setBounds(200,240,150,20);
    frame.add(confirmPasswordBox);
    
    dateofbirth = new JLabel();
    dateofbirth.setFont(new Font(Font.SERIF, Font.BOLD,15));
    dateofbirth.setText("Date Of Birth");
    dateofbirth.setBounds(10,280,200,20);
    frame.add(dateofbirth);
     
    
    dateofbirthDropboxYear = new JComboBox();
    for(int i=1960; i<=2022; i++){
        dateofbirthDropboxYear.addItem(i);
    };
    dateofbirthDropboxYear.setBounds(150,280,100,20);
    frame.add(dateofbirthDropboxYear);
    
    dateofbirthDropboxMonth = new JComboBox();
    for(int j=1; j<=12; j++){
        dateofbirthDropboxMonth.addItem(j);
    };
    dateofbirthDropboxMonth.setBounds(300,280,100,20);
    frame.add(dateofbirthDropboxMonth);
    
    dateofbirthDropboxDay = new JComboBox();
    for(int k=1; k<=31; k++){
        dateofbirthDropboxDay.addItem(k);
    };
    dateofbirthDropboxDay.setBounds(450,280,100,20);
    frame.add(dateofbirthDropboxDay);
    
    gender = new JLabel();
    gender.setFont(new Font(Font.SERIF, Font.BOLD,15));
    gender.setText("Gender");
    gender.setBounds(10,320,200,20);
    frame.add(gender);
    
    gendermale = new JRadioButton("Male");
    gendermale.setText("Male");
    gendermale.setActionCommand("Male");
    
    gendermale.setBounds(210,320,100,20);
    frame.add(gendermale);
    
    
    genderfemale = new JRadioButton("Female");
    genderfemale.setText("Female");
    genderfemale.setActionCommand("Female");
    genderfemale.setBounds(330,320,100,20);
   
     
   frame.add(genderfemale);
    
    gendergroup = new ButtonGroup();
    gendergroup.add(gendermale);
    gendergroup.add(genderfemale);
    
    department = new JLabel();
    department.setFont(new Font(Font.SERIF, Font.BOLD,15));
    department.setText("Department");
    department.setBounds(10,360,200,20);
    frame.add(department);
    
    departmentCMI = new JRadioButton("CMI");
    departmentCMI.setText("CMI");
    departmentCMI.setActionCommand("CMI");
    departmentCMI.setBounds(210,360,300,20);
    frame.add(departmentCMI);
    
    
    
    departmentComputerScience = new JRadioButton("Computer Science and Engineering");
    departmentComputerScience.setText("Computer Science and Engineering");
    departmentComputerScience.setActionCommand("cse");
    departmentComputerScience.setBounds(210,380,300,20);
    frame.add(departmentComputerScience);
    
    departmentElectrical = new JRadioButton("Electrical");
    departmentElectrical.setText("Electrical");
    departmentElectrical.setActionCommand("elec");
    departmentElectrical.setBounds(210,400,300,20);
    frame.add(departmentElectrical);
    
    departmentElectronics = new JRadioButton("Electronics and Communication");
    departmentElectronics.setText("Electronics and Communication");
    departmentElectronics.setActionCommand("elec_n_comm");
    departmentElectronics.setBounds(210,420,300,20);
    frame.add(departmentElectronics);
    
    departmentMechanical = new JRadioButton("Mechanical");
    departmentMechanical.setText("Mechanical");
    departmentMechanical.setActionCommand("mech");
    departmentMechanical.setBounds(210,440,300,20);
    frame.add(departmentMechanical);
    
    departmentgroup = new ButtonGroup();
    departmentgroup.add(departmentCMI);
    departmentgroup.add(departmentComputerScience);
    departmentgroup.add(departmentElectrical);
    departmentgroup.add(departmentElectronics);
    departmentgroup.add(departmentMechanical);
    
  
    
    
    
    submit = new JButton();
    submit.setText("Submit");
    submit.setBounds(210,480,100,20);
    submit.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
try{
             String query = "INSERT INTO `student_form`(`fname`, `lname`, `email`, `dob`, `password`, `gender`, `department`, `image`) VALUES ('"+fnamebox.getText()+"', '"+lnamebox.getText()+"', '"+emailaddressBox.getText()+"', '"+dateofbirthDropboxYear.getSelectedItem()+"-"+dateofbirthDropboxMonth.getSelectedItem()+"-"+dateofbirthDropboxDay.getSelectedItem()+"', '"+passwordBox.getText()+"', '"+gendergroup.getSelection().getActionCommand()+"', '"+departmentgroup.getSelection().getActionCommand()+"', '"+imagelabel.getIcon()+"')";
             con = DriverManager.getConnection("jdbc:mysql://localhost/jassign01", "root", "");
             pst=con.prepareStatement(query);
//             pst.setString(1, fnamebox.getText());
//             pst.setString(2, lnamebox.getText());
//             pst.setString(3, emailaddressBox.getText());
//             pst.setString(4, date.getText());
//             pst.setString(5, passwordBox.getText());
//             pst.setString(6, gendergroup.getSelection().getActionCommand());
//             pst.setString(7, departmentgroup.getSelection().getActionCommand());
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Succesfully Submitted");
             
            
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
         }        }
    });
    frame.add(submit);
    
    cancel = new JButton();
    cancel.setText("Cancel");
    cancel.setBounds(350,480,100,20);
    cancel.addActionListener((event) -> System.exit(0));
    frame.add(cancel);    
    
//   box = new JTextField();
//   box.setBounds(520,360,250,190);
//   box.setBackground(Color.white);
//   frame.add(box);
  
//    upload = new JButton();
//    upload.setText("Upload img");
//    upload.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);

image = new ImageIcon("tt.jpg");

imagelabel =new JLabel();
imagelabel.setBounds(400, 50, 350, 200);
frame.add(imagelabel);


    

//String im = ""+choose.getSelectedFile().getName();
//
//        System.out.println(im);




JButton load = new JButton();
load.setText("Upload Image");
load.setBounds(600,280,100,20); 
load.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
      JFileChooser choose = new JFileChooser();
      choose.showOpenDialog(null);
      File selectedfile = choose.getSelectedFile();
      String filename = selectedfile.getAbsolutePath();
      image = new ImageIcon(filename);
      Image img = image.getImage().getScaledInstance(imagelabel.getWidth(), imagelabel.getHeight(), Image.SCALE_SMOOTH);
      imagelabel.setIcon(image);
        }
    });
frame.add(load);
//load.addActionListener(new ActionListener() {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//       imagelabel.setIcon(image);
//        }
//    });

       try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/jassign01", "root","");
            st = con.createStatement();
            s = "SELECT * FROM student_form";
            rs = st.executeQuery(s);
            ResultSetMetaData rsmt = rs.getMetaData();
            int c = rsmt.getColumnCount();
            Vector column = new Vector(c);
            for(int i=1;i<=c;i++){
                column.add(rsmt.getColumnName(i));
            }
            Vector data = new Vector();
            Vector row = new Vector();
            
            while(rs.next())
            {
                row = new Vector(c);
                for(int i =1; i<=c; i++){
                    row.add(rs.getString(i));
                }
                data.add(row);
            }
            JPanel panel = new JPanel();
            panel.setBounds(550,320,600,250);
            JTable table = new JTable(data, column);
             table.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                fnamebox.setText(dtm.getValueAt(table.getSelectedRow(), 1).toString());
                lnamebox.setText(dtm.getValueAt(table.getSelectedRow(), 2).toString());
                emailaddressBox.setText(dtm.getValueAt(table.getSelectedRow(), 4).toString());
                confirmEmailaddressBox.setText(dtm.getValueAt(table.getSelectedRow(), 4).toString());
                confirmPasswordBox.setText(dtm.getValueAt(table.getSelectedRow(), 5).toString());
                passwordBox.setText(dtm.getValueAt(table.getSelectedRow(), 5).toString());
                imagelabel.setIcon(image);
                }
            });
            JScrollPane pane = new JScrollPane(table);
            pane.setBounds(550, 320, 600, 250);
            frame.add(panel);
            panel.setLayout(new BorderLayout());
            panel.add(pane,BorderLayout.CENTER);
         
   frame.setVisible(true);
    }catch(Exception x){
    JOptionPane.showMessageDialog(null, "ERROR");
}finally{
        try{
            st.close();
        rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR CLOSE"); 
        }


//    @Override
//      public void actionPerformed(ActionEvent e) {
//      if(e.getSource()==fnamebox && e.getSource()==lnamebox){
//          box.setText(fnamebox.getText()+" "+lnamebox.getText()); 
//      }
//    }

      
    }}}


    