/* Dylan Skroskznik - #U57843452
   COP2510.004 - Sept.15-
   This program works to read integers between  0 and 1000 and
   adds the integers of each digit into its own sum */
   
import java.util.Scanner; //Utilize a Scanner for user input

public class sumDigitInteger 
{
   public static void main(String [] args)
   {
      //Create the Scanner Object
      try(Scanner scan = new Scanner(System.in)) {
         int number, sum = 0; 
         System.out.println("Enter a digit (likely used with multi digit numbers): ");
         number = scan.nextInt();
        
      // Validate that the input is within the specified range
         if (number < 0 || number > 1000) {
            System.out.println("Please enter a number between 0 and 1000.");
            number = scan.nextInt();
         }
      //Use of compound operations to compute digits in number
         int numCopy = number;
         while(numCopy > 0) {
            int lastDigit = number % 10; //grab last digit of input number
            sum = sum + lastDigit; //add the last digit of input word to sum
            numCopy = numCopy / 10; //use copy of your input to and removing its last digit
         }

      //Output the sum of the digits in the number
         System.out.println("The sum of the digits in " + number + " = " + (sum + numCopy));
      }   
   }//end main
}//end class