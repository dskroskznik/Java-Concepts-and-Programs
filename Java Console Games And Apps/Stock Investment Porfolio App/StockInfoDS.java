
// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.24
/*****************************************************************
 *   * LAB EXAM - 3 *                                            *
 * This program will gather and share selected information on    *
 * healthcare stocks from which decided on investmenting in.     *    
 *****************************************************************/
import java.text.NumberFormat; //import number format text class
import java.util.Map;
import java.util.HashMap;

public class StockInfoDS {

   // constructor to accept data from comapny name and number of shares
   public StockInfoDS(String compName, int compNumShares) {
      this.compName = compName; // accepts String parameter and equats to company name
      this.compNumShares = compNumShares; // accepts int parameter and equats to shares purchased
      setLabelDS(); // call private method setLabel to set company label
      setPriceDS(); // call private method setPrice to set company single stock price
   }

   // void method to determine correct company name to equal label variable
   private void setLabelDS() {
      compTicker = COMP_LABELS.getOrDefault(compName.toLowerCase(), "NA");
   }

   // void method to determine correct company name to equal price per stock
   // variable
   private void setPriceDS() {
      compPricePerStock = COMP_PRICES.getOrDefault(compName.toLowerCase(), 0.0);
   }

   // produces a developing total cost calculation by single
   // company stock price by number of shares interested
   private double calCostDS() {
      double compSharesCost; // set total shares cost by one company set by the equation
      compSharesCost = compPricePerStock * compNumShares;
      totalCost += compSharesCost; // deposit total cost of shares per company in total cost
      return compSharesCost; // returns company share cost
   }

   // static method to return total cost of all the shares among all the companies
   public static double getTotalCostDS() {
      return totalCost;
   }

   // String output prints overall purchase status for your stocks set to currency
   // format
   public String toString() {
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      return String.format("%25s %10s", compName, compTicker) + " -- " +
            String.format("%10s", nf.format(compPricePerStock))
            + String.format(" | share(s) cost: %8s", nf.format(calCostDS()));
   }

   // company information
   private String compName;
   private String compTicker;
   private double compPricePerStock;
   private int compNumShares;
   private static double totalCost;
   private static final Map<String, String> COMP_LABELS = new HashMap<String, String>();
   private static final Map<String, Double> COMP_PRICES = new HashMap<String, Double>();

   static {
      COMP_LABELS.put("CVS", "cvs health corp.");
      COMP_LABELS.put("MDNA", "moderna inc.");
      COMP_LABELS.put("PFE", "pfizer inc.");
      COMP_LABELS.put("QDEL", "quidel corp.");
      COMP_LABELS.put("XLRN", "acceleron inc.");
      COMP_LABELS.put("BIO", "bio-rad laboratories");
      COMP_LABELS.put("BIIB", "biogen inc.");
      COMP_LABELS.put("PODD", "insulet corp.");
      COMP_LABELS.put("HZNP", "horizon therapeutics plc");
      COMP_LABELS.put("VRTX", "vertex inc.");

      COMP_PRICES.put("CVS", 66.39);
      COMP_PRICES.put("MDNA", 97.61);
      COMP_PRICES.put("PFE", 36.70);
      COMP_PRICES.put("QDEL", 187.19);
      COMP_PRICES.put("XLRN", 113.54);
      COMP_PRICES.put("BIO", 569.98);
      COMP_PRICES.put("BIIB", 244.15);
      COMP_PRICES.put("PODD.", 265.24);
      COMP_PRICES.put("HZNP", 70.15);
      COMP_PRICES.put("VRTX", 215.21);
   }
}// end class