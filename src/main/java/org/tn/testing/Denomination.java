package org.tn.testing;

public class Denomination {

    int amount;

    public Denomination(int amount) {
        this.amount = amount;
    }

    Denomination times(int num){

        return new Denomination(amount * num);
    }

    public boolean equals(Object object){
        Denomination d = (Denomination) object;
        return amount == d.amount;
    }
}
