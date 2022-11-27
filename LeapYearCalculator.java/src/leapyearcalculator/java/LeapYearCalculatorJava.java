/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyearcalculator.java;

/**
 *
 * @author alexz
 */import java.util.Scanner;
public class LeapYearCalculatorJava{
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("please enter a year");
        int a= input.nextInt();
        if(a%4==0){
            System.out.println(a+"is a leap year");
        }else if(a%100==0 &&a%400==0){
            System.out.println(a+"is a leap year");
        }else{
            System.out.println(a+"is not a leap year");
        }
    }
}
    