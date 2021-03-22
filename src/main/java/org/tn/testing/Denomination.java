package org.tn.testing;

public class Denomination {

    int amount;

    public Denomination(int amount) {
        this.amount = amount;
    }

    Denomination times(int num){

        return new Denomination(amount * num);
    }

}
