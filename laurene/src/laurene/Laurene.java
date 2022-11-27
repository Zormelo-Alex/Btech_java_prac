/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurene;

import java.util.Scanner;

/**
 *
 * @author alexz
 */
public class Laurene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner dom = new Scanner(System.in);
int year=dom.nextInt();
boolean leap;
        if (year%4==0){
    if (year%100==0){
        if(year%400==0)
        leap = true;
        else
            leap=false;
    }
    else
        leap=true;
}
else 
    leap = false;
if(leap)
    System.out.println(year+"is a leap year");
else
    System.out.println(year+"is not a leap year");
    }
    
}