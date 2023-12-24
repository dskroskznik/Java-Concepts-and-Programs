/* Dylan Skroskznik - #U57843452
   COP2510.004 - Oct.5 -
   This program prompts the user with a game of inputs
   to generate a custom horror media title using
   the users birth month, first initial of first name
   and last initial of last name. */
   
import java.util.Scanner; 

public class HorrorTitleGenerator  
{
   /* prompt and check the first initial of first name  */
   private static char getFirstnameInput(String str, Scanner scan)
   {
      char firstInitialInput;
      String firstname;
      while(true)
      {
         System.out.println(str);
         while(!scan.hasNextLine()) {
            System.out.println("Invalid input. Please enter a valid input.");
            scan.nextLine();
         }
         firstname = scan.nextLine().trim();
         if(!firstname.isEmpty()) {
            firstInitialInput = Character.toUpperCase(firstname.charAt(0));
            if (!(firstInitialInput >= 'A' && firstInitialInput <= 'Z')) {
               System.out.println("Invalid value. Please re-enter a value within the range.");
            }
            else { break; }
         }
         else {
            System.out.println("First name cannot be empty. Please re-enter a valid first name.");  
         }
      }
      return firstInitialInput;
   }

   /* prompt and check the last initial of last name  */
   private static char getLastnameInput(String str, Scanner scan) 
   {
      char lastInitialInput;
      String lastname;
      while(true) 
      {
         System.out.println(str);
         while(!scan.hasNextLine()) {
            System.out.println("Invalid input. Please enter a valid input.");
            scan.nextLine();
         }
         lastname = scan.nextLine().trim();
         if(!lastname.isEmpty()) {
            lastInitialInput = Character.toLowerCase(lastname.charAt(0));
            if (!(lastInitialInput >= 'a' && lastInitialInput <= 'z')) {
               System.out.println("Invalid value. Please re-enter a value within the range.");
            }
            else { break; }
         }
         else {
            System.out.println("Last name cannot be empty. Please re-enter a valid Last name.");  
         }
      }
      return lastInitialInput;
   }

   /* prompt and set month input as integer variable */
   private static int getMonthInput(String str, Scanner scan)
   {
      int monthInput;
      String month; 
      while (true) {
         System.out.println(str);
         while (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scan.nextLine(); // Consume the invalid input
         }
         month = scan.nextLine().trim();
         monthInput = Integer.parseInt(month);
         if (!(monthInput >= 1 && monthInput <= 12)) {
            System.out.println("Invalid value. Please re-enter a value within the range.");
         }
         else { break; }
      }
      return monthInput;
   }
   
   /* first initial switch statements */    
   private static String getFirstInitialTitle(char firstInitial) 
   {
      switch (firstInitial) {
          case 'A':
              return "Occult";
          case 'B':
              return "Mysterious";
          case 'C':
              return "Ominous";
          case 'D':
              return "Dark";
          case 'E':
              return "Black";
          case 'F':
              return "White";
          case 'G':
              return "Red";
          case 'H':
              return "Bleeding";
          case 'I':
              return "Stolen";
          case 'J':
              return "Dead";
          case 'K':
              return "Possessed";
          case 'L':
              return "Eerie";
          case 'M':
              return "Luminous";
          case 'N':
              return "Grotesque";
          case 'O':
              return "Eldritch";
          case 'P':
              return "Sinister";
          case 'Q':
              return "Macabre";
          case 'R':
              return "Twilight";
          case 'S':
              return "Pagan";
          case 'T':
              return "Funereal";
          case 'U':
              return "Moonlit";
          case 'V':
              return "Evil";
          case 'W':
              return "Dreaded";
          case 'X':
              return "Fearful";
          case 'Y':
              return "Ghostly";
          case 'Z':
              return "Lugubrious";
          default:
              return "Invalid value";
      }
   }

   /* last initial switch statements */    
   private static String getLastInitialTitle(char lastInitial) 
   {
      switch (lastInitial) {
          case 'a':
              return "Child";
          case 'b':
              return "Woman";
          case 'c':
              return "Ghoul";
          case 'd':
              return "Castle";
          case 'e':
              return "Demon";
          case 'f':
              return "Witch";
          case 'g':
              return "Heart";
          case 'h':
              return "Creature";
          case 'i':
              return "Night";
          case 'j':
              return "Moon";
          case 'k':
              return "Vampire";
          case 'l':
              return "Phantom";
          case 'm':
              return "Ghost";
          case 'n':
              return "Raven";
          case 'o':
              return "Skull";
          case 'p':
              return "Bones";
          case 'q':
              return "Macabre";
          case 'r':
              return "Twilight";
          case 's':
              return "Pagan";
          case 't':
              return "Funereal";
          case 'u':
              return "Moonlit";
          case 'v':
              return "Evil";
          case 'w':
              return "Dreaded";
          case 'x':
              return "Fearful";
          case 'y':
              return "Ghostly";
          case 'z':
              return "Lugubrious";
          default:
              return "Invalid value";
      }
   }

   /* months switch statements */    
   private static String getMonthTitle(int month) 
   {
      switch (month) {
          case 1:
              return "Whispering";
          case 2:
              return "Screaming";
          case 3:
              return "Killing";
          case 4:
              return "Murder";
          case 5:
              return "Sacrifice";
          case 6:
              return "Abduction";
          case 7:
              return "Disappearance";
          case 8:
              return "Creeping";
          case 9:
              return "Devouring";
          case 10:
              return "Haunting";
          case 11:
              return "Burning";
          case 12:
              return "Exorcism";
          default:
              return "Invalid value";
      }
   }
   /* initialize and assign inputs to associated functions to find/return title */
   private static void generateYourTitle(Scanner scan) 
   {
      int monthInput = 0;
      char nameFirstInit;
      char nameLastInit;
      
      monthInput = getMonthInput("Enter your birthmonth in numerical format (1 - 12): ", scan);
      nameFirstInit = getFirstnameInput("Enter your first name completely: ", scan);
      nameLastInit = getLastnameInput("Enter your last name completely: ", scan);

      System.out.println(">----------------------------------------------------------------------------<");
      System.out.println("\tHere's a personal **Horror Title** representing you");
      System.out.println(">----------------------------------------------------------------------------<");

      String monthTitle = getMonthTitle(monthInput);
      String firstInitialAssign = getFirstInitialTitle(nameFirstInit);
      String lastInitialAssign = getLastInitialTitle(nameLastInit);

      System.out.println(">----------------------------------------------------------------------------<");
      System.out.println("\t - The " + monthTitle + " of the " + firstInitialAssign + " " + lastInitialAssign + " -");
      System.out.println(">----------------------------------------------------------------------------<");

      System.out.println("First Name Init : " + nameFirstInit);      
      System.out.println("Last Name Init : " + nameLastInit);
      System.out.println("Birth Month : " + monthInput);


   }
   public static void main(String [] args)
   {
      String replay;
         Scanner scan = new Scanner(System.in);

         do {
               generateYourTitle(scan);
               System.out.println(">----------------------------------------------------------------------------<");
               System.out.println("\tWould you like to get another title? (yes/no) ");
               System.out.println(">----------------------------------------------------------------------------<");
               replay = scan.nextLine().trim().toLowerCase();

         } while(replay.equals("yes"));
       
         System.out.println("Game Over");
      
   }//end main
}//end class