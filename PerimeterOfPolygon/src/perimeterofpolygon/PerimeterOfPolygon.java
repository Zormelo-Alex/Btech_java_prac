/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeterofpolygon;
import java.util.Scanner;
/**
 *
 * @author alexz
 */
public class PerimeterOfPolygon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dom = new Scanner(System.in);
        System.out.println("Choose a polygon");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Pentagon");
        System.out.println("4. Hexagon");
        System.out.println("5. Heptagon");
        System.out.println("6. Octagon");
        System.out.println("7. Nonagon");
        System.out.println("8. Decagon");
        int a = dom.nextInt();
        System.out.println("Enter the length of sides in milimeters");
        double length = dom.nextDouble();
                double perimeter = 3*length;
        switch(a){
            case 1:
                System.out.println("Triangle");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
        break;
            case 2:
                System.out.println("Square");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
                break;
            case 3:
                 System.out.println("Pentagon");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
                break;
            case 4:
                 System.out.println("Hexagon");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
                break;
            case 5:
                 System.out.println("Heptagon");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
                break;
            case 6:
                 System.out.println("Octagon");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
                break;
            case 7:
                 System.out.println("Nonagon");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
                break;
            case 8:
                 System.out.println("Decagon");
                System.out.println("Length: "+length);
                System.out.println("Perimeter: "+perimeter);
                break;
            default:
                System.out.println("You entered an incorrect number!");
    }
    
}}
