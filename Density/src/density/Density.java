/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package density;

import java.util.Scanner;

/**
 *
 * @author alexz
 */
public class Density {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the minerals mass in grams");
        double m = input.nextDouble();
        System.out.println("Enter the minerals volume in cubic centimeters");
        double c = input.nextDouble();
        double d=m/c;
        System.out.println("Density:"+d+"g/cm3");
        if (d==19.3){
            System.out.println("the mineral is gold");
        }else{
            System.out.println("the mineral is not gold");
        }
       
              
    }
    
}
