/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sananet;

/**
 *
 * @author alexz
 */
public class Sananet {
    private static Object math;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p =5000;
        int n= 2;
        double r =0.27;
        double a = p *Math.pow (1+r,n);
        System.out.println("initial ammount"+p);
        System.out.println(a);
        
    }
    
}
