import java.util.*; //WildCare called for utilites package - Scanner,ArrayList,etc.

public class BankingSimulator {
   public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
         String name;
         long acctNum;
         double balance;

         // Reference Class name in Driver & create class objects
         BankAccount bankAcct1 = new BankAccount("Dylan", 2896091, 333.33);
         BankAccount bankAcct2 = new BankAccount();

         // "call" toString by passing object thru println
         System.out.println(bankAcct1);
         System.out.println(bankAcct2);

         System.out.println("Enter a name for new account: ");
         name = scan.nextLine();

         System.out.println("Enter new account number: ");
         acctNum = scan.nextLong();

         System.out.println("Enter new account balance: ");
         balance = scan.nextDouble();

         // use mutators to update data in 'bankAcct2'
         bankAcct2.setName(name);
         bankAcct2.setAcctNum(acctNum);
         bankAcct2.setBalance(balance);

         // use accessor to verify name of account holder of 'bankAcct2'
         System.out.println("The account holder's name is " + bankAcct2.getName());
         System.out.println(bankAcct2);

         // uses of deposit, support method
         bankAcct1.deposit(750);
         System.out.println("After deposit, balance in " + bankAcct1.getName()
               + "'s account is " + bankAcct1.getBalance());
         System.out.println(bankAcct1);
         System.out.println("After deposit, balance in " + bankAcct2.getName()
               + "'s account is " + bankAcct2.getBalance());
         System.out.println(bankAcct2);

         // uses of withdraw, support method, on 'bankAcct2'
         System.out.println("Enter amount to withdraw: ");
         balance = scan.nextDouble();

         bankAcct2.withdraw(balance);
         System.out.println("After withdrawl, balance in " + bankAcct2.getName()
               + "'s account is " + bankAcct2.getBalance());
      }

      System.out.println("This code provided information on " + BankAccount.accountCount() + " banks accounts.");
   }// end main
}// end class