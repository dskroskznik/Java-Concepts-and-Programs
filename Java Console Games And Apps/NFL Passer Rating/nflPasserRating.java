/************************************************************
 * This program works to formulate an NFL Passer Rating     *
 * value ranging from 0 to 158.3 calculated from a formula  *
 ************************************************************/
import java.util.Scanner; 
   
public class nflPasserRating 
{
     public static void main(String [] args)
     {
          //declare the variables
          int numPassAttempts, numCompletion, numPassYards, numTDPasses, numIntercepts;
          double aCompletion, bYardsPerAttempt, cTDPerAttempt, dIntsPerAttempt, passerRate;
          //Create Scanner Object
          try (Scanner scan = new Scanner(System.in)) {
               //Input user to register quaterback names and player statistics 
                    System.out.print("Enter Quarterbacks name: "); //prompt asks for NFL player
                    String nflPlayer = scan.next(); //create string name attatched to NFL player
               //prompt asks players passing attempts      
                    System.out.print("Enter Quaterbacks number of passing attempts: "); 
                    numPassAttempts = scan.nextInt();
               //prompt asks players number of completions     
                    System.out.print("Enter Quaterbacks number of completions: "); 
                    numCompletion = scan.nextInt();
               //prompt asks players passing yards      
                    System.out.print("Enter Quaterbacks number of passing yards: "); 
                    numPassYards = scan.nextInt();
               //prompt asks player touchdown passes     
                    System.out.print("Enter Quaterbacks number of touchdown passes: "); 
                    numTDPasses = scan.nextInt();
               //prompts asks of interceptions    
                    System.out.print("Enter Quaterbacks number of interceptions: "); 
                    numIntercepts = scan.nextInt();                              
                                             
               //Calculate player information into percent varibles into passer rating
                    aCompletion = (((float)numCompletion / (float)numPassAttempts) - 0.3f) * 5;
                    bYardsPerAttempt = (((float)numPassYards / (float)numPassAttempts) - 3.0f) * 0.25;
                    cTDPerAttempt = ((float)numTDPasses / (float)numPassAttempts) * 20;
                    dIntsPerAttempt = (((float)numIntercepts / (float)numPassAttempts) - 2.375f) * 25;
                    //prep calculation for passer rating from all percentage results
                    passerRate = ((aCompletion + bYardsPerAttempt + cTDPerAttempt + dIntsPerAttempt) / 6 ) * 100; 
                    
                    //Output player results from calculations to recieve passer rating score
                    //apply %.2f\n to passer rating to the hundreths
                    System.out.printf("The player, " + nflPlayer + " ,has an NFL passer rating of %.2f\n ", passerRate);
          }                       
     }//end main
}//end class
  
   