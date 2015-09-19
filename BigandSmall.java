import java.util.Scanner;
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
    
    // Look for largest number.
    // If the first number is the largest number:
    if (num1 > num2)
      if (num1 > num3)
         if (num1 > num4)
             if (num1 > num5)
               System.out.println(num1 + " is the largest number.");
    // If the second number is the largest number:
     if (num2 > num1)
        if (num2 > num3)
           if (num2 > num4)
              if (num2 > num5)
                 System.out.println(num2 + " is the largest number.");
     // If the third number is the largest number:
    if (num3 > num1)
        if (num3 > num2)
           if (num3 > num4)
              if (num3 > num5)
                 System.out.println(num3 + " is the largest number.");
    // If the fourth number is the largest number:
    if (num4 > num1)
        if (num4 > num2)
           if (num4 > num3)
              if (num4 > num5)
                 System.out.println(num4 + " is the largest number.");
    // If the fifth number is the largest number:
    if (num5 > num1)
        if (num5 > num2)
           if (num5 > num3)
              if (num5 > num4)
                 System.out.println(num5 + " is the largest number.");
    
    // Look for smallest number.
    // If the first number is the smallest number
    if (num1 < num2)
      if (num1 < num3)
         if (num1 < num4)
             if (num1 < num5)
               System.out.println(num1 + " is the smallest number.");
    // If the second number is the smallest number.
    if (num2 < num1)
      if (num2 < num3)
         if (num2 < num4)
             if (num2 < num5)
               System.out.println(num2 + " is the smallest number.");
    // If the third number is the smallest number:
    if (num3 < num1)
      if (num3 < num2)
         if (num3 < num3)
             if (num3 < num4)
               System.out.println(num3 + " is the smallest number.");
    // If the fourth number is the smallest number:
    if (num4 < num1)
      if (num4 < num2)
         if (num4 < num3)
             if (num4 < num5)
               System.out.println(num4 + " is the smallest number.");
    // If the fifth number is the smallest number:
    if (num5 < num1)
      if (num5 < num2)
         if (num5 < num3)
             if (num5 < num4)
               System.out.println(num5 + " is the smallest number.");
  }
}
    