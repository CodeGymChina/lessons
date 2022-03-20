package org.codegym.lessons.lesson_10;

import java.io.IOException;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class BankDemo {

    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);
        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00); //400
            System.out.println("\nWithdrawing $600..."); //400< 600
            c.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(c.getBalance());
    }
}
