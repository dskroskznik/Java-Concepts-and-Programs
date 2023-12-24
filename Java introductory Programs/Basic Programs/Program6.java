// Dylan Skroskznik - #U57843452
// COP2510.004 - Sept.17-

import java.util.Scanner; //import this class for scan

public class Program6 {
   public static void main(String[] args) {

      /*
       * Relational Operators
       * < - less than
       * > - greater than
       * <= - less than or equal
       * >= - greater than or equal
       * == - equality
       * != - not equal
       * 
       * Logical Operators
       * ! - NOT : invert a boolean value
       * && - AND : all boolean expressions have to be true for the outcome to be true
       * || - OR : at least one boolean expression have to be true for the outcome to
       * be true
       * " ^ " - XOR : bitwise operator (difference gate)
       * 
       * 
       * Updated Operator Precedence
       * ()
       * unary -, !
       * / %
       * + -
       * < > <= >=
       * == !=
       * &&
       * ||
       * = += -= *= /= %=
       * 
       */

      try (Scanner scan = new Scanner(System.in)) {
         double value;
         System.out.print("Enter a value between 1 and 10 (inclusive): ");
         value = scan.nextDouble();

         // scan validation, if statment :
         // To check for values outside of range use ||

         while (value < 1 || value > 10) // do not write: '1 <= value <= 10'
         { // using 'while' instead of 'if' allow scan statment to loop until conditions
           // are met
            System.out.print("Invalid entry: Re-enter a value between 1 and 10 (inclusive): ");
            value = scan.nextDouble();
         } // end while

         // to check for values within a range use &&
         if (value >= 1 && value <= 10) // do not need this with while loop (for scan validation)
            System.out.println("value is " + value);
         /*
          * if
          * if else
          * if else if (combination of nester if else)
          * switch (multiple choice)
          */
      }

   }// end main
}// end class