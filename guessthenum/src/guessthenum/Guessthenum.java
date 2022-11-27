/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenum;
import java.util.Scanner;
public class Guessthenum {

public static void main(String[] args) {

String a;
do{
Scanner input = new Scanner(System.in);
int number = (int)(Math.random()*10);
System.out.println("Guess a magic number between 0 and 10");

	int guess = -1;
	while (guess != number) {
// Prompt the user to guess the number
System.out.print("\nEnter your guess: ");

guess = input.nextInt();
 if (guess == number)
 System.out.println("Yes, the number is " + number);
 else if (guess > number)
 System.out.println("Your guess is too high");
 else
 System.out.println("Your guess is too low");
        }System.out.println("enter 1 to play again");
 a =input.next();
}

while(a=="yes");
}

}
