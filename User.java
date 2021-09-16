package task2;

import java.util.Scanner;

//General user object with features all users share
public class User {
    private String username;
    private String password;
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    //Function that asks user to enter username and password
    public void userPass() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        username = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();
        
        //System.out.println(username + " " + password);
    } 
}
