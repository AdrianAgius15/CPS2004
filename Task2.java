package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int option;
        
        Admin ad = new Admin();
        //ad.deleteAccount();
        //ad.approveAccount();
        //ad.approveCard();
        //ad.deleteCard();
        //r.accessAccount();
        
        //System.out.println(u.getUsername() + " " + u.getPassword());
     
        Account a = new Account();
        
        //a.balance();
        //a.transaction();
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
        
        
        Current c = new Current();
        //c.cardsAssociated();
        //c.lowCredit();
    }
}