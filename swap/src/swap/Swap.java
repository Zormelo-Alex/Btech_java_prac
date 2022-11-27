/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

import java.util.Scanner;

/**
 *
 * @author alexz
 */
public class Swap{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number");
       int num1 = input.nextInt();
       System.out.println("Enter the second number");
       int num2 = input.nextInt();
       System.out.println("before the swap ,the first number:"
             + num1+" the second number: " +num2);
       int temporary = num1;
       num1= num2;
       num2 =temporary;
       System.out.println("after the swap, the first number: "+ num1
       +" the second number: " + num2);
    }
}
