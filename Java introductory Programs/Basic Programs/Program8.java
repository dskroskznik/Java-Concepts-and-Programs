import java.util.Scanner; 

public class Program8
{
   public static void main(String [] args)
   {
      
      Scanner input = new Scanner(System.in);
 /* Comparison tips:
      1) Do NOT use == on floating point data. Example below:
        double n1 = 3.14159, n2 = Math.PI;
          //if you must compare floating points use this method:
            if (Math.abs(n1 -n2) < 0.00000001)
              System.out.println("n1 and n2 are approximately equal.");
     2) To compare characters you can use relational operators. 
       Refer to ASCII table (2.14 in zyBook) for their integer counterparts,
       so you can understand how the operators would work.
       (Exercise for you: Create some examples on your own to test out the operations )
     3) To compare Strings do NOT use relational operators.
       Instead, use the methods equals, equalsIgnoreCase, compareTo.
       (Another exercise for you: test out these methods on your own tosee how they work.
       Remember, you need string variables (objects)to use these methods.
 */
      
 //switch statements -multiple selection 
      int score;
   
 //input validation using do while loop (post test loop)
      do
      {
         System.out.print("Enter a score (0 -100): ");
         score = input.nextInt();
         
      }while(score < 0 || score > 100);
      
      switch(score / 10) //integral expession -int, char, String
      {
         case 10: System.out.println("You got a perfect score. Your grade is an A! Well done!");
            break; //exit the switch
         case 9: System.out.println("You got a great score. Your grade is an A! Well done!");
            break;     
         case 8: System.out.println("You got a good score. Your grade is a B! Good job!");
            break; 
         case 7: System.out.println("You got a fair score. Your grade is a C.");
            break; 
         case 6: System.out.println("You got a poor score. Your grade is a D.");
            break; 
         default: System.out.println("You got a very poor score. Your grade is an F.");
   
 /* fallthrougheffect (no break sattements)
    case 5:
    case 4:
    case 3:
    case 2:
    case 1:
    case 0:
         System.out.println("You got a very poor score. Your grade is an F.");
         break; 
                         
     only 1 default case, per switch, works like trailing else. 
   if default is at the end of the switch, you don't need a break statement */ 
   
       }//end switch
   }//end main
}//end class