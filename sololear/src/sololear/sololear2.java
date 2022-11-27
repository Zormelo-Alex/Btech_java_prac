/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sololear;

import java.util.Scanner;

/**
 *
 * @author alexz
 */
public class sololear2 {
void bark(){
    System.out.println("woof woof");
}
void sum(int a, int b){
    System.out.println("does'nt concern you "+(a+b-a+a+a+b-b));
    
}
void number(){
    Scanner dom = new Scanner(System.in);
    System.out.println("enter any number!");
    double c=dom.nextInt();
    System.out.println("your number devided by 100 is "+c/100);
}
void name(){
    System.out.println("enter a valid name");
    Scanner lex= new Scanner(System.in);
    String g=lex.nextLine();
    System.out.println("the name you entered is "+g);
}
void bite(){
    System.out.println("get lost mf");
}
}
