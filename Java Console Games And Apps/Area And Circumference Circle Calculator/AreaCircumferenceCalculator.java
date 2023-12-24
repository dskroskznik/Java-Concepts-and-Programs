/*****************************************************************
 * This program is designed to calculate the circumference and   *
 * area of a given circle, * and calculate inscribed shapes side *
 * lengths, perimeters, and areas, within the circle             *
 *****************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat; 

public class AreaCircumferenceCalculator 
{
     private static DecimalFormat df3 = new DecimalFormat("0.###");

     public static void main(String[] args) {
          // Variable integer for user input radius & double variables for calcs
          int userRadius;
          double circleCircumf, circleArea, sqrSideLen, sqrPerimeter, sqrArea, trigSideLen, trigPerimeter, trigArea;

          // Prompt user to input radius of circle
          try (Scanner scan = new Scanner(System.in)) {
               System.out.print("This program supports in calculating different measurements involving a 2D circles"
                         + "\narea and circumference, only from the knowledge of the circles radius value.\n");
               System.out.print("To begin calculating, input one set-integer radius for your circle: ");
               userRadius = scan.nextInt();

               // Attach whileloop to ensure of an accepted input value
               while (userRadius < 1) {
                    System.out.print("Radius is not compatiable to calculate, try a different integer: ");
                    userRadius = scan.nextInt();
               }
          }
          System.out.println(">---------------------------------------------<");
          if (userRadius > 0)
               System.out.println("Circle radius is: " + userRadius);

          // Begin circumference and area calculations
          circleCircumf = 2 * Math.PI * userRadius;
          circleArea = Math.PI * Math.pow(userRadius, 2.0);

          // Begin calculations of inscribed square
          sqrSideLen = (2 * userRadius) / Math.sqrt(2);
          sqrPerimeter = sqrSideLen * 4;
          sqrArea = sqrSideLen * sqrSideLen;

          // Begin calculations of inscribed triangle
          trigSideLen = (userRadius * Math.sqrt(3) / (Math.sqrt(3) / 2));
          trigPerimeter = trigSideLen * 3;
          trigArea = Math.sqrt(3) / 4 * Math.pow(userRadius * Math.sqrt(3), 2.0);

          // Prompt user the output values for the calculations

          System.out.println("Here are the results values for your calculations: \n");
          System.out.println(">------------Circumference & Area------------<");
          System.out.println("The circumference of the circle : " + df3.format(circleCircumf));
          System.out.println("The area of the circle : " + df3.format(circleArea) + " \n ");
          System.out.println(">------Square: Sidelengths Perimeter & Area-----<");
          System.out.println("The side lengths of the inscribed square : " + df3.format(sqrSideLen));
          System.out.println("The perimeter of the inscribed square : " + df3.format(sqrPerimeter));
          System.out.println("The area of the inscribed square : " + df3.format(sqrArea) + " \n ");
          System.out.println(">-----Triangle: Sidelengths Perimeter & Area----<");
          System.out.println("The side lengths of the inscribed triangle : " + df3.format(trigSideLen));
          System.out.println("The perimeter of the inscribed triangle : " + df3.format(trigPerimeter));
          System.out.println("The area of the inscribed triangle : " + df3.format(trigArea) + "\n");

     }// end main
}// end class