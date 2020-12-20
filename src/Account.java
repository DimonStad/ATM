public class Account  
 {  
   private int accountNumber;   // account number  
   private int pin;    // PIN for authentication  
   private double availableBalance;  // funds available for withdrawal  
      // funds available + pending deposits
   // Account constructor initializes attributes  
   public Account(int theAccountNumber, int thePIN, double theAvailableBalance){
     accountNumber = theAccountNumber;  
     pin = thePIN;  
     availableBalance = theAvailableBalance;  

   }  // end Account constructor  
   // determines whether a user-specified PIN matches PIN in Account  
   public boolean validatePIN(int userPIN){  
     if(userPIN == pin){  
       return true;  // means the PIN input is match with the user's PIN  
     }  
     else{  
       return false;  // means the PIN input is not match with the user's PIN  
     }  
   }  // end method validatePIN  
   // returns available balance  
   public double getAvailableBalance(){  
     return availableBalance;  
   }  
   // returns the total balance
   public void credit(double amount){
     availableBalance += amount;   // add to total balance
   }  
   // debits an amount from the account  
   public void debit(double amount){  
     availableBalance -= amount;   // substract from available balance
   }  
   // returns account number  
   public int getAccountNumber(){  
     return accountNumber;  
   }  
   }  // end class Account