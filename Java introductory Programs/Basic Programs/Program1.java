/*Dylan Skroskznik
  Aug24-Sept1
  COP2510 */

//This is a single line comment. I can write anything here.
//I want to write another comment

/* THIS IS
   A MULTI
   LINE
   COMMENT */
import java.util.Random;  
   
public class Program1
{
   public static void main(String [] args)
   {
      Random generator = new Random();
      int a1; 
      a1 = generator.nextInt((42) + 3);
      System.out.print(a1);

   }//ending method
}//ending class