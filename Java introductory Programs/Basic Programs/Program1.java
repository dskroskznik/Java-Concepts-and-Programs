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