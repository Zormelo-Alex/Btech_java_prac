/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v.bank;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome To V Bank");
        System.out.println("A bank you can trust");
        System.out.println("Press 1 to create new account");
        System.out.println("Press 2 to login to already existing account");
        System.out.println("Press 0 to exit");
        Scanner dom = new Scanner(System.in);
        int num;
        num = dom.nextInt();
        if(num==1){
            System.out.println("Enter first name");
            String fname = dom.next();
            System.out.println("Enter last name");
            String lname = dom.next();
            System.out.println("Enter your legal age "+ fname +' '+ lname);
            int age = dom.nextInt();
            if(age < 18){
                System.out.println("Sorry, you are not eligible");
                System.out.println("we'll be expecting you once you turn 18!");
            }else{
                System.out.println("Enter nationality");
                String nation = dom.next();
                System.out.println("Enter ID type");
               
        System.out.println("Press 1 for Voter ID ");
        System.out.println("Press 2 for National Health Insurance");
        System.out.println("Press 3 for National ID");
        System.out.println("Press 4 for other");
                int Id = dom.nextInt();
                System.out.println("Enter ID number");
                String id = dom.next();
               System.out.println("Enter gender");
                System.out.println("Gender. Press (1) if male . and (2) if female");
                int gender;
                gender = dom.nextInt();
                if(gender == 1){
                    System.out.println("Please wait your accout information is being processed...");
                    System.out.println("Name: Mr."+fname+" "+lname);
                    System.out.println("Age: "+age);
                    System.out.println("Nationality: "+nation);
                    System.out.println("ID number: "+id);
                    System.out.println("Account number: "+ 000225436);
                }else if(gender==2){
                    System.out.println("Please wait your accout information is being processed...");
                    System.out.println("Name: Mrs."+fname+" "+lname);
                    System.out.println("Age: "+age);
                    System.out.println("Nationality: "+nation);
                    System.out.println("ID number: "+id);
                    System.out.println("Account number: "+ 2092205438);
                }else{
                    System.out.println("Your choice was incorrect!");
                }
                
            }
        }else if(num==2){
            System.out.println("Enter account number");
            int an =dom.nextInt();
            System.out.println("Enter pin");
            int pin=dom.nextInt();
            System.out.println("Welcome to VBANK");
            System.out.println("your account balance is 0.000");
           
        }else{
            System.out.println("FUCK YOU VERY MUCH!!!");
        }
        
    }
    
}
