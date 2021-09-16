package task2;

import java.util.Scanner;

public class Admin extends User {
    
    public char choice;
    
    //Approves new account
    public void approveAccount() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to approve account? Y/N");
        choice = input.next().charAt(0);
        
        do { 
            if ((choice == 'Y') || (choice == 'y')) {
                System.out.println("Account approved");
            } else if ((choice == 'N') || (choice == 'n')) {
                System.out.println("Account declined");
            } else {
                System.out.print("Invalid input. Enter Y/N: ");
                choice = input.next().charAt(0);
                
                if ((choice == 'Y') || (choice == 'y')) {
                    System.out.println("Account approved");
                } else if ((choice == 'N') || (choice == 'n')) {
                    System.out.println("Account declined");
                }
            }
        } while ((choice != 'Y') && (choice != 'y') 
                && (choice != 'N') && (choice != 'n'));
    }
    
    //Approves deletion of account
    public void deleteAccount() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to delete account? Y/N");
        choice = input.next().charAt(0);
        
        do { 
            if ((choice == 'Y') || (choice == 'y')) {
                System.out.println("Account deleted");
            } else if ((choice == 'N') || (choice == 'n')) {
                System.out.println("Account not deleted");
            } else {
                System.out.print("Invalid input. Enter Y/N: ");
                choice = input.next().charAt(0);
            
                if ((choice == 'Y') || (choice == 'y')) {
                    System.out.println("Account deleted");
                } else if ((choice == 'N') || (choice == 'n')) {
                    System.out.println("Account not deleted");
                }
            }
        } while((choice != 'Y') && (choice != 'y') 
                && (choice != 'N') && (choice != 'n'));
    }
    
    //Approves new card
    public void approveCard() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to approve card? Y/N");
        choice = input.next().charAt(0);
        
        do { 
            if ((choice == 'Y') || (choice == 'y')) {
                System.out.println("Card approved");
            } else if ((choice == 'N') || (choice == 'n')) {
                System.out.println("Card declined");
            } else {
                System.out.print("Invalid input. Enter Y/N: ");
                choice = input.next().charAt(0);
                
                if ((choice == 'Y') || (choice == 'y')) {
                    System.out.println("Card approved");
                } else if ((choice == 'N') || (choice == 'n')) {
                    System.out.println("Card declined");
                }
            }
        } while((choice != 'Y') && (choice != 'y') 
                && (choice != 'N') && (choice != 'n'));
    }
    
    //Deletes card
    public void deleteCard() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to delete card? Y/N");
        choice = input.next().charAt(0);
        
        do { 
            if ((choice == 'Y') || (choice == 'y')) {
                System.out.println("Card deleted");
            } else if ((choice == 'N') || (choice == 'n')) {
                System.out.println("Card not deleted");
            } else {
                System.out.print("Invalid input. Enter Y/N: ");
                choice = input.next().charAt(0);
                
                if ((choice == 'Y') || (choice == 'y')) {
                    System.out.println("Card deleted");
                } else if ((choice == 'N') || (choice == 'n')) {
                    System.out.println("Card not deleted");
                }
            }
        } while((choice != 'Y') && (choice != 'y') 
                && (choice != 'N') && (choice != 'n'));
    }
}
