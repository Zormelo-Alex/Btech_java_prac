/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.value.of.pkgchar;

/**
 *
 * @author HP
 */
public class AsciiValueOfChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch = 'a';
        int ascii = ch;
        int castAscii = (int)ch;
        System.out.println("the ASCII value of "+ch +" is: " + ascii);
        System.out.println("The ASCII value of "+ch +" is: "+castAscii);
        //i dont get this!
    }
    
}
