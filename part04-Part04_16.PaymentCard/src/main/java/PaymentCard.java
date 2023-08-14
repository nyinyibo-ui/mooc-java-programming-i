/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance - 2.6 >= 0) {
            this.balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.6 >= 0) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else if (amount < 0) {
            this.balance = balance;
        } else {
            this.balance += amount;

        }

    }

}
