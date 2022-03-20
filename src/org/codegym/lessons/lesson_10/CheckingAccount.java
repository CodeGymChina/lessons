package org.codegym.lessons.lesson_10;

import java.io.IOException;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class CheckingAccount {

    private final int number;
    //balance为余额，number为卡号
    private double balance;

    public CheckingAccount(int number) {
        this.number = number;
    }

    //方法：存钱
    public void deposit(double amount) {
        balance += amount;
    }

    //方法：取钱
    public void withdraw(double amount) throws InsufficientFundsException, IOException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    //方法：返回余额
    public double getBalance() {
        return balance;
    }

    //方法：返回卡号
    public int getNumber() {
        return number;
    }
}
