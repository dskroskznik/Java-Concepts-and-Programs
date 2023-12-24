import java.util.*;

public class Program14 {
   public static void main(String[] args) {
      /*
       * //declare ArrayList
       * ArrayList<String> names = new ArrayList<String>();
       * 
       * System.out.println("Original size of ArrayList: " + names.size());
       * 
       * //add some names
       * names.add("Larry");
       * names.add("Greg");
       * names.add("Moe");
       * names.add("Dylan");
       * 
       * //display contents so far...
       * System.out.println(names);
       * 
       * //add specific adjustments to ArrayList format
       * names.add(3, "Pete");
       * 
       * //display contents so far...
       * System.out.println(names);
       * 
       * //display contents of ArrayList using 'for each loop'
       * for (String rv : names)
       * System.out.println(rv);
       * 
       * //remove any information from ArrayList
       * // ! removes first occurence if any several of same value
       * names.remove(names.indexOf("Dylan"));
       * 
       * //display contents so far...
       * System.out.println(names);
       * 
       * //create nested ArrayList!
       * ArrayList <ArrayList<Integer>> IntList
       * = new ArrayList <ArrayList<Integer>>();
       * 
       * //create a first row (row 0)
       * IntList.add(new ArrayList<Integer>());
       * 
       * //insert an integer in that row
       * IntList.get(0).add(0, 13);
       * 
       * //create a second row (row 1) and add more values
       * IntList.add(new ArrayList<Integer>());
       * 
       * //add value to row 0, column 0 in second row
       * IntList.get(1).add(0, 56);
       * 
       * //add value to row 0, column 0 in second row
       * IntList.get(1).add(1, 45);
       * 
       * //print contents so far...
       * System.out.println(IntList);
       */

      try (Scanner scan = new Scanner(System.in)) {
         double[] scores = new double[5];

         System.out.print("Enter 5 scores: ");

         // input using regular for loop
         for (int i = 0; i < 5; i++)
            scores[i] = scan.nextDouble();

         // recap for each loop
         for (double rv : scores)
            System.out.print(rv + " ");

         // call method using ID array as parameters
         System.out.println(", the average of the scores is: " + average(scores));

         // create 2D array - initializer list
         int[][] number = {
               { 1, 2, 3, 4, },
               { 1, 2, 3, 4, },
               { 1, 2, 3, 4, },
               { 1, 2, 3, 4, }
         };

         // call void method that uses 2D array with parameters
         print2Darray(number);

         // call int method that hold sum2Darray with parameters
         System.out.println();
         System.out.println("The sum total for the 2D array is: " + sum2Darray(number));

         // shows method in practice to print array contents reversed
         System.out.println("Revered array contents for scores inputs: ");
         reverse(scores);

         // recap for each
         for (double rv2 : scores)
            System.out.println(rv2);
      }

   }// end main

   // method definition
   public static double average(double[] sco) {
      double sum = 0;

      for (int i = 0; i < sco.length; i++)
         sum += sco[i];

      return sum / sco.length;
   }// end average

   // void method definition uses 2D array as parameters
   public static void print2Darray(int[][] twoDarr) {
      /*
       * twoDarr.length - number of rows
       * twoDarr[r].length - number of columns
       */

      for (int r = 0; r < twoDarr.length; r++) {
         for (int c = 0; c < twoDarr[r].length; c++)
            System.out.print(twoDarr[r][c] + "\t");
         System.out.println();
      }
   }// end print2Darray

   // method to find sum of values in 2D array
   public static int sum2Darray(int[][] twoDarr) {
      int sum = 0;

      // nested for each loop
      for (int[] inner : twoDarr)
         for (int rv : inner)
            sum += rv;
      return sum;

   }// end sum2Darray

   // method to return array
   public static double[] reverse(double[] arr) {
      for (int i = 0, j = arr.length - 1; i < arr.length / 2; ++i, --j) {
         double temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
      }
      return arr;
   }
}// end class