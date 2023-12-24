import java.util.Scanner;
//import this class for Object-Oriented approach to decimal formatting
import java.text.DecimalFormat;

public class Program3 {
   public static void main(String[] args) {
      double x, y, z;

      try (Scanner scan = new Scanner(System.in)) {
         // DecimalFormat object
         DecimalFormat df = new DecimalFormat("0.###");

         // Prompt
         System.out.print("Enter value: ");
         x = scan.nextDouble();

         System.out.print("Enter another value: ");
         y = scan.nextDouble();

         // Calculate
         z = x / y; // float type can result in less precision
         // System.out.println("x = " + x);
         System.out.printf("x = %.2f\n", x); // use of legacy code (C syntax)

         // Updated
         y = Math.pow(y, 2); // use pow for exponent and NOT ^
         System.out.println("y = " + y);
         System.out.println("z = " + df.format(z));
      }

      // Use format method from String class
      // %15 indicates field width limiting to 15 spaces
      String s1 = String.format("%15d", 2510);
      String s2 = String.format("%15f", 2.5102510e2);
      String s3 = String.format("%15e", 2.5102510);
      String s4 = String.format("%15g", 2.5102510);
      String s5 = String.format("%15s", "2510");
      String s6 = String.format("%15c", '2');

      /*
       * d - decimal integer
       * f - floating point
       * e - scientific notation
       * g - combination of e & f (based value)
       * s - string
       * c - character
       */

      // Output (right justified)
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
      System.out.println(s5);
      System.out.println(s6);

   }// end main
}// end class