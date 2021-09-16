package task2;

import java.util.Scanner;
import java.text.DecimalFormat;

/*Object Account which holds all operations common to the accounts*/
public class Account {
    double balance = 200.539;
    
    public double amount;
    public String accountFrom;
    public String accountTo;
    
    private char currency;
    
    private int numCards;
    
    private char choice;
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    /*
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }
    
    public String getAccountFrom() {
        return accountFrom;
    }
    
    public void setAccountTo(String accountTo){
        this.accountTo = accountTo;
    }
    
    public String getAccountTo(){
        return accountTo;
    }
    */
    
    public void setCurrency(char currency) {
        this.currency = currency;
    }
    
    public char getCurrency() {
        return currency;
    }
    
    public void setNumCards(int numCards){
        this.numCards = numCards;
    }
    
    public int getNumCards(){
        return numCards;
    }
    
    //Shows user balance
    public void balance(){        
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Balance in account is: " + df.format(getBalance()));
    }
    
    //Performs transactions and shows previous transactions
    public void transaction(){
        Scanner input = new Scanner(System.in);
        
        //Enter option 1) perform 2) display
        System.out.println("Enter option\n1. Perform transaction\n2. Display transactions");
        int option = input.nextInt();
        
        //Option 1 performs transaction
        if(option == 1) {
            
            //Perform transaction
            System.out.print("Enter amount: ");
            amount = input.nextInt();
            
            System.out.print("Enter account you want to move amount from: ");
            input.nextLine();
            accountFrom = input.nextLine();
            
            System.out.print("Enter account you want to move amount to: ");
            accountTo = input.nextLine();
            
            System.out.println("Amount of " + amount + " transferred from " + accountFrom + " to " + accountTo);
        } else if (option == 2) {
            System.out.println("Previous transactions");
        }
    }
    
    //Shows user currency being used and asks user for currency 
    //being used for transfer
    public void currency(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter currency: ");
        currency = input.next().charAt(0);
        
        if (currency == '£') {
            System.out.println(currency);
        } else if (currency == '$') {
            System.out.println(currency);
        }
    }
    
    //Shows cards held by account
    public void cards(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no. of cards: ");
        numCards = input.nextInt();
        
        if (numCards == 0) {
            System.out.println("This account has no cards associated with it.");
            System.out.println("Would you like to get a card");
            choice = input.next().charAt(0);
            
            if (choice == 'Y' || choice == 'y') {
                System.out.println("You have added a new card");
            } else if (choice == 'N' || choice == 'n') {
                System.out.println("No card has been added");
            }
        } else if (numCards == 1) {
            System.out.println("This account has one card associated with it.");
        } else if (numCards >= 2) {
            System.out.println("This account has many cards associated with it.");
        }
    }
}