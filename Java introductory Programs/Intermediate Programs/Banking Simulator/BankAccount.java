import java.text.NumberFormat;

public class BankAccount
{
   //BANK ACCOUNT CLASS!
   //data (attributes)
   private String name;
   private long acctNumber;
   private double balance;
    
   private final double RATE = 0.035; //3.5%
   private final double FEE = 1.50; //added interest
   
   //static variable
   private static int count = 0;   
 //Methods (operations):

   //constructor here (MUST HAVE SAME NAME AS CLASS)
   public BankAccount(String owner, long accountNum, double bal)
   {
      name = owner;
      acctNumber = accountNum;
      balance = bal;
      count++;
   }
   
   //overload a constructor
   public BankAccount()
   {
      name = "New ";
      acctNumber = 0;
      balance = 0.0;
      count++;
   }
   
   public static int accountCount()
   {
      return count;
   }
   
   //accessor methods (getters)
   public String getName()
   {
      return name;
   }
   
   public long getAcctNum()
   {
      return acctNumber;
   }
   
   public String getBalance()
   {
      NumberFormat nmf = NumberFormat.getCurrencyInstance();
      return nmf.format(balance);
   }
   
   //mutator methods (setters)
   public void setName(String n)
   {
      name = n;
   }
   
   public void setAcctNum(long ac)
   {
      acctNumber = ac;
   }
   
   public void setBalance(double b)
   {
      balance = b;
   }
   
 //relevant class methods invoke:
   //services class = public
   public double deposit(double amt) 
   {
      balance = amt + balance;
      return balance;  
   }
      
   public double withdraw(double amt)
   {
      balance = balance - amt - FEE;
      return balance;
   }
   
   //support method = private
   private void addInterest()
   {
      balance = balance + (balance * RATE);
   }   
   
   //toString - return description of object as String
   public String toString()
   {
      addInterest();
      NumberFormat nmf = NumberFormat.getCurrencyInstance();
      return String.format("%-7s", name) + String.format("%-10d", acctNumber) 
                              + String.format("%-7s", nmf.format(balance));
   }
   
}//end class














  
