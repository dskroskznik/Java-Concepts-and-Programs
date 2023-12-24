// Dylan Skroskznik - #U57843452
// COP2510.004 - Oct.6


import java.util.Scanner; 

public class Program11
{
   //global constant - GREAT IDEAS
   final static int MAX = 250;
   
   //global variable - declared outside of method or block VERY BAD!
   static int z = 11; //static ensure that memory space for 'z' is allocated
   
   //scope - visibility of identifier
   public static void main (String [] secondhalf)
   {      
      //local - declared inside method or block
      int x = 3; //x is local main
      System.out.println("x is " + x);
      method1(x);
      System.out.println("x is " + x);
      System.out.println("z is " + z);
      
      //block of code
      {
         int y = 10; //y is local this block
         System.out.println("y is " + y);
         
         
      }//end block
      System.out.println("w is " + w);
         
   }//end main
   
   static int w = 21;
   
   public static void method1 (int x)
   {
      x += 7; //x (declared in header) is local method1
      int z = 23; //local z to method1
      System.out.println("z is " + z);
      System.out.println("x is " + x);
      System.out.println("w is " + w);
      System.out.println("Testing return...");
   // return; //use to exit method
      
   }//end method1
  
   
}//end class