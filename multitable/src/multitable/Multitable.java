/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitable;

public class Multitable {

public static void main(String[] args) {

System.out.println("  ");
System.out.println("   Multiplication Table");
System.out.println(" ");
System.out.print("   ");

for (int m=1; m<=9; m++)
System.out.print("  " + m);
System.out.println(" ");
System.out.println("-------------------------------  ");
	for (int s=1; s<=9; s++)
	{
	System.out.print(s + " |");
		for (int m=1; m<=9; m++)
		{
		if (m*s < 10)
		System.out.print("  " + m*s);
		else
		System.out.print(" " + m*s);
		}
System.out.println();
}}}

