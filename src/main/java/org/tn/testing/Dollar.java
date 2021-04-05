package org.tn.testing;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int num){

        return new Dollar(amount * num);
    }

    public boolean equals(Object object){
        Dollar d = (Dollar) object;
        return amount == d.amount;
    }
}
