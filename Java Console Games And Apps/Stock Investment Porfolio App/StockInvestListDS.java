/*****************************************************************
 * This program will gather and share selected information on    *
 * healthcare stocks from which decided on investmenting in.     *    
 *****************************************************************/
import java.util.*; //import wildcar classes set for scanner
import java.text.NumberFormat; //import number format text class

public class StockInvestListDS {
   public static void main(String[] args) {
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      try (Scanner scan = new Scanner(System.in)) {
         System.out.println("How many companies' stocks are you investing in?");
         int numOfCompanies = scan.nextInt();
         while (numOfCompanies < 1) {
            System.out.println("Please enter a valid number of companies to invest in");
            numOfCompanies = scan.nextInt();
         }

         StockInfoDS[] tradeList = new StockInfoDS[numOfCompanies];
         scan.nextLine();

         for (int i = 0; i < numOfCompanies; ++i) {
            System.out.print("Enter company ticker name #" + (i + 1) + ": ");
            String companyName = scan.nextLine();

            System.out.print("Enter wanted shares to invest in for " + companyName + ": ");
            int numShares = scan.nextInt();
            while (numShares < 1) {
               System.out.print("Please enter a valid number of shares to invest in (must be >= 1): ");
               numShares = scan.nextInt();
            }
            tradeList[i] = new StockInfoDS(companyName, numShares);
            scan.nextLine();
         }

         System.out.println();
         System.out.println(">------------------------ Your companies and stocks: -----------------------------<");
         for (int i = 0; i < numOfCompanies; ++i) {
            System.out.println(tradeList[i]);
         }
      }

      System.out.println(">---------------------------------------------------------------------------------<");
      System.out.print("Total costs amount: ");
      System.out.printf(nf.format(StockInfoDS.getTotalCostDS()));
      System.out.println();
   }
}// end class
