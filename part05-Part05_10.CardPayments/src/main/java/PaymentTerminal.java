
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        if (payment >= 2.5) {
            this.money += 2.5;
            double change = payment - 2.5;
            this.affordableMeals++;
            return (change);
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        if (payment >= 4.3) {
            this.money += 4.3;
            double change = payment - 4.3;
            this.heartyMeals++;
            return (change);
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        boolean wasSuccessful = card.takeMoney(2.5);
        if (wasSuccessful) {
            this.affordableMeals++;
        }
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        return wasSuccessful;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        boolean wasSuccessful = card.takeMoney(4.3);
        if (wasSuccessful) {
            this.heartyMeals++;
        }
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        return wasSuccessful;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // negative amount should not change the balance and money;
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }else{
            card.addMoney(0);
            this.money+=0;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
