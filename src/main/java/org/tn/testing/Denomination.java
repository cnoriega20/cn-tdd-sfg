package org.tn.testing;

public class Denomination {

    int amount;

    public Denomination(int amount) {
        this.amount = amount;
    }

    void times(int num){
        amount *= num;
    }

}
