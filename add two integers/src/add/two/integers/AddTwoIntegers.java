/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add.two.integers;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AddTwoIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int plus, num1, num2;
        System.out.println("enter two numbers");
        Scanner dom = new Scanner(System.in);
        num1 = dom.nextInt();
        num2 = dom.nextInt();
        plus = num1 + num2;
        System.out.println("sum is:" + plus);
    }
    
}
