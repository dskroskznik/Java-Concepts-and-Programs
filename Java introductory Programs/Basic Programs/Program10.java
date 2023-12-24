// Dylan Skroskznik - #U57843452
// COP2510.004 - Oct.6


import java.util.Scanner;
public class Program10
{
   
   //create enumeration - own 'datatype'; must be declared outside the method
   enum Days {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
   
   //definition of method
   public static int sum (int lo, int hi) { //method header
      int s = 0;
      for (int i = lo; i <= hi; i++) 
         s += i; //running sum 
      return s; 
   } 
   //overload method -work with double 
   public static double sum (double lo, double hi) { //method header
      double s = 0;
      for (double i = lo; i <= hi; i++)
         s += i; //running sum 
      return s;
   } 
   //overloaded method -work with 1 double value instead of 2 
   public static double sum (double hi) { //method header
      double s = 0; 
      for (double i = 1; i <= hi; i++) 
         s += i; //running sum
      return s;
   } 
   //lazy overloaded method -no parameters, no return value = void
   public static void sum() {
   int n1 = 3, n2 = 5;
   System.out.println("The sum of " + n1 + " and " + n2 + 
                  " is " + (n1 + n2) + "\n");
   }

   public static void main(String [] args)
   {      
      try (Scanner scan = new Scanner(System.in)) {
         System.out.println(">-----------------------------------------------<");         
         System.out.println("Let's show how enumerations can be used:\n");         
         //create and assign variable of type enum
         Days today = Days.Thursday; //Change to name of todays date
         System.out.println("Today is " + today + ".");
         System.out.println("Today is " + Days.Sunday + ".");
         System.out.println("Today's day of the week ID is: " + today.ordinal() + ".");
             
         int lower, higher;
         System.out.println("\nThis next procedure demonstrates summing of a number range...");                     
         System.out.println("Enter lower limit interger: ");
         lower = scan.nextInt();
               
         System.out.println("Enter higher limit interger: ");
         higher = scan.nextInt();
               
         //call method within a println statement
         System.out.println("Single Int: The sum of numbers between "+ lower + " and "+
                     higher + " is "+ sum(lower, higher));   

         //call method within an assignment statement
         //widening conversion works with assignment from smaller to a larger datatype
         double total = sum(lower, higher);
         System.out.println("Double: The sum of numbers between "+ lower + " and "+
                     higher + " is "+ total);

         System.out.println("\n>-----------------------------------------------<\n");                       
         System.out.println("Now, we can do the same calculation using decimal values...\n");                       
                     
         double l, h, v;
         System.out.println("Enter lower limit interger: ");
         l = scan.nextDouble();
                
         System.out.println("Enter higher limit interger: ");
         h = scan.nextDouble();
                
         //call overloaded method within a println statement
         System.out.println("Double: The sum of numbers between "+ l + " and "+
                     h + " is "+ sum(l, h));

         System.out.println("\n>-----------------------------------------------<\n");                       
         System.out.println("Now, begin calculating from fixed position of the range...\n");        

         System.out.print("Enter upper half limit: ");
         v = scan.nextDouble();
         System.out.println("The sum of numbers between 1 and "+
                     v + " is "+ sum(v));
         System.out.println("The sum of numbers between 1 and 20 is "+ sum(20.0));      

         System.out.println("\n>-----------------------------------------------<\n");         
         System.out.println("In conclusion...\n");
         //void method can act as a stand alone statement
         sum(); 

      }
   }//end main
}//end class