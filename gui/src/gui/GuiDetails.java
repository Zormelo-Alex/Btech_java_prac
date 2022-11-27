/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author alexz
 */
public class GuiDetails extends JFrame{
    public static void guis(){
         JFrame frame = new JFrame("student form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // making a label object
        JLabel label = new JLabel("Student form registration");
        label.setSize(300,50);
        label.setFont(new Font(Font.SERIF,Font.BOLD,25));
        label.setLocation(10, 5);
        // making another label object
        JLabel dom = new JLabel("Lexiboi");
        dom.setSize(300,50);
        dom.setText("First name :");
        dom.setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
        dom.setLocation(10, 40);
        // making a jtextfield object
        JTextField field = new JTextField("Enter first name");
        field.setSize(300,20);
        field.setLocation(125,59);
       //making a new JLabel
        JLabel last = new JLabel("Last Name");
        last.setSize(150, 50);
        last.setText("Last Name : ");
        last.setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
        last.setLocation(10, 80);
        //new field
        JTextField field2 = new JTextField("Enter last name");
        field2.setSize(300,20);
        field2.setLocation(125,99);
        //making a new JLabel
        JLabel gender = new JLabel("gender");
        gender.setSize(150, 50);
        gender.setText("Gender : ");
        gender.setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
        gender.setLocation(10, 120);
        //button group
        ButtonGroup gen = new ButtonGroup();
        //new Radiobutton
        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");
        male.setSize(70,20);
        male.setLocation(105,140);
        female.setSize(70,20);
        female.setLocation(175,140);
        gen.add(male);
        gen.add(female);
        //making a new JLabel
        JLabel program = new JLabel("Program");
        program.setSize(150, 50);
        program.setText("Program : ");
        program.setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
        program.setLocation(10, 160);
        //new field
        String[]program_list ={"BtechICT","ComSCI"};
        JComboBox box2 = new JComboBox(program_list);
        box2.setSize(90,20);
        box2.setLocation(105,180);
        //creating new label
        JLabel department_label = new JLabel("department");
        department_label.setLocation(10, 200);
        department_label.setText("Department : ");
        department_label.setSize(150, 50);
        //creating jcombox
        JComboBox department = new JComboBox();
        department.setSize(130, 20);
        department.setLocation(115,215);
        department.addItem("Computer Science");
        department.addItem("Agriculture");
        department.addItem("Food Technology");
        department.addItem("Engineering");
        //creating buttons
        JButton save = new JButton();
        save.setText("save");
        save.setSize(70,20);
        save.setLocation(40, 265);
        
        JButton cancel = new JButton();
        cancel.setText("cancel");
        cancel.setSize(90,20);
        cancel.setLocation(150, 265);
        
        //adding them to te frame
        frame.add(field);
        frame.add(field2);
        frame.add(male);
        frame.add(save);
        frame.add(cancel);
        frame.add(female);
        frame.add(box2);
        frame.add(department_label);
        frame.add(department);
        frame.add(program);
        frame.add(gender);
        frame.add(dom);
        frame.add(label);
        frame.add(last);
        frame.setVisible(true);
    }
    
}
