package task2;

import java.text.DecimalFormat;

/*Object Savings extends Object Account and adds 
functionality to the accounts exclusive to savings 
accounts*/
public class Savings extends Account {
    public int MAX = 5;
    public int numTransactions = 10;
    //Adds interest
    public void interest() {
        balance += balance * 0.02;
        
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Balance updated with interest: " + df.format(balance));
    }
    
    //Permits a max no. of transactions
    public void maxTransactions() {
        if (numTransactions > MAX) {
            System.out.println("You have exceeded the no. of transactions allowed");
        }
    }
}
