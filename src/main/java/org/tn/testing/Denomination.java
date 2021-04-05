package org.tn.testing;

public abstract class Denomination {
    protected  int amount;

    public abstract Denomination times(int multiplier);
    public static Dollar createDollar(int amount){
        return new Dollar(amount);
    }

    public static Franc createFranc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object){
        Denomination d = (Denomination) object;
        return amount == d.amount
                 && this.getClass().equals(object.getClass());
    }
}
