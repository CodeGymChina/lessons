package org.codegym.lessons.lesson_10;

/**
 * @author JC Liu
 * @date 2022/3/19$
 */
public class InsufficientFundsException extends Exception {

    private final double amount;

    public InsufficientFundsException(double amount) {
        super("the current amount is " + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
