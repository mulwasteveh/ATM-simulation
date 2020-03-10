/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author STEVEH
 */
import java.util.Scanner;
public class ATM {
double balance;
Scanner sc = new Scanner(System.in);
public ATM(double d){
    balance =d;
  
}
public void checkbalance(){
if(balance>=10)
       {
            System.out.println("Your balance" + balance);
        }
        else
            System.out.println("Insufficient balance");
        }
public void deposit(){
    System.out.println("Enter amount to deposit");
      int amount= sc.nextInt();
      balance = balance + amount;
}
public void withdrawal(){
    System.out.println("Enter amount to withdraw");
    int amount= sc.nextInt();
    if(balance>=100){
        balance=(balance-amount-30);
        System.out.println("You have withdrawn" + amount);
    }
    else
        System.out.println("Insufficient funds");
}
public void SendMoney(){
    System.out.println("Enter phoneNo:");
    String phoneNo=sc.next();
    System.out.println("Enter amount");
    int amount= sc.nextInt();
    if(phoneNo.length()==10 && balance>=(amount+30)){
        balance = balance-(amount+30);
        System.out.println("amount sent successful");
    }
    else
        System.out.println("Incorrect phoneNo or insufficient Funds in the account");
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ATM a1 = new ATM(0.0);
        while(true){
            System.out.println("Choose 1 to check balance, 2 to deposit, 3 to withdraw,4 to send money,0 to quit");
            int choice= sc.nextInt();
            if(choice==1){
                a1.checkbalance();
            }
            else if(choice==2){
                a1.deposit();
            }
            else if(choice==3){
                a1.withdrawal();
            }
            else if(choice==4){
                a1.SendMoney();
            }
            else if(choice==0){
                System.exit(0);
            }
            else
                System.out.println("Invalid choice");
        }
    }
    
}
