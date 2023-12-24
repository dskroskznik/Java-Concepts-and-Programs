/* Dylan Skroskznik
   Sept10
   COP2510 */

import java.util.Scanner;

public class Program4 {
     public static void main(String[] args) {
          int num = 5, num2;
          try (Scanner scan = new Scanner(System.in)) {
               num = num + 7; // num = 5 + 7 = 12
               System.out.println("num is " + num);

               System.out.print("Enter an integer: ");
               num2 = scan.nextInt();

               // The next statement uses combined assignment (compound) operators
               // The operators are: += -= *= /= %=

               num2 += 6; // Interpreted as num2 = num2 + (6);
               System.out.println("num is " + num + " and num2 is " + num2);

               // Note: This line is different than the expanded version of combined assignment

               num = num * num2 - 1;

               /*
                * If using compound assignment, note that () is added to the expanded versions
                * ()
                * can change the order of operations. Comment out the previous line and
                * activate the line below to test it out!
                */

               // num *= num2 -1; // num = num * (num2 -1);
               // Increment (++) and Decrement (--)

               System.out.println("num is " + num + " and num2 is " + num2);
               ++num2; // num2 = num2 + 1; //num2 += 1 // num2++; //Same operation!

               // effect of different modes of decrement operator

               double x = 8, y;

               // prefix mode ++x or --x: add or subtract one FIRST

               y = --x + 2;
               System.out.println("x is " + x + " and y is " + y);

               // postfix mode x++ or x--: add or subtract one LAST

               x = 8;
               y = x-- + 2;
               System.out.println("x is " + x + " and y is " + y);

               // methods from the String class

               String firstName;
               char letter;

               System.out.print("Enter your first name: ");
               firstName = scan.next();

               System.out.print("Enter a letter: ");
               letter = scan.next().charAt(0); // read a character!

               System.out.println("Hello " + firstName + "! " +
                         "Your letter is " + letter);
          }

          /*
           * Update statement.When updating variable, it is common for the
           * same variable to appear on both sides of the expression.
           * Remember: evaluate RHS, then assign to LHS.
           */

          // More String methods

          String phrase = "Change is inevitable";
          String mut1, mut2, mut3;

          mut1 = phrase.concat(", except from vending machines.");
          mut2 = mut1.toUpperCase();
          System.out.println(mut2);
          mut3 = mut2.toLowerCase();
          System.out.println(mut3);

          System.out.println("Numberof characters in \"" + mut3 + "\" is "
                    + mut3.length());
          System.out.println(mut2.equals(mut3)); // compare mut2 and mut3
          System.out.println(mut2.equalsIgnoreCase(mut3)); // compare mut2 and mut3

     }// end main
}// end class