package org.tn.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void testMult(){
        Denomination  denomination = new Denomination(5);
        Denomination product = denomination.times(2);
        assertEquals(10, product.amount);
        product = denomination.times(3);
        assertEquals(15, product.amount);
    }
}
