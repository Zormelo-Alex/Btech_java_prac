/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print.integer.entered;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PrintIntegerEntered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("please enter a valid integer:");
        Scanner dom = new Scanner(System.in);
        int integer;
        integer = dom.nextInt();
        System.out.println("you entered:" + integer);
    }
    
}
