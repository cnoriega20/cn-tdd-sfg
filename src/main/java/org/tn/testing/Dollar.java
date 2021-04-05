package org.tn.testing;

public class Dollar extends Denomination{


    public Dollar(int amount) {
        this.amount = amount;
    }

    public Denomination times(int num){

        return new Dollar(amount * num);
    }

}
