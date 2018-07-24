import java.util.Scanner;
import java.lang.Math;

public class BigandSmall {

  // Main method.
  public static void main(String[] args) {

    // Scanner object to obtain information from user.
    Scanner input = new Scanner(System.in);

    int num1;     // First number
    int num2;     // Second number
    int num3;     // Third number
    int num4;     // Fourth number
    int num5;     // Fifth number
    int greatest;
    int smallest;

    System.out.print("Enter the first number: ");      // Prompt for first number
    num1 = input.nextInt();     // Read first number from user
    System.out.print("Enter the second number: ");    // Prompt for the second number
    num2 = input.nextInt();     // Read second number from user
    System.out.print("Enter the third number: ");    // Prompt for the third number
    num3 = input.nextInt();     // Read third number from user
    System.out.print("Enter the fourth number: ");    // Prompt for the fourth number
    num4 = input.nextInt();     // Read fourth number from user
    System.out.print("Enter the fifth number: ");    // Prompt for the fifth number
    num5 = input.nextInt();     // Read fifth number from user

    greatest = Math.max(Math.max(Math.max(num1,num2),Math.max(num3,num4)),num5)
    smallest = Math.min(Math.min(Math.min(num1,num2),Math.min(num3,num4)),num5)
    System.out.println(greatest + " is the largest number.");
    System.out.println(smallest + " is the smallest number.");
  }
}
