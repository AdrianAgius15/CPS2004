package task2;

//Object Regular user which shares features 

import java.util.Scanner;

//with general user has distinct features
public class Regular extends User {
  
    public void openAccount(){
        //Sends request to approve new account
        System.out.println("Please wait for admin to approve account");
    }
    
    public void closeAccount(){
        //Sends request to delete account
        System.out.println("Please wait for admin to delete account");
    }
    
    //Applies for new card
    public void applyCard(){
        //Sends request to approve new card
        System.out.println("Please wait for admin to approve new card");
    }
    
    //Requests for old card to be removed
    public void removeCard(){
        //Sends request to delete card
        System.out.println("Please wait for admin to delete card");
    }
    
}
