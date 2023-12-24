/* Dylan Skroskznik - COP2510.004
   #U57843452
   This program will demonstrate madlib game. */

 //First create class to name program and attach a static void

import java.util.Scanner; //import of scanner for user input

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