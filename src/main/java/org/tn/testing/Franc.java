package org.tn.testing;

public class Franc extends Denomination{

    public Franc(int amount) {
        this.amount = amount;
    }

    Denomination times( int multiplier) {
        return new Franc(amount * multiplier);
    }
}
