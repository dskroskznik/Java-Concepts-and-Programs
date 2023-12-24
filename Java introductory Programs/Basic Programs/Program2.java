import java.util.Scanner; //import this class for input

public class Program2 {
    public static void main(String[] args) {
        try (// create a Scanner object
                Scanner scan = new Scanner(System.in)) {
            int num1 = 0, num2 = 0; // declare and initialize two variable

            // prompt user
            System.out.print("Enter two integers (seperated by spaces)");
            num1 = scan.nextInt(); // read an integer
            num2 = scan.nextInt();

            System.out.println("The values you entered were: " + num1 + " and " + num2);

            /*
             * Math operations:
             * + additon
             * - subtract
             * multiply
             * / division
             * % remander
             */

            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

            // We can perform casts to convert num1 into double
            System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));

            double num3;
            boolean flag;
            String name; // String class variable

            System.out.println("Enter one decimal value: ");
            num3 = scan.nextDouble(); // read an integer
            System.out.println("The decimal value entered: " + num3);

            System.out.print("Enter a boolean value: ");
            flag = scan.nextBoolean(); // read a boolean
            System.out.println("The boolean value entered: " + flag);

            System.out.print("Enter a String: ");
            name = scan.next(); // read a String without spaces
            scan.nextLine(); // read a String with spaces
            System.out.println("The String entered: " + name);
        }
    }// ending method
}// ending class