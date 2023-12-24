import java.util.Scanner;

public class CollegeCourse {
   public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
         /*
          * //object created using default constructor
          * will only be used if there are no constructors in class definition *
          * CollegeStudent test = new CollegeStudent();
          * 
          * //view contents of test
          * System.out.println(test);
          */
         // using first contructor
         CollegeStudent s1 = new CollegeStudent(1234567, 4.0);
         System.out.println(s1);
         // using overloaded contructor1
         CollegeStudent s2 = new CollegeStudent();
         System.out.println(s2);
         // using overloaded constructor2
         CollegeStudent s3 = new CollegeStudent(4444);
         System.out.println(s3);
         // using overloaded constructor3
         CollegeStudent s4 = new CollegeStudent(2.35);
         System.out.println(s4);
         // using overloaded copy constructor
         CollegeStudent s5 = new CollegeStudent(s2);
         System.out.println(s5);

         // Array of 'CollegeStudent' objects
         final int SIZE = 3;

         CollegeStudent[] roster = new CollegeStudent[SIZE];

         int num = 0;
         double gpa = 0.0;

         // filling array
         for (int i = 0; i < SIZE; ++i) {
            System.out.print("Student Number: ");
            num = scan.nextInt();
            System.out.print("Student GPA: ");
            gpa = scan.nextDouble();

            // object creation
            roster[i] = new CollegeStudent(num, gpa);
         }

         // display array contents
         for (int i = 0; i < SIZE; ++i) {
            System.out.print(roster[i]);

         }
      }

   }// end main
}// end class