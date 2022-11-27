/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forexbereaucurrencyexchangecalculator;
import java.util.Scanner;
/**
 *
 * @author alexz
 */
public class ForexBereauCurrencyexchangeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dom = new Scanner(System.in);
        System.out.println("please enter name");
        String name = dom.next();
        System.out.println("please enter telephone number");
        String number = dom.next();
        System.out.println("please enter national card number");
        String id = dom.next();
        if(number.length()==10){
            System.out.println("choose prefered currency and exchange format");
            System.out.println("1. USD");
            System.out.println("2. Euro");
            System.out.println("3. Pound");
            System.out.println("4. Yuan");
            System.out.println("5. Rand");
            System.out.println("6. Cedi");
            int a = dom.nextInt();
            if(a==1){
                System.out.println("Choose an exchange format");
                System.out.println("1. USD to Euro");
                System.out.println("2. USD to Pound");
                System.out.println("3. USD to Yuan");
                System.out.println("4. USD to Rand");
                System.out.println("5. USD to Cedi");
                int b =dom.nextInt();
                if(b==1){
                    System.out.println("1 USD = 0.85 Euro");
                }if(b==2){
                    System.out.println("1 USD = 0.63 Pound");
                }if(b==3){
                    System.out.println("1 USD = 1.30 Yuan");
                }if(b==4){
                    System.out.println("1 USD = 15.5 Rand");
                }if(b==5){
                    System.out.println("1 USD = 5.98 Cedi");
                }
                System.out.println("Name: "+name);
                 System.out.println("Contact: "+number);
                  System.out.println("National Card Number: "+id);
            }if(a==2){
                System.out.println("Choose an exchange format");
            System.out.println("1. Euro to USD");
                System.out.println("2. Euro to Pound");
                System.out.println("3. Euro to Yuan");
                System.out.println("4. Euro to Rand");
                System.out.println("5. Euro to Cedi");
                   int b =dom.nextInt();
                if(b==1){
                    System.out.println("1 Euro = 1.15 USD");
                }if(b==2){
                    System.out.println("1 Euro = 0.87 Pound");
                }if(b==3){
                    System.out.println("1 Euro = 1.55 Yuan");
                }if(b==4){
                    System.out.println("1 Euro = 16.5 Rand");
                }if(b==5){
                    System.out.println("1 Euro = 7.32 Cedi");
                }
                System.out.println("Name: "+name);
                 System.out.println("Contact: "+number);
                  System.out.println("National Card Number: "+id);
        }
            if(a==3){
                System.out.println("Choose an exchange format");
                System.out.println("1. Pound to USD");
                System.out.println("2. Pound to Euro");
                System.out.println("3. Pound to Yuan");
                System.out.println("4. Pound to Rand");
                System.out.println("5. Pound to Cedi");
                   int b =dom.nextInt();
                if(b==1){
                    System.out.println("1 Pound = 1.45 USD");
                }if(b==2){
                    System.out.println("1 Pound = 1.23 Euro");
                }if(b==3){
                    System.out.println("1 Pound = 1.80 Yuan");
                }if(b==4){
                    System.out.println("1 Pound = 17.32 Rand");
                }if(b==5){
                    System.out.println("1 Pound = 8.98 Cedi");
                }
                System.out.println("Name: "+name);
                 System.out.println("Contact: "+number);
                  System.out.println("National Card Number: "+id);
            }if(a==4){
                System.out.println("Choose an exchange format");
             System.out.println("1. Yuan to USD");
                System.out.println("2. Yuan to Euro");
                System.out.println("3. Yuan to Pound");
                System.out.println("4. Yuan to Rand");
                System.out.println("5. Yuan to Cedi");
                   int b =dom.nextInt();
                if(b==1){
                    System.out.println("1 Yuan = 0.82 USD");
                }if(b==2){
                    System.out.println("1 Yuan = 0.75 Euro");
                }if(b==3){
                    System.out.println("1 Yuan = 0.51 Pound");
                }if(b==4){
                    System.out.println("1 Yuan = 13.25 Rand");
                }if(b==5){
                    System.out.println("1 Yuan = 3.98 Cedi");
                }
                System.out.println("Name: "+name);
                 System.out.println("Contact: "+number);
                  System.out.println("National Card Number: "+id);
            }if(a==5){
                System.out.println("Choose an exchange format");
                System.out.println("1. Rand to USD");
                System.out.println("2. Rand to Euro");
                System.out.println("3. Rand to Pound");
                System.out.println("4. Rand to Yuan");
                System.out.println("5. Rand to Cedi");
                   int b =dom.nextInt();
                if(b==1){
                    System.out.println("1 Rand = 0.09 USD");
                }if(b==2){
                    System.out.println("1 Rand = 0.07 Euro");
                }if(b==3){
                    System.out.println("1 Rand = 0.05 Pound");
                }if(b==4){
                    System.out.println("1 Rand = 0.2 Yuan");
                }if(b==5){
                    System.out.println("1 Rand = 0.53 Cedi");
                }
                System.out.println("Name: "+name);
                 System.out.println("Contact: "+number);
                  System.out.println("National Card Number: "+id);
            }if(a==6){
                System.out.println("Choose an exchange format");
                System.out.println("1. Cedi to USD");
                System.out.println("2. Cedi to Euro");
                System.out.println("3. Cedi to Pound");
                System.out.println("4. Cedi to Yuan");
                System.out.println("5. Cedi to Rand");
                   int b =dom.nextInt();
                if(b==1){
                    System.out.println("1 Cedi = 0.23 USD");
                }if(b==2){
                    System.out.println("1 Cedi = 0.15 Euro");
                }if(b==3){
                    System.out.println("1 Cedi = 0.11 Pound");
                }if(b==4){
                    System.out.println("1 Cedi = 0.92 Yuan");
                }if(b==5){
                    System.out.println("1 Cedi = 6.97 Rand");
                }
              System.out.println("Name: "+name);
                 System.out.println("Contact: "+number);
                  System.out.println("National Card Number: "+id); 
            }
    
}}}
