/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiply.two.floating.point.numbers;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MultiplyTwoFloatingPointNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double mul;
        System.out.println("enter two numbers");
        Scanner dom = new Scanner(System.in);
        double num1 = dom.nextDouble();
        double num2 = dom.nextDouble();
        mul = num1 * num2;
        System.out.println("Answer is:" + mul);
        
    }
    
}
