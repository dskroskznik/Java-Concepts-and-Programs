/**************************************************************
 * This program will demonstrate a basic madlib game          *                             
 **************************************************************/

import java.util.Scanner; 

public class MadLib  
{
   public static void main(String [] args)
   {
      //Create the Scanner object for madlib, and assign your variables for scanner
      try(Scanner scan = new Scanner(System.in)) {
         String noun;
         String adjective;
         String verbPast;
                  
      //Prompt your output message for the user to develop the madlib
         System.out.print("Enter a noun: ");
         noun = scan.nextLine();
         System.out.print("Enter a adjective: ");
         adjective = scan.nextLine();
         System.out.print("Enter a past-tense verb: ");
         verbPast = scan.nextLine();
      
         System.out.println("Mary had a little " + noun + " \n"
            + "Its " + noun + " was " + adjective + " as snow. \n" 
            + "And everywhere that Mary " +  verbPast + " \n"
            + "The " + noun + " was sure to go.");
      }
   }//end main
}//end class