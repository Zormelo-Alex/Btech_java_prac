/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lex;

/**
 *
 * @author alexz
 */
import java.util.Scanner;
public class Lex{
    public static void main (String[]args){
      Scanner input= new Scanner(System.in);
      double average =0;
      int total=0, number, positive=0,negative=0 ,count=0;
      System.out.println("enter an integer, the inpit ends if it is zero");
      do {
          
          number = input.nextInt();
          total+=number;
          count++;
          if(number <0)
              negative++;
          if(number>0)
              positive++;
          average=total/count;
      }while(number!=0);
      System.out.println("total: "+total);
      System.out.println("average: "+average);
       System.out.println(positive+" positive numbers");
 System.out.println(negative+" negative numbers");
  System.out.println("you entered "+count+" numbers");

    }
}
