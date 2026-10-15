package org.example.lab4;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }
        else{
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else{
            balance -= amount;
        }
    }
}
