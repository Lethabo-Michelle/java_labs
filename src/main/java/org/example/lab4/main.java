package org.example.lab4;

public class main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("lethabo",123456, 2000);
        acc.withdraw(200);
        acc.withdraw(-200);
        acc.withdraw(0);
        acc.withdraw(1800);
        System.out.println();

        Rectangle rec = new Rectangle(2,5);
        rec.perimeter();
    }
}
