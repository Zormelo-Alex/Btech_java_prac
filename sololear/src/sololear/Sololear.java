/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sololear;

public class Sololear{
    static boolean the(int a , int b){
    if(a==15||b==15||a+b==15||a/b==15){
        return true;
    }
    return false;
}
public static void main(String[]args){
    boolean x= the(15,30);
  
}
}
