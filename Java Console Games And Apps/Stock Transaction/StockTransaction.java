/* Dylan Skroskznik - COP2510.004
   #U57843452
   This program will demonstrate calculations in stock transactions through java code. */

//First create class to name program and attach a static void

import java.text.DecimalFormat; //import of decimal format to simplify outputs

public class StockTransaction {
     public static void main(String[] args) {
          // Declare variables to jack's transactions (buying and selling)
          int sharesBought = 1000;
          double pricePerShareBuy = 45.83;
          double amountStockPurchase = sharesBought * pricePerShareBuy;
          double buyingComm = 0.015 * amountStockPurchase;

          int sharesSold = 1000;
          double pricePerShareSale = 50.79;
          double amountStockSold = sharesSold * pricePerShareSale;
          double sellingComm = 0.015 * amountStockSold;

          // Use of declared variables representing numbers and developing total amounts
          // and profits
          double profit = (amountStockSold - sellingComm) - (amountStockPurchase - buyingComm);

          DecimalFormat df = new DecimalFormat("0.####");

          // Displayed information of jack's stock transactions
          System.out.println(">----------------------------------------------------<");
          System.out.println("This program will demonstrate calculations in stock transactions.");

          System.out.println("Stock Purchases: The amount of money Jack paid for stock: $" + amountStockPurchase);
          System.out.println("Commission Purchases: The amount of money Jack paid for broker commision after buying: $" + df.format(buyingComm));
          System.out.println("Stock Sales: The amount of money Jack sold for stock for: $" + amountStockSold);
          System.out.println("Commission Sales: The amount of money Jack paid for broker commision after selling: $" + df.format(sellingComm));
          System.out.println("Profit: The total profit Jack made through his sales and commisions: $" + df.format(profit));
          System.out.println(">----------------------------------------------------<");

     }// end main
}// end class