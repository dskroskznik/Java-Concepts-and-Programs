/* Dylan Skroskznik - #U57843452
   COP2510.004 - Sept.29 -
   This program will interpolate Cramer's rule for solving a
   double system of linear equation. */

import java.util.Scanner; 

public class CramerRule
{
   public static void main(String [] args)
   {
      //assign variables in the equation
      int valueA, valueB, valueC, valueD, valueE, valueF;
      double valueX, valueY;
      //scan for user input to enter in the equations
      try(Scanner scan = new Scanner(System.in)) {
         System.out.println(">-----------------------------------------------------------------<");
         System.out.println("Enter an individual value for each letter(once chosen press enter): ");
         System.out.println(">-----------------------------------------------------------------<");
         System.out.print(" a = ");
            valueA = scan.nextInt();
         System.out.print(" b = ");
            valueB = scan.nextInt();
         System.out.print(" c = ");
            valueC = scan.nextInt();
         System.out.print(" d = ");
            valueD = scan.nextInt();
         System.out.print(" e = ");  
            valueE = scan.nextInt();
         System.out.print(" f = ");
            valueF = scan.nextInt();      
      }         
      //display the linear equations with numbers \
      //equations: (ax + by = e) (cx + dy = f)
      //inputted respectfully to assigned variables
      System.out.println(">-----------------------------------------------------------------<");
      System.out.println("\tGiven system of linear equations:");
      System.out.println(">-----------------------------------------------------------------<");
 
      //use string format joined with conditional operator for equations      
      System.out.println(String.format("%dx %s %dy = %d", valueA, valueB < 0 ? "" : "+", valueB, valueE));
      System.out.println(String.format("%dx %s %dy = %d", valueC, valueD < 0 ? "" : "+", valueD, valueF));

      //execute the equations to solve for values of x and y 
      //equations: (x = [ed - bf]/[ad - bc]) (y = [af - ec]/[ad - bc])      
      System.out.println(">-----------------------------------------------------------------<");
      System.out.println("\tValues for x and y for the system of linear equations: ");
      System.out.println(">-----------------------------------------------------------------<");
      
      //use if-else statements to ensure valid operations for equations
      if (0 == (valueA * valueD) - (valueB * valueC)) 
      {
         System.out.println("No valid output for this calculation, error: divide by zero ");
      }
      else 
      {
         int numeratorX = (valueE * valueD) - (valueB * valueF);
         int numeratorY = (valueA * valueF) - (valueE * valueC);
         int denomXY = (valueA * valueD) - (valueB * valueC);
         valueX = (double)(numeratorX / denomXY);
         valueY = (double)(numeratorY / denomXY);
         System.out.printf("Value for X : %.1f\n", valueX);
         System.out.printf("Value for Y : %.1f", valueY);  
      }   
   }//end main
}//end class
