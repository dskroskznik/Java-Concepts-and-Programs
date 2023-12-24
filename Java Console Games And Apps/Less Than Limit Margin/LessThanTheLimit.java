
// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.1
/**************************************************************
* In this program, you while input a group of integer numbers *
* followed by a limit margin, it will display an output       *
* from your integers which are less than your given limit.    *
**************************************************************/
import java.util.Scanner;

public class LessThanTheLimit {
   /*
    * public method to help distguish an array index below the limit
    * as the method will reference the assigned array and limit variables
    */
   public static void numBelowLimit(int[] entryNumbers, int limit) {
      // stores value to the array index [0] (beginning of array)
      int belowLimit = entryNumbers[0];
      // for loop cycles through array to grab integers lower than limit
      for (int i = 0; i < entryNumbers.length; i++) {
         if (entryNumbers[i] < limit) {
            belowLimit = entryNumbers[i]; // assigns each incrementing array index with int variable
            System.out.print(belowLimit + " "); // and prints grabbed integers under limit
         }
      }
   }// end method 'numBelowLimit'

   public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
         // declare varaible of integer and int[] type
         final int ARRAY_LIMIT = 10; // a definite number assigned for an entry array limit
         int[] numEntered = new int[ARRAY_LIMIT];
         int numLimit = 0; // initialize for user input on chosen limit number

         // prints request to enter exactly 10 integers filling array 'numEntered'
         System.out.println("Enter in 10 integer numbers: ");
         for (int i = 0; i < numEntered.length; i++) // for looping integers
            numEntered[i] = scan.nextInt(); // scan for user input for array
         // prints the chosen integers user entered from array 'numEntered'
         System.out.println("Here are your 10 chosen integers: ");
         for (int rv : numEntered) // range value to stop array boundary at 10
            System.out.print(rv + " ");
         System.out.println("\n=--------------------------------------------=");
         // prints request for user to suggest a selected limit
         System.out.println("Enter a limit number: ");
         numLimit = scan.nextInt(); // scan for user input of limit
         // print shares integers less than assigned limit
         System.out.print("The integers less than your set limit '" + numLimit + "' are: ");
         numBelowLimit(numEntered, numLimit); // method reference to calculate below limit numbers
      }

      System.out.println("=--------------------------------------------=");

   }// end main
}// end class