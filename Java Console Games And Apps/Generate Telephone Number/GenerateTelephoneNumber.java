/********************************************************************
 *  This program demonstrates random number generation through      *
 *  outputting a random modern line made-up phone number            *
*********************************************************************/    

import java.util.Random; 

public class GenerateTelephoneNumber
{
   public static void main(String [] args)
   {
   //implement your random number generator
      Random randGen = new Random();
      
      System.out.println("Here is a randomly generated modern plan telephone number: ");
      System.out.println(">--------------------------------------------------------<");
      
   //numbering plan area code portion     
      System.out.print(randGen.nextInt(7) + 2);
      System.out.print(randGen.nextInt(9));
      System.out.print((randGen.nextInt(9)) + "-");
      
   //central office exchange code portion           
      System.out.print(randGen.nextInt(7) + 2);
      int exchangeCodeNumber = randGen.nextInt(9);
   //if-else statement to nullify illegal double 1's in digits 5 and 6
      if (exchangeCodeNumber != 1) 
      { 
         if (exchangeCodeNumber == 0) {
            System.out.print("0");        
            System.out.print((randGen.nextInt(9)) + "-");
         }
         
         else {
            System.out.print(exchangeCodeNumber);
            System.out.print((randGen.nextInt(9)) + "-");     
         }
      }             
      else 
      { 
         System.out.print(exchangeCodeNumber);  
         System.out.print(randGen.nextInt(7) + 2);
         System.out.print("-");

      }
         
   //last 4-digit line number portion
      System.out.println(randGen.nextInt(9000) + 1000);
      
   }//end main
}//end class
