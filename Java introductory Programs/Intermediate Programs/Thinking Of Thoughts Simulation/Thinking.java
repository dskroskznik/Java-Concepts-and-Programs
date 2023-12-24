import java.util.*;

public class Thinking
{                                         //throws an exception production with the method to check error
   public static void main(String[] args) throws OutofmyRange
   {
      //create objects using class constructors
      Thought tobj = new Thought();
      IncessantThought iobj = new IncessantThought();
      
      tobj.message(); //parent
      iobj.message(); //child (overridden)
      
      
     /* = Overloaded Method = 
         1) Multiple methods - same name, but different parameter lists
            (different # of parameters or different types for same # of parameters)
            
         2) Needed for similar operations on different datatypes
         
         
         = Overridden Method =
         1) Multiple methods - same name, but same signature
      
         2) Needed for similar operations on different objects
                  
     */
      
      //Exception object 
      //OutofmyRange invalid = new OutofmyRange("Invalid Number");
      try (Scanner scan = new Scanner(System.in)) {
         /*       
         int number;
         System.out.print("Enter a positive integer: ");
         number = scan.nextInt();
         
         if (number < 0)
            throw invalid;
    */
         int n = 0;
         int d = 1; 
         int ans = 0;
         
         try {
            System.out.print("Enter numerator: ");
            n = scan.nextInt();
                  
            System.out.print("Enter numerator: ");      
            d = scan.nextInt();
            
            ans = n / d;
            
            System.out.print(n + "/" + d + " = " + ans);
         }//end try
    
    //catch arithmetic exceptions for errors (in .lang package)
         catch (ArithmeticException mistake) {
            while (d == 0) {
               System.out.print("Cannot use zero!");
               System.out.print("Enter denominator: ");
               d = scan.nextInt();            
            }//end while
            
            ans = n / d;
            System.out.print(n + "/" + d + "=" + ans);            
         }//end catch
    
    //catch input mismatching exceptions for errors (in .util package)
         catch (InputMismatchException mistake) {
            System.out.print("Wrong type of data");
            scan.nextLine(); //"clear" wrong data type
            
            System.out.print("Enter numerator: ");
            n = scan.nextInt();
                  
            System.out.print("Enter numerator: ");      
            d = scan.nextInt();
                    
            ans = n / d;
            System.out.print(n + "/" + d + "=" + ans);            
         }//end catch
    
    //finally block caps off/cleans up program blueprint, supplies ending statements
         finally {
         System.out.print("\nProgram End.");
    
         }
      }  
   }//end main
}//end class
  