package org.tn.testing;

public class Denomination {
    protected  int amount;

    public boolean equals(Object object){
        Denomination d = (Denomination) object;
        return amount == d.amount;
    }
}
