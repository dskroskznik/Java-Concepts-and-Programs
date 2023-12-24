// Dylan Skroskznik - #U57843452
// COP2510.004 - Oct.6


import java.util.Scanner; 

public class Program9
{
   public static void main(String [] args)
   {      
      Scanner scnr = new Scanner(System.in);
      
 //loop review:
 //-while loop; count is loop control variable
      int count = 1; //initialization
      while (count <= 5) //condition
      {
         System.out.print(count + " ");
         count++; //update count 
      }//end while
      
      System.out.println();
 //-do while loop
      count = 1; //reset variable
      do
      {
         System.out.print(count + " ");
         count++; //update count      
      } while (count <= 5);
      
      System.out.println();
 //-for loop
      for (count = 1; count <= 5; count++) {
         System.out.print(count + " ");
      }
      

 //loop processing techniques
      int sum = 0, sen, n = 0;
      double avg;
      
      System.out.print("Enter an integer (enter 0 to quit): ");
      sen = scnr.nextInt(); //initial
      
      //apply sentinel to while loop
      while (sen != 0)
      {
         n++; //tracking num of values
         
         //running sum
         sum += sen; //sum = sum + (value);
         System.out.println("Sum so far is: " + sum);
         
         System.out.print("Enter another integer (enter 0 to quit): ");
         sen = scnr.nextInt(); //update
      }
         System.out.println();
         
      if (n == 0) { 
         System.out.println("No excepted value entered.");
      }
         
      else {
         avg = (double)sum / n; //casting to avoid integer division
         System.out.println("The average is " + avg);
      }//end loop   
 
 //-nested loops
 //for each iteration, or repetition, of outer loop
 //inner loop complete all iterations
 
      int n1 = 1, n2;
      while (n1 <= 2) { //outer loop (run 2 times)
         n2 = 1;
         
         while (n2 <= 2) { //inner loop (run 2 times)
            System.out.println("Hello.");
            n2++;
         }
         n1++;          
      } 
 //rewrite -nested loop- as -nested for loop- 
 //use counter to track repetitons
      
      int reps = 0; 
      for (n1 = 1; n1 <= 5; n1++) { //outer loop
         for (n2 = 1; n2 <= 5; n2++) { //inner loop
            reps++;        
         }
      }     
      System.out.println("Number of reps: " + reps);   
     
 /*    
 //Infinite for loop
      for ( ; ; )
         System.out.print("Frolic");
         */
 //infinite while loop 
 /*     while (true)
         System.out.print("Frolic");
         
 /*break statements can interrupt (stop) loops! */
/*      for ( ; ; ) {
         System.out.print("Frolic");
         break; //exit the loop  
      }
         System.out.println();
       
 /*Example of a break statement with a finite loop
   You can declare a loop control variable within the loop,
   You can update in other ways (here let's add 2)     
 */ /*
      for (int i = 1; i <= 20; i+=2) {
         if (i == 13) 
            break; //nested within the if clause; still exits loop!
            
         System.out.println(i + " ");
      }        
 //Test effect of break statements in nested loops 
 
      int reps = 0; 
      
      for (int n1 = 1; n1 <= 10; n1++) { //outer loop 
         for (int n2 = 1; n2 <= 5; n2++) {  //inner loop 
            reps++;
            //break; //exits the inner loop 
         } 
         break; //exit the outer loop 
      }    
      System.out.println("Number of reps: "+ reps); 

 //continue statement -skip one or more iterations in loop
         for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0)                           
               continue;
            System.out.print(i + " "); 
         }
         
         System.out.println(); 
 
 /*WARNING: don't resort to this code style 
   -don't use infinite loops as your 'baseline'!
   (I will penalize if I see it in assignments!) 
 */ /*
      int n = 0;
      
         while (true) {
            n++; 
         System.out.print(n + " ");
         
         if(n == 10)
            break;
      }
 */
 /* The above code is unnecessary. Proper loops should be designed 
    to end when a condition becomes false. 
 */  
             
      
   }//end main
}//end class