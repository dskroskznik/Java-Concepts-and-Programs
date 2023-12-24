import java.util.Scanner; 

public class Program7
{
   public static void main(String [] args)
   {
      double score;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a score (0 - 100): ");
      score = scan.nextDouble();
      
      //apply while loop used to input validation
      while (score < 0 || score > 100)
      {
         System.out.print("Invalid entry! Re-enter a score (0 - 100): ");
         score = scan.nextDouble();
      }
      
      //one way to selection (if statement)
      //two way to selection (else statement or conditional operator ?:)
      if (score >= 80)
         System.out.println("Congrats! You passed.");
      else
         System.out.println("Sorry. You didn't pass.");
         
      /*Alternate form of this 'if else' statement is your coniditonal operator ?:
         ternary opertor - uses three operands, (condition) ? outcome1 : outcome2
         */
      
      System.out.println(score >= 80 ? "Congrats! You passed." : "Sorry. You didn't pass.");
      
      //Another example of conditional assigning
      
      int x = 20, y = 5, z;
      z = x > y ? 10 : 5;
      
      /*The line above is functionally equivalent to the 'if else' statement below: 
      
      if (x > y)
         z = 10;
      else
         z= 5;    */
         
      //multi-way selection (if else if structure)
      //indenting shown to illustrate nesting code
      
      if (score >= 90)  
         System.out.println("You passed, your grade is an A");
      else
         if (score >= 80)
            System.out.println("You passed, your grade is a B");
         else
            if (score >= 70)
               System.out.println("You passed, your grade is a C");
            else   
               if (score >= 60)
                  System.out.println("You passed, your grade is a D");
               else //tralling else statement    
                  System.out.println("Sorry. You did not pass, your grade is a F");   
   
   }//end main
}//end class