/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

	import java.util.Scanner;
	public class GuessingGame {

	public static void main(String[] args) {

	int number1 = (int)(Math.random() * 10); //returns a random number
 	int number2 = (int)(Math.random() * 10);

 // Create a Scanner object
 Scanner input = new Scanner(System.in);

 System.out.print("What is " + number1 + " + " + number2 + "? ");
 int answer = input.nextInt();

 while (number1 + number2 != answer) {
 System.out.print("Wrong answer. Try again. What is "
 + number1 + " + " + number2 + "? ");
 
answer = input.nextInt();
 }
 System.out.println("You got it!");
}
}

