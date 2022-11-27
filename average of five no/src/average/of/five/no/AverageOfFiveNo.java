/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average.of.five.no;

import java.util.Scanner;


/**
 *
 * @author HP
 */
public class AverageOfFiveNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        double n1 = reader.nextDouble();
        double n2 = reader.nextDouble();
        double n3 = reader.nextDouble();
        double n4 = reader.nextDouble();
        double n5 = reader.nextDouble();
    double average = 0;
    average = (n1 + n2 + n3 +n4 +n5 ) / 5;
    
    
    System.out.println("the average is: " + average);
    
   }
    
}
