// Dylan Skroskznik - #U57843452
// COP2510.004 - Oct.29

import java.util.Scanner;

public class Program13
{
  public static void main (String [] args)
  {      
      try (Scanner scan = new Scanner(System.in)) {
         final int SIZE = 10;
         
         //declare 1 DIMENSIONAL "array object"
         int [] arrayExample = new int [SIZE];
         // other order - 
         // int arrayExample [] = new int [SIZE];
         
         //initialize
         for (int index = 0; index < SIZE; index++)
            arrayExample[index] = index * SIZE;
         
         //print contents
         //CAREFUL WITH CONDITIONS: using <= produces
         //"off by one" error!
         for (int index = 0; index < SIZE; index++)
            System.out.print(arrayExample[index] + " ");
         
         //another declaration
         double [] number = new double[5];
         
         //prompt user
         System.out.print("\nEnter " + number.length + " values: ");
         
         for (int i = 0; i < number.length; i++)
            number[i] = scan.nextDouble();
         
         //print using for each loop
         // rv - range variable (proxy)
         for (double rv : number)
            System.out.print(rv + " ");
      }
      
      //declare initialization list
      char [] letterGrades = {'A', 'B', 'C', 'D', 'F'};
      
      //display contents of list
      System.out.println("\nHere are the contents: ");
      for (char v : letterGrades)
         System.out.print(v + " ");
      
      System.out.println("\nThe array size was " + letterGrades.length);
      
      //declare 2 DIMENSIONAL array
      final int ROW = 3;
      final int COL = 4;
      
      //use multiple array brackets based on dimension size
      int [][] table = new int [ROW][COL];
      
      //initialize 2D array - must be nested loop      
      //ROW = table.length
      //COL = table[r].length      
      for (int r = 0; r < ROW; r++)
         for (int c = 0; c < COL; c++)
            table[r][c] = r * 0 + c;
            
      //display table      
      for (int r = 0; r < ROW; r++) {
         for (int c = 0; c < COL; c++) {
            System.out.print(table[r][c] + "\t");
         }       
         System.out.println();       
      }   
         
                  
   }//end main
}//end class