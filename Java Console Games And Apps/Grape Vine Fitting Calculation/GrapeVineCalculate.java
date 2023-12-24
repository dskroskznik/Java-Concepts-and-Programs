/*********************************************************   
 * This program will demonstrate use of calculations     *
 * of grapevines with user input.                        *
 *********************************************************/
import java.util.Scanner; 

public class GrapeVineCalculate
{

    private static double getInput(String str, Scanner scan) {
      double userInput = 0;
      boolean validInput = false;

      do {
          try {
              System.out.print(str);
              userInput = scan.nextDouble();
              validInput = true;
          } 
          catch (java.util.InputMismatchException e) {
              System.out.println("Invalid input. Please enter a valid number.");
              scan.next(); // Clear the invalid input from the scan
          }
      } while (!validInput);

      return userInput;
}

    public static void main(String [] args)
    {
        /*  
          row = length of the row in feet
          end = the amount of space used by an end post assembly
          space = the spacebetween vines in feet 
          vine = number of grapevines that will fit in the row 
        */
        double row, end, space, vine;   
        
        try(Scanner scan = new Scanner(System.in)) {
            //Prompt your output message for the user to develop the madlib
            row = getInput("Enter length of a grapevine row (in feet): ", scan);
            end = getInput("Enter space used by end post assembly: ", scan);
            space = getInput("Enter space between grapevines (in feet): ", scan);
          
            //Now calculations of user input process starts
            vine = (row - 2 * end) / space;
            System.out.println("Here is total number of grapevines that will fit in each row: " + vine ); 
        }
  }//end main
}//end class