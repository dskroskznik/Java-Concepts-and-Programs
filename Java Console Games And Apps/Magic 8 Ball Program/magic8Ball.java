/*****************************************************************
* In this program, there will be a responce from a magic 8 ball  *
* which will determine your options for your future, and allows  *
* you to ask the magic 8 ball how many times you would like.     *
*****************************************************************/
import java.util.Random;
import java.util.Scanner;

public class magic8Ball
{
   public static void main (String [] args)
   {   
   //delcare String variable replies to replay magic 8 ball
      String yes = "yes", no = "no";     
      String response, replay;
   //create replies array for each dedicated reply from the magic 8 ball        
      String [] magic8Replies = {
         "It is certain. ", "It is decidedly so. ", "Without a doubt. ", "Yes, Definitely. ", "You may rely on it. ", 
         "As I see it, yes. ", "Most likely. ", "Outlook is good. ", "Yes! ", "Signs point to yes. ", 
         "Reply hazy, try again. ", "Ask again later. ", "Better not tell you now. ", "Cannot predict now. ", "Concentrate and ask again. ",
         "Don't count on it. ", "My reply is no. ", "My sources say no. ", "Outlook is not so good. ", "Very doubtful. "
      };
 
      try (Scanner scan = new Scanner(System.in)) {
         //represent magic 8 ball question process through a 'do while loop'
         //apply response variable with user scanned String question  
         do {
             
            System.out.println("What is your question today? ");
            response = scan.nextLine(); //scan for user input on response
         /*integrate random number generator to grab a 
         random array index as an answer choose */     
            Random rng = new Random();
            int choose = rng.nextInt(19);
            System.out.println("The Magic 8 Ball says: " + magic8Replies[choose]);
            System.out.println("=----------------------------------------------=");
         //requests for replaying magic 8 ball - end of do statement      
            System.out.println("Would you like to ask another question? (yes/no)");
            replay = scan.nextLine(); //scan for user input for replay         
               
         }
         //when replay is yes activates 'do while loop
         while (replay.equalsIgnoreCase(yes) && !(response.isEmpty())); 
            //uses if statement to mandate rejection replies to replay magic 8 ball    
            if (replay.equalsIgnoreCase(no) || !(replay.equalsIgnoreCase(yes))) {
               System.out.println("=----------------------------------------------=");
               System.out.println("Thanks for playing!");        
               System.out.println("=----------------------------------------------=");
            }
      }
   }//end main
}//end class