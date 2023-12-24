/**********************************************************
* In this program, the user will be asked a number larger *
* than two for the program to generate a multiplication   *
* table oriented to the users input number (up to 12)     *
**********************************************************/
import java.util.Scanner;

public class multiplicationTable
{
   public static void main(String[] args) 
   { 
      try (Scanner scan = new Scanner(System.in)) {
         int tableRows = 12;
   //introducts user input to enter a selected number to fill columns for multiples up to 12     
         System.out.println("This will generate a times table if the column input is (3-12).");
         System.out.println("=------------------------------------------------------------------=");
         System.out.print("Please enter a number of columns for your times table: ");
         int tableColumns = scan.nextInt(); //scan to assign user input for columns
 
   //test user validation of columns value to deny less than or equal to '2' inputs
         while (tableColumns <= 2 || tableColumns > 12) {
            System.out.print("Sorry, this value won't fit for a times table. Re-enter a valid input: ");
            tableColumns = scan.nextInt();
         }             
   //created 2 DIMENSIONAL array for constant row value with selected column value
         int[][] timesTable = new int[tableRows + 1][tableColumns + 1]; //both array increased to next index     
 
   //use of 'for loop' in 2D to construct formula for multiplication from one row and one column    
         for (int r = 1; r < timesTable.length ; r++) {  //start table row with 1, r = 1
            for (int c = 1; c < timesTable[r].length; c++) //start column with 1, c = 1
               timesTable[r][c] = r * c; //multi. formula in table array
         }
         System.out.println("\n" + tableColumns + " column times table");
         System.out.println("=------------------------------------------------------------------=");      
   //use of 'for loop' in 2D to create arranged times table with values in array
         for(int r = 1; r < timesTable.length; r++) {
            for(int c = 1; c < timesTable[r].length; c++) {
               System.out.printf("%5d",timesTable[r][c]); //organizes numbers to table format
            }   
         System.out.println();
         }
      }    
   }//end main
}//end class