/********************************************************/
/*    This program is designed to apply the active      *
/*    members points in a basketball team during        *
/*    a game with a bar chart.                          *
/********************************************************/

import java.util.Scanner;

public class BasketballBarChart
{
   public static void scores (String playerName, int playerNamePts) 
   {
      System.out.printf("%-8s : ",playerName);
      for(int p = 0; p < playerNamePts; p++) {
         System.out.print("*");     
      }
      System.out.println();  
   } 

   public static void main(String[] args)
   {
      int playerCount = 8;
      int[] playerPoints = new int[playerCount];
      String[] playerNames = new String[playerCount];
      //int playerName1Pts, playerName2Pts, playerName3Pts, playerName4Pts, playerName5Pts;
      //String playerName1, playerName2, playerName3, playerName4, playerName5;
      
      System.out.println("Enter the names of each 8 players, seperated by spaces: ");      
      try(Scanner scan = new Scanner(System.in)) {
         for (int i = 0; i < playerCount; i++) {
            playerNames[i] = scan.next();
        }

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Enter the points scored by " + playerNames[i] + ":");
            playerPoints[i] = scan.nextInt();
            while (playerPoints[i] < 0) {
                System.out.println("Re-enter a non-negative valid input: ");
                playerPoints[i] = scan.nextInt();
            }
        }    
         
         System.out.println(">-----------------------------------------<");
         System.out.println("Chart of team points scored by player:");      
         System.out.println(">-----------------------------------------<");
         for (int i = 0; i < playerCount; i++) {
            scores(playerNames[i], playerPoints[i]);
        }
      }
   }//end main
}//end class