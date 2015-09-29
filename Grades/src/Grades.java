
import java.util.Scanner;

/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */
public class Grades {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    double total = 1;
    
    for(;;) {
        System.out.print("Enter a grade: ");
        int grade = keyboard.nextInt();
        if (grade >= 0 && grade <= 100) {
            total += grade;
        }
        else if (grade == -1) {
            break;
        }
    }
    
    System.out.println("Total is: " + total);
    
    }

}
