/***************************************************************                                         
 * This program will demonstrate a currency conversion         *  
 * process through user inputs and outputs using display menus *
 **************************************************************/

//classes for Dialog box panes, numerical formatting, and currency locality standards
import javax.swing.JOptionPane; 
import java.text.NumberFormat; 
import java.util.Locale;

public class CurrencyConversionApp 
{
      // conversion methods for canadian dollars, euros, and pound sterlings
      public static void convertOptionMenu() {
            JOptionPane.showMessageDialog(null, "Please Select A Currency Conversion Option By Assigned Number: \n" +
                        "  (1) - Convert to Canadian Dollars \n" +
                        "  (2) - Convert to Euros \n" +
                        "  (3) - Convert to Pound Sterling \n" +
                        " Click OK to continue for conversion selection! ");
      }

      public static String convertCanadianDollar(double currencyAmountUSD) {
            NumberFormat canadianDollar = NumberFormat.getCurrencyInstance(Locale.CANADA);
            return canadianDollar.format(currencyAmountUSD * 1.33); //change based on current rate
      }

      public static String convertEuros(double currencyAmountUSD) {
            NumberFormat euros = NumberFormat.getCurrencyInstance(Locale.GERMANY);
            return euros.format(currencyAmountUSD * 0.91); //change based on current rate
      }

      public static String convertPoundSterling(double currencyAmountUSD) {
            NumberFormat poundSterling = NumberFormat.getCurrencyInstance(Locale.UK);
            return poundSterling.format(currencyAmountUSD * 0.79); //change based on current rate
      }
      public static void main(String[] args) {

            String userInput; // for dialog box input value
            int convertOption, response; // integer numbers from user input
            double currencyUSD = 0; // initialized currency in USD

            //begin do while loop for conversion calculator
            do { 
                  //method to prompt user to select a conversion type
                  NumberFormat usd = NumberFormat.getCurrencyInstance();
                  convertOptionMenu(); // method to prompt user to select a conversion type
                  userInput = JOptionPane.showInputDialog(null, "Select A Convertion Option: ");
                  convertOption = Integer.parseInt(userInput);
                  while (convertOption < 1 || convertOption > 3) { // allows only option intergers 1 - 3
                        userInput = JOptionPane.showInputDialog(null, "Please Enter A Valid Selection for Conversion");
                        convertOption = Integer.parseInt(userInput);
                  }
                  //prompt user to sumbit valid USD currency
                  userInput = JOptionPane.showInputDialog(null, "Enter A Valid Currency Amount In USD: ");
                  currencyUSD = Double.parseDouble(userInput);
                  while (currencyUSD <= 0.00) {
                        userInput = JOptionPane.showInputDialog(null,
                                    "This Is An Invalid USD Amount, Re-Enter An Amount Larger Than Zero: ");
                        currencyUSD = Double.parseDouble(userInput);
                  } 

                  //use user convertion input to assign a conversion method
                  switch (convertOption) // assigns conversion option to a certain case and calculates in certain method
                  {
                        case 1:
                              JOptionPane.showMessageDialog(null,
                                          usd.format(currencyUSD) + " USD converted to Canadian Dollars = "
                                                      + convertCanadianDollar(currencyUSD));
                              break;
                        case 2:
                              JOptionPane.showMessageDialog(null, usd.format(currencyUSD) + " USD converted to Euros = "
                                          + convertEuros(currencyUSD));
                              break;
                        default:
                              JOptionPane.showMessageDialog(null,
                                          usd.format(currencyUSD) + " USD converted to Pounds Sterling = "
                                                      + convertPoundSterling(currencyUSD));
                              break;
                  }

                  //response variable helps set try again option
                  response = JOptionPane.showConfirmDialog(null, "Would you like to use another conversion option?",
                              "Try Again?", JOptionPane.YES_NO_OPTION);
            } while (response != JOptionPane.NO_OPTION); // allows yes option to continue the do while loop

            
      }// end main
}// end class