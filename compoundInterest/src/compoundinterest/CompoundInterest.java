/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterest;

/**
 *
 * @author alexz
 */
public class CompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,p,t,r;
        r=0.04;
        p=5000;
        a=0.0;
        for(t=1;t<=6;t++){
            a = p* Math.pow(1+r,t);
            
            double d= a-p;
            System.out.println("this is your compound interest "+d);
        }
    
    }
    
}
