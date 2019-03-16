// ************************************************************
// intWrapper.java
//
// Utilizing some of the functions of the Integer Wrapper Class
// ************************************************************
import java.util.Scanner;

public class intWrapper {
   public static void main(String args[]) {
      
      /* Declaring the variable to store the min and max value of an integer in JAVA then printing the values*/
      Integer age = new Integer(40);
      age = Integer.MAX_VALUE;
      System.out.println("The maximum possible JAVA" + 
 	" integer value is: " + age);
      age = Integer.MIN_VALUE;
      System.out.println("The minimum possible JAVA" + 
 	" integer value is: " + age);
      
      /* Creating a prompt for the user to enter two decimal numbers and store them in String variables */
      Scanner scnr = new Scanner(System.in);
      String num1, num2;
      System.out.println("Enter an integer value: ");
      num1 = scnr.next();
      System.out.println("Enter another integer value: ");
      num2 = scnr.next();
      
      /* Converting the String variables to integer */
      int num11, num22;
      num11 = Integer.parseInt(num1);
      num22 = Integer.parseInt(num2);
      
      /* Adding the two numbers and printing the result */
      System.out.println("The sum of both numbers is: " + 
	(num11 + num22));
   }
}