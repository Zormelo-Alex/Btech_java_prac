/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

/**
 *
 * @author HP
 */
public class Assign1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        double interest = 0;
        double principal = 1500;
        double rate = 25;
        int time = 2;
        interest = (principal*rate*time)/100;
        
        System.out.println("Your loan of " + principal+"cedis "
                + "at a rate of " +rate+"% per anum,"
                + " and over a period of " +time+"years has an interest of " +interest+"cedis");
    }
    
}
