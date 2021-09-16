package task2;

import java.util.Scanner;

/*Object Current extends Object Account and adds 
functionality to the accounts exclusive to current 
accounts*/
public class Current extends Account {
    public String cardAssociated; 
    public int minAmount = 300;
    
    //Card associated with account
    public void cardsAssociated(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter associated card: ");
        cardAssociated = input.nextLine();
        
        System.out.println("Associated card: " + cardAssociated);
        
        
    }
    
    //Requires minimum amount in account
    public void lowCredit(){
        if (balance < minAmount){
            System.out.println("Your current account is running low on credit");
        }
    }
}
