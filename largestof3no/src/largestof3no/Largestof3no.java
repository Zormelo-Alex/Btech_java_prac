/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestof3no;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Largestof3no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = reader.nextDouble();
        System.out.println("Enter second number");
        double num2 = reader.nextDouble();
        System.out.println("Enter third number");
        double num3 = reader.nextDouble();
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }else if(num2 >= num3 && num2 >= num1){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
               
    }               
