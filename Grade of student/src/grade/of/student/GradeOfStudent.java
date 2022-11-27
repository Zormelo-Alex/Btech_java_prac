/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.of.student;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GradeOfStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score , grade;
        Scanner dom = new Scanner(System.in);
        System.out.println("input your score:");
        score = dom.nextInt();
        grade = score/10;
        switch( grade){
            case 10:
                System.out.println("Congratulations! You had an A");
                System.out.println("perfect score!");
                        break;
            case 9:
                System.out.println("Congratulations! You had an A");
                        break;
                case 8:
                System.out.println("You had an B");
                        break;
                    case 7:
                System.out.println("You had an C");
                        break;
              case 6:
                System.out.println("You had an C");
                        break;         
                  case 5:
                System.out.println("You had an D");
                        break;
                      case 4:
                System.out.println("You failed, You had an E");
                        break;
                          case 3:
                System.out.println("You failed, You had an E");
                        break;
                              case 2:
                System.out.println("You failed, You had an F");
                        break;
                                  case 1:
                System.out.println("You had an F");
                        break;
                                  default:
                                      System.out.println("Enter valid score!");
                                     
        }
    }
    
}
