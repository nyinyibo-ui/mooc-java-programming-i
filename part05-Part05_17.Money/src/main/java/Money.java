
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    // add the euros and cents 
    public Money plus(Money addition) {

        // since variables of Money class is immutable we need to create variables to store the values      
        int originCents = this.cents();
        int originEuros = this.euros;
        int addedCents = addition.cents();
        int addedEuros = addition.euros();

        Money newMoney = new Money(originEuros + addedEuros, originCents + addedCents);

        return newMoney;
    }

    // return Money object with subtracted euros and cents from the original Money
    public Money minus(Money decreaser) {
        int subtractEuros = this.euros - decreaser.euros;
        int subtractCents = this.cents - decreaser.cents;

        // proceed calcultion only if the subtracted euros is positive
        if (subtractEuros >= 0) {
            // if subtract cents is negative take a one unit from euros 
            if (subtractCents < 0) {
                subtractEuros = subtractEuros - 1;
                subtractCents = subtractCents + 100;
            }

        } // if the subtract euros is negative it shouldn't be calculated and return the values as zero;
        else {
            subtractEuros = 0;
            subtractCents = 0;
        }

        //create new money object
        Money newMoney = new Money(subtractEuros, subtractCents);

        return newMoney;

    }

    
    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }

        if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
