import java.util.Scanner;
import java.util.Random;

public class Program5 {
     public static void main(String[] args) {
          double side = 3, power;

          try (Scanner scan = new Scanner(System.in)) {
               // Random object
               Random generate = new Random();

               System.out.println(side + " squared is " + Math.pow(side, 2.0));

               System.out.println("Enter an exponent: ");
               power = scan.nextDouble();

               System.out.println(side + " to the power of " + power +
                         " is " + Math.pow(side, power));

               System.out.println("The square root of " + side +
                         " is " + Math.sqrt(side));
               // exp is NOT power
               System.out.println("exp(1) = " + Math.exp(1));

               System.out.println("4.7 rounded up = " + Math.ceil(4.7));

               System.out.println("4.7 rounded down = " + Math.floor(4.7));
               // random number generated between 0.0 (inclusive) and 1.0(exclusive)
               System.out.println("A random number (using the math class) = " + Math.random());

               System.out.println("A random floating-point number (using the random class) = " + generate.nextDouble());
               System.out.println("A random floating-point number (using the random class) = " + generate.nextFloat());

               // range in ...
               System.out.println("A random integer (using the random class) = " + generate.nextInt());

               // parameter is n --> range is 0 to n-1
               System.out.println("A random integer (using the math class) " +
                         "within the range of 0 to 9 = " + generate.nextInt(10));
               System.out.println("A random integer (using the math class) " +
                         "within the range of 1 to 10 = " + (generate.nextInt(10) + 1));

               // multiply to expand range of random floating-point
               System.out.println("A random floating-point number (using the random class) " +
                         "within the range of 0 to 4.99999 = " + (generate.nextDouble() * 5));
               // add or subtract to shift range of random number
               System.out.println("A random floating-point number (using the random class) " +
                         "within the range of 5.00000 to 9.99999 = " + (generate.nextDouble() * 5 + 5));
          }

          // String literal vs String object
          String n1 = "string"; // String literal
          String n2 = "string";
          System.out.println(n1 == n2); // n1 and n2 reference same space in memory

          String n3 = new String("string"); // String object
          String n4 = new String("string");
          System.out.println(n3 == n4); // n3 and n4 referencing different spaces in memory

     }// end main
}// end class
