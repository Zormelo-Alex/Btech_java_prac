/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalorganizer;
import java.util.Scanner;
/**
 *
 * @author alexz
 */
public class PersonalOrganizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dom= new Scanner(System.in);
        System.out.println("please enter your name");
        String name = dom.next();
        System.out.println("please enter yrear of birth");
        int year = dom.nextInt();
        System.out.println("please enter address");
        String address = dom.next();
        System.out.println("please enter telephone number");
        String phone = dom.next();
        int cyear = 2021;
        int age = cyear-year;
        System.out.println("full name: "+name+
                " address: "+address+
                " contact: "+phone);
        System.out.println("age: "+age);
    }
    
}
