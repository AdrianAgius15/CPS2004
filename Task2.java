package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int option;
     
        Account a = new Account();
        
        a.balance();
        //Enter option 1) perform 2) display
        //System.out.println("Enter option\n1. Perform transaction\n2. Display transactions");
        //option = input.nextInt();
        //a.transaction(option);
        //a.currency();
        //a.cards();
        
        Savings s = new Savings();
        
        s.balance();
        s.interest();
        s.maxTransactions();
        
        Account a2 = new Savings();
        a2.cards();
                
        //s.say();
        //s.bye();
        
    }
}