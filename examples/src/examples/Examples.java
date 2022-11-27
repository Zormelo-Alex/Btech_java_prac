/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // check if number is greater than 0
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        if( number > 0){
            System.out.println("the number is positive");
        }
       System.out.println("Alex is a mf-king genius"); 
    } 
    
}
