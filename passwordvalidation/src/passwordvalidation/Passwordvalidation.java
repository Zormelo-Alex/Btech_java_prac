/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidation;

import java.util.Scanner;

/**
 *
 * @author alexz
 */
public class Passwordvalidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number=2;
        int special=2;
        int character=7;
        int number_count=0;
        int special_count=0;
        int char_count=0;
        int totalCount=0;
        do{
        System.out.println("Enter your password");
        Scanner dom = new Scanner (System.in);
        String a = dom.nextLine();
        int alen= a.length();
        for(int i=0; i<alen; i++){
            char ch= a.charAt(i);
            if(Character.isAlphabetic(ch)){
                char_count++;
            }else if(Character.isDigit(ch)){
                number_count++;
            }else if(ch=='$' || ch=='!' || ch=='@' || ch=='#' || ch=='%' || ch =='*'){
                special_count++;
            }
        }if(char_count>=character && number_count>= number && special_count>=special){
            System.out.println("Strong");
        }else{
            System.out.println("Weak");
            System.out.println("Retry your password");
        }
    }
    while(char_count<character || number_count<number || special_count<special);
    
}}
