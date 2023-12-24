// Dylan Skroskznik - #U57843452
// COP2510.004 - Oct.22


import javax.swing.JOptionPane; //class for Dialog Boxes
import java.text.NumberFormat;
import java.util.Locale;

public class Program12
{

  public static void main (String [] secondhalf)
   {      
      String input; //for reading input in  Dialog Box
      
      String name;
      int hours;
      double payRate, grossPay;
      
      //create a NumberFormat object
      //NumberFormat nf = NumberFormat.getCurrencyInstance();
      
      
      //for different currency formats, enter Locale.[insert country name in UPPERCASE]
      //for example: the syntax below will result in output in yen
      NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
      
      //Get user's name
      name = JOptionPane.showInputDialog("What is your name?");
      
      //Get hours
      input = JOptionPane.showInputDialog("How many hours did " +
                                          "you work this week?");
      
      //Convert String to an int
      //Wrapper class allows primitive types to be managed as objects
      hours = Integer.parseInt(input);      
      
      //Get payrate
      input = JOptionPane.showInputDialog("What is your payrate?");
      
      //Convert String to double
      payRate = Double.parseDouble(input);
      
      //Calculate the gross pay
      grossPay = hours + payRate;
      
     //Display Results
      JOptionPane.showMessageDialog(null, "Hello " + name + ". \n Your gross pay is " + 
                                     nf.format(grossPay));  
         
      //Confirm Dialog box
      int response;            
      // response = JOptionPane.showInputDialog(null, "Do you want to continue?");
      
      //Overloaded Version
      response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", 
                                                "Choose now!", JOptionPane.YES_NO_OPTION);
      
      //Explicity end program
      System.exit(0);
      
      
      
      
            
   }//end main
}//end class