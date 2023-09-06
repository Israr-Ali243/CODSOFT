package InternShipTask02;

import java.util.Scanner;


interface ATM{

    public void withDraw(int amount) throws Exception;
    public void deposite(int amount);
    public  void checkBalance();
}

class BankAccount implements ATM {
    int Amount=5000;
    int withdrawAmount, DepoiteAmount;
    public BankAccount() {
    }

    @Override
    public void withDraw(int amount) throws Exception {
        if(amount<=this.Amount){
            this.Amount-=amount;
            System.out.println("You Have Succefuly Withdraw: "+amount);
            System.out.println("Remaing Amount:"+ this.Amount);
        }else {
            throw new Exception("Sorry You Do ot Have Safficent Balance For This Transiction:");
        }
    }
    @Override
    public void deposite(int amount) {
        this.Amount +=amount;
        System.out.println("Your Amount "+amount+" has Been succefully deposite: ");
        System.out.println("New Amount: "+this.Amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Amount: "+ this.Amount);
    }
}


public class task01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.println("Welcome to User's Bank Limited: ");
        System.out.println("__________________________________");
        System.out.println("Menu: ");
        System.out.println("1. Check Balance: \n2.WithDraw Amount:\n3.Deposite Amount: ");
        int choice=sc.nextInt();
        switch (choice){

            case 1:
                account.checkBalance(); break;
            case 2:
                System.out.println("Enter Amount to withdraw: ");
                int amt= sc.nextInt();
                account.withDraw(amt); break;
            case 3:
                System.out.println("Enter Amount to Deposite: ");
                int dp= sc.nextInt();
                account.deposite(dp); break;
            default:
                System.out.println("INVALID INPUT: ");
        }

    }
}
