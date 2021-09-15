package task2;

import java.util.Scanner;
import java.text.DecimalFormat;

/*Object Account which holds all operations common to the accounts*/
public class Account {
    public double balance = 200.539;
    
    public int amount;
    public String accountFrom;
    public String accountTo;
    
    public char currency;
    
    public int numCards;
    
    public char choice;
    
    //Shows user balance
    public void balance(){        
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Balance in account is: " + df.format(balance));
    }
    
    //Performs transactions and shows previous transactions
    public void transaction(int option){
        Scanner input = new Scanner(System.in);
        
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